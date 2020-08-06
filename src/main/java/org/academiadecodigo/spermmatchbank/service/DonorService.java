package org.academiadecodigo.spermmatchbank.service;

import org.academiadecodigo.spermmatchbank.model.Donor;
import org.academiadecodigo.spermmatchbank.model.Product;

import java.util.List;

/**
 * Created by codecadet on 05/08/2020.
 */
public interface DonorService {

    Donor get(Integer id);


    List<Donor> listDonors();


    void save(Donor donor);

    void update(Donor donor);

    Product createProduct(Donor donor, Product product);










}
