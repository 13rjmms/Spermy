package org.academiadecodigo.spermmatchbank.model;

/**
 * Created by codecadet on 05/08/2020.
 */
public abstract class ProductAbstract {

    private int id;
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


    public void setNumberSamples(int numberSamples) {
        this.numberSamples = numberSamples;
    }
}
