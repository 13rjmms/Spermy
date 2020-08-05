package org.academiadecodigo.spermmatchbank.service;

import org.academiadecodigo.spermmatchbank.model.Consumer;
import org.academiadecodigo.spermmatchbank.model.Donor;
import org.academiadecodigo.spermmatchbank.model.Product;

import java.util.List;

/**
 * Created by codecadet on 05/08/2020.
 */
public interface ProductService {

    Product get(Integer id);

    List<Product> listProducts();

    void save(Product product);

    void update(Product product);




}
