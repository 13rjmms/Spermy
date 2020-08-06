package org.academiadecodigo.spermmatchbank.model;

/**
 * Created by codecadet on 05/08/2020.
 */
public class Consumer extends DonorConsumerAbstract {
    public String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
