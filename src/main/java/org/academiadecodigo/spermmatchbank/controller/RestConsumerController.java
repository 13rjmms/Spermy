package org.academiadecodigo.spermmatchbank.controller;

import org.academiadecodigo.spermmatchbank.converters.Convertor;
import org.academiadecodigo.spermmatchbank.dtos.DtoConsumer;
import org.academiadecodigo.spermmatchbank.model.Consumer;
import org.academiadecodigo.spermmatchbank.service.ConsumerService;
import org.academiadecodigo.spermmatchbank.service.ConsumerServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
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
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/consumer")
public class RestConsumerController {


    private ConsumerService consumerService;






    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public ResponseEntity<List<DtoConsumer>> listConsumer() {

        List<DtoConsumer> dtoConsumers = new ArrayList<>();

        for (Consumer consumer : consumerService.listConsumers()) {
            dtoConsumers.add(Convertor.consumerToDtoConsumer(consumer));
        }

        return new ResponseEntity<>(dtoConsumers, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<DtoConsumer> showConsumer(@PathVariable Integer id){
        return new ResponseEntity<>(Convertor.consumerToDtoConsumer(consumerService.get(id)), HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.POST, path = {"/", ""})
    public ResponseEntity<?> addConsumer(@RequestBody DtoConsumer dtoConsumer){

        Consumer consumer = Convertor.dtoConsumerToConsumer(dtoConsumer);

        consumerService.save(consumer);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @RequestMapping(method = RequestMethod.POST, path = "/{id}")
    public ResponseEntity<?> updateConsumer(@RequestBody DtoConsumer dtoConsumer) {

        Consumer consumer = Convertor.dtoConsumerToConsumer(dtoConsumer);

        consumerService.update(consumer);

        return new ResponseEntity<>(HttpStatus.OK);
    }









    public ConsumerService getConsumerService() {
        return consumerService;
    }

    @Autowired
    public void setConsumerService(ConsumerService consumerService) {
        this.consumerService = consumerService;
    }


}
