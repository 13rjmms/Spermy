package org.academiadecodigo.spermmatchbank.authentication;

import org.academiadecodigo.spermmatchbank.model.Consumer;

import java.util.HashMap;
import java.util.Map;

public class User {

    private static Map<String, Consumer> userList = new HashMap<>();


    public static void createUser(String username, Consumer consumer){

        userList.put(username, consumer);

    }



    public static Map<String, Consumer> getUserLists() {
        return userList;
    }


}
