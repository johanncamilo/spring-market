package com.spring_market.persistence;

import com.spring_market.persistence.crud.ProductoCrudRepository;
import com.spring_market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
