package org.academiadecodigo.spermmatchbank.converters;

import org.academiadecodigo.spermmatchbank.dtos.DtoConsumer;
import org.academiadecodigo.spermmatchbank.dtos.DtoDonor;
import org.academiadecodigo.spermmatchbank.dtos.DtoProduct;
import org.academiadecodigo.spermmatchbank.model.Consumer;
import org.academiadecodigo.spermmatchbank.model.Donor;
import org.academiadecodigo.spermmatchbank.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Convertor {

    public static DtoDonor donorToDtoDonor(Donor donor) {

        DtoDonor dtoDonor = new DtoDonor();


        dtoDonor.setId(donor.getId());
        dtoDonor.setFirstName(donor.getFirstName());
        dtoDonor.setLastName(donor.getLastName());
        dtoDonor.setAge(donor.getAge());
        dtoDonor.setAddress(donor.getAddress());
        dtoDonor.setCity(donor.getCity());
        dtoDonor.setCountry(donor.getCountry());
        dtoDonor.setBi(donor.getBi());
        dtoDonor.setBloodType(donor.getBloodType());
        dtoDonor.setEmail(donor.getEmail());
        dtoDonor.setEyeColor(donor.getEyeColor());
        dtoDonor.setHairColor(donor.getHairColor());
        dtoDonor.setGender(donor.getGender());
        dtoDonor.setPhone(donor.getPhone());
        dtoDonor.setRace(donor.getRace());
        dtoDonor.setNacionality(donor.getNacionality());
        dtoDonor.setWeight(donor.getWeight());
        dtoDonor.setImgURL(donor.getImgURL());
        dtoDonor.setProductList(donor.getProductList());
        dtoDonor.setNumberSamples(donor.getNumberSamples());
        dtoDonor.setBio(donor.getBio());

        return dtoDonor;
    }

    public static Donor dtoDonorToDonor(DtoDonor dtoDonor) {

        Donor donor = new Donor();


        donor.setId(dtoDonor.getId());
        donor.setFirstName(dtoDonor.getFirstName());
        donor.setLastName(dtoDonor.getLastName());
        donor.setAge(dtoDonor.getAge());
        donor.setAddress(dtoDonor.getAddress());
        donor.setCity(dtoDonor.getCity());
        donor.setCountry(dtoDonor.getCountry());
        donor.setBi(dtoDonor.getBi());
        donor.setBloodType(dtoDonor.getBloodType());
        donor.setEmail(dtoDonor.getEmail());
        donor.setEyeColor(dtoDonor.getEyeColor());
        donor.setHairColor(dtoDonor.getHairColor());
        donor.setGender(dtoDonor.getGender());
        donor.setPhone(dtoDonor.getPhone());
        donor.setRace(dtoDonor.getRace());
        donor.setNacionality(dtoDonor.getNacionality());
        donor.setWeight(dtoDonor.getWeight());
        donor.setImgURL(dtoDonor.getImgURL());
        donor.setProductList(dtoDonor.getProductList());
        donor.setNumberSamples(dtoDonor.getNumberSamples());
        donor.setBio(dtoDonor.getBio());

        return donor;
    }

    public static DtoConsumer consumerToDtoConsumer(Consumer consumer) {

        DtoConsumer dtoConsumer = new DtoConsumer();

        dtoConsumer.setId(consumer.getId());
        dtoConsumer.setBi(consumer.getBi());
        dtoConsumer.setFirstName(consumer.getFirstName());
        dtoConsumer.setLastName(consumer.getLastName());
        dtoConsumer.setAge(consumer.getAge());
        dtoConsumer.setGender(consumer.getGender());
        dtoConsumer.setEmail(consumer.getEmail());
        dtoConsumer.setPhone(consumer.getPhone());
        dtoConsumer.setAddress(consumer.getAddress());
        dtoConsumer.setCountry(consumer.getCountry());
        dtoConsumer.setCity(consumer.getCity());

        return dtoConsumer;
    }

    public static Consumer dtoConsumerToConsumer(DtoConsumer dtoConsumer) {

        Consumer consumer = new Consumer();

        consumer.setId(dtoConsumer.getId());
        consumer.setBi(dtoConsumer.getBi());
        consumer.setFirstName(dtoConsumer.getFirstName());
        consumer.setLastName(dtoConsumer.getLastName());
        consumer.setAge(dtoConsumer.getAge());
        consumer.setGender(dtoConsumer.getGender());
        consumer.setEmail(dtoConsumer.getEmail());
        consumer.setPhone(dtoConsumer.getPhone());
        consumer.setAddress(dtoConsumer.getAddress());
        consumer.setCountry(dtoConsumer.getCountry());
        consumer.setCity(dtoConsumer.getCity());

        return consumer;
    }

    public static DtoProduct productToDtoProduct(Product product) {

        DtoProduct dtoProduct = new DtoProduct();

        dtoProduct.setId(product.getId());

        return dtoProduct;
    }

    public static Product dtoProductToProduct (DtoProduct dtoProduct) {

        Product product = new Product();

        product.setId(dtoProduct.getId());

        return product;
    }

}
