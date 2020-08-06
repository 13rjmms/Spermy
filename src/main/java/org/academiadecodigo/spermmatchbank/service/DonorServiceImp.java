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
        d1.setBloodType("A+");
        d1.setEyeColor("Blue");
        d1.setHairColor("Red");
        d1.setImgURL("https://image.shutterstock.com/image-photo/portrait-stylish-midget-mc-headphones-260nw-1247042659.jpg");
        d1.setBi("123123123");
        d1.setLastName("Midget");
        d1.setAge(18);
        d1.setBio("Supp bitches");
        d1.setGender("Male");
        d1.setEmail("yo@m.com");
        d1.setPhone("123123123");
        d1.setAddress("fucket");
        d1.setCountry("Pt");
        d1.setCity("Lisboa");
        d1.setNacionality("PT");
        d1.setWeight("90");

        d2.setId(2);
        d2.setNacionality("Russian");
        d2.setRace("Gypsy");
        d2.setFirstName("Outro");
        d2.setBloodType("B+");
        d2.setEyeColor("Black");
        d2.setHairColor("Black");
        d2.setImgURL("https://image.shutterstock.com/image-photo/portrait-stylish-midget-mc-headphones-260nw-1247042659.jpg");
        d2.setBi("123123123");
        d2.setLastName("Midget");
        d2.setAge(20);
        d2.setBio("Mekie boss");
        d2.setGender("Male");
        d2.setEmail("yo@m.com");
        d2.setPhone("123123123");
        d2.setAddress("fucket2");
        d2.setCountry("Pt");
        d2.setCity("POrto");
        d2.setNacionality("PT");
        d2.setWeight("200");

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
        donor.setNumberSamples(donor.getProductList().size());

        productService.getListProducts().add(product);

        return product;
    }

    @Autowired
    public void setProductService(ProductServiceImp productService) {
        this.productService = productService;
    }
}
