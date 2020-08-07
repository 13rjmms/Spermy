package org.academiadecodigo.spermmatchbank.authentication;

import java.util.HashMap;
import java.util.Map;


public class UserLogin implements UserLoginInterface {

    private static Map<String, Integer> userList = new HashMap<>();


    public void setUserLogin (String username, String password){
        userList.put(username, password.hashCode());
    }


    public boolean getUserLogin (String username, String password) {
        return (userList.get(username) == password.hashCode());
    }



}
