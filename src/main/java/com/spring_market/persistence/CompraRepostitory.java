package com.spring_market.persistence;

import com.spring_market.domain.Purchase;
import com.spring_market.domain.repository.PurchaseRepository;
import com.spring_market.persistence.crud.CompraCrudRepository;
import com.spring_market.persistence.entity.Compra;
import com.spring_market.persistence.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CompraRepostitory implements PurchaseRepository {
    @Autowired
    private CompraCrudRepository compraCrudRepository;

    @Autowired
    private PurchaseMapper mapper;

    @Override
    public List<Purchase> getAll() {
        return mapper.toPurchases((List<Compra>) compraCrudRepository.findAll());
    }

    @Override
    public Optional<List<Purchase>> getByClient(String clientId) {
        return compraCrudRepository.findByIdCliente(clientId)
                .map(compras -> mapper.toPurchases(compras));
    }

    @Override
    public Purchase save(Purchase purchase) {
        Compra compra = mapper.toCompra(purchase);

        /*
          grantizar q la info se guarde en cascada (modificar relación en la entidad Compra)
          para eso compra debe  conocer los productos
          y los productos deben conocer a que compra pertenecen
          con el foreach se le "dice" a cada producto a que compra pertenecen
         */
        compra.getProductos().forEach(producto -> producto.setCompra(compra));

        return mapper.toPurchase(compraCrudRepository.save(compra));
    }
}
