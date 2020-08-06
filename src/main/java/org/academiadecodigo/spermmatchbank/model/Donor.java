package org.academiadecodigo.spermmatchbank.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codecadet on 05/08/2020.
 */
public class Donor extends DonorConsumerAbstract {

    private String race;
    private String hairColor;
    private String eyeColor;
    private String nacionality;
    private String weight;
    private String bloodType;
    private String imgURL;
    private List<Product> productList = new ArrayList<>();
    private int numberSamples;


    public int getNumberSamples() {
        return numberSamples;
    }

    public String getImgURL() {
        return imgURL;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }


    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public void setNumberSamples(int numberSamples) {
        this.numberSamples = numberSamples;
    }
}
