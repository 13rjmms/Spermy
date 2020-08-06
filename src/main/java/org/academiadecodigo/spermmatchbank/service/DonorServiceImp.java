package org.academiadecodigo.spermmatchbank.service;

import org.academiadecodigo.spermmatchbank.model.Consumer;
import org.academiadecodigo.spermmatchbank.model.Donor;
import org.academiadecodigo.spermmatchbank.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codecadet on 05/08/2020.
 */
@Service
public class DonorServiceImp implements DonorService{

    private List<Donor> listDonors = new ArrayList<>();
    private ProductServiceImp productService;
    private Donor d1 = new Donor();
    private Donor d2 = new Donor();



    public DonorServiceImp(){

        d1.setId(1);
        d1.setNacionality("Portuguese");
        d1.setRace("Yellow");
        d1.setFirstName("Nuno");

        d2.setId(2);
        d2.setNacionality("Russian");
        d2.setRace("Gypsy");
        d2.setFirstName("Diogo");

        listDonors.add(d1);
        listDonors.add(d2);



    }



    @Override
    public Donor get(Integer id) {
        return listDonors.get(id - 1);
    }

    @Override
    public List<Donor> listDonors() {
        return listDonors;
    }

    @Override
    public void save(Donor donor) {
        listDonors.add(donor);
    }

    @Override
    public void update(Donor donor) {

        int id = donor.getId();

        listDonors.remove(id - 1);

        listDonors.add(id - 1, donor);

    }

    @Override
    public Product createProduct(Donor donor, Product product) {

        donor.getProductList().add(product);

        productService.getListProducts().add(product);

        return product;
    }

    @Autowired
    public void setProductService(ProductServiceImp productService) {
        this.productService = productService;
    }
}
