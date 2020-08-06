package org.academiadecodigo.spermmatchbank.dtos;

import org.academiadecodigo.spermmatchbank.model.Product;

import java.util.ArrayList;
import java.util.List;

public class DtoDonor {

    private Integer id;
    private String bi;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String bio;
    private String email;
    private String phone;
    private String address;
    private String country;
    private String city;
    private String race;
    private String hairColor;
    private String eyeColor;
    private String nacionality;
    private String weight;
    private String bloodType;
    private String imgURL;
    private List<Product> productList = new ArrayList<>();
    private int numberSamples;


    public String getBio() {
        return bio;
    }

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
    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
