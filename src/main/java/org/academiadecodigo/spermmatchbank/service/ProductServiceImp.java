package org.academiadecodigo.spermmatchbank.service;

import org.academiadecodigo.spermmatchbank.model.Donor;
import org.academiadecodigo.spermmatchbank.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codecadet on 05/08/2020.
 */

@Service
public class ProductServiceImp implements ProductService {

    private List<Product> listProducts = new ArrayList<>();



    @Override
    public Product get(Integer id) {
        return listProducts.get(id -1);
    }

    @Override
    public List<Product> listProducts() {
        return listProducts;
    }

    @Override
    public void save(Product product) {
        listProducts.add(product);

    }

    @Override
    public void update(Product product) {
        int id = product.getId();

        listProducts.remove(id - 1);

        listProducts.add(id -1, product);
    }

    public List<Product> getListProducts() {
        return listProducts;
    }


}
