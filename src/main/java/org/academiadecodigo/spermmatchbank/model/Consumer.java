package org.academiadecodigo.spermmatchbank.model;

/**
 * Created by codecadet on 05/08/2020.
 */
public class Consumer extends DonorConsumerAbstract {
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
