package org.academiadecodigo.spermmatchbank.service;

import org.academiadecodigo.spermmatchbank.model.Consumer;

import java.util.List;

/**
 * Created by codecadet on 05/08/2020.
 */
public interface ConsumerService {


    Consumer get(Integer id);


    List<Consumer> listConsumers();


    void save(Consumer consumer);

    void update(Consumer consumer);











}
