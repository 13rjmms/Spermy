package org.academiadecodigo.spermmatchbank.service;

import org.academiadecodigo.spermmatchbank.model.Consumer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codecadet on 05/08/2020.
 */
@Service
public class ConsumerServiceImp implements ConsumerService {

    private List<Consumer> listConsumer = new ArrayList<>();
    private Consumer c1 = new Consumer();
    private Consumer c2 = new Consumer();

    public ConsumerServiceImp(){

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


    @Override
    public Consumer get(Integer id) {
        return listConsumer.get(id - 1);
    }

    @Override
    public List<Consumer> listConsumers() {
        return listConsumer;
    }

    @Override
    public void save(Consumer consumer) {

        listConsumer.add(consumer);
    }

    @Override
    public void update(Consumer consumer) {

        int id = consumer.getId();

        listConsumer.remove(id - 1);

        listConsumer.add(id - 1, consumer);

    }
}
