package org.academiadecodigo.spermmatchbank.model;

/**
 * Created by codecadet on 05/08/2020.
 */
public abstract class ProductAbstract {

    private int id;
    private String race;
    private String hairColor;
    private String eyeColor;
    private String nacionality;
    private int age;
    private String weight;
    private String bloodType;
    private int numberSamples;

    public int getNumberSamples() {
        return numberSamples;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public void setNumberSamples(int numberSamples) {
        this.numberSamples = numberSamples;
    }
}
