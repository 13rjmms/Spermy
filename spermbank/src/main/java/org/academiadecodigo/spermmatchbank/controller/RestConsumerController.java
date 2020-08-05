package org.academiadecodigo.spermmatchbank.controller;

import org.academiadecodigo.spermmatchbank.model.Consumer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by codecadet on 05/08/2020.
 */

@RestController
@RequestMapping("/api/consumer")
public class RestConsumerController {

    private List<Consumer> listConsumer = new ArrayList<>();
    private Consumer c1 = new Consumer();
    private Consumer c2 = new Consumer();



    public RestConsumerController(){

        c1.setFirstName("Rafa");
        c1.setAge(22);
        c1.setLastName("Moreira");
        c1.setEmail("13rjmms@gmail.com");
        c1.setId(1);

        c2.setFirstName("Miles");
        c2.setAge(22);
        c2.setLastName("Moreira");
        c2.setEmail("13rjmms@gmail.com");
        c2.setId(2);

        listConsumer.add(c1);
        listConsumer.add(c2);




    }



    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public ResponseEntity<List<Consumer>> listConsumer() {
        return new ResponseEntity<>(listConsumer, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<Consumer> showConsumer(@PathVariable Integer id){
        return new ResponseEntity<>(listConsumer.get(id), HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.POST, path = {"/", ""})
    public ResponseEntity<?> addConsumer(@RequestBody Consumer consumer){

        listConsumer.add(consumer);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    //@RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
//    public ResponseEntity<Consumer> deleteConsumer


















    public void setListConsumer(List<Consumer> listConsumer) {
        this.listConsumer = listConsumer;
    }
}
