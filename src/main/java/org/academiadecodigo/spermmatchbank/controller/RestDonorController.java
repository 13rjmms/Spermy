package org.academiadecodigo.spermmatchbank.controller;

import org.academiadecodigo.spermmatchbank.converters.Convertor;
import org.academiadecodigo.spermmatchbank.dtos.DtoConsumer;
import org.academiadecodigo.spermmatchbank.dtos.DtoDonor;
import org.academiadecodigo.spermmatchbank.dtos.DtoProduct;
import org.academiadecodigo.spermmatchbank.model.Consumer;
import org.academiadecodigo.spermmatchbank.model.Donor;
import org.academiadecodigo.spermmatchbank.model.Product;
import org.academiadecodigo.spermmatchbank.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codecadet on 05/08/2020.
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/donor")
public class RestDonorController {

    private DonorService donorService;


    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public ResponseEntity<List<DtoDonor>> listDonor() {

        List<DtoDonor> dtoDonors = new ArrayList<>();

        for (Donor donor : donorService.listDonors()) {
            dtoDonors.add(Convertor.donorToDtoDonor(donor));
        }

        return new ResponseEntity<>(dtoDonors, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<DtoDonor> showDonor(@PathVariable Integer id){
        return new ResponseEntity<>(Convertor.donorToDtoDonor(donorService.get(id)), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/", ""})
    public ResponseEntity<?> addDonor(@RequestBody DtoDonor dtoDonor){

        Donor donor = Convertor.dtoDonorToDonor(dtoDonor);

        donorService.save(donor);

        donor.setId(donorService.listDonors().size());

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/{id}")
    public ResponseEntity<?> updateDonor(@RequestBody DtoDonor dtoDonor) {

        Donor donor = Convertor.dtoDonorToDonor(dtoDonor);

        donorService.update(donor);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/{id}/product")
    public ResponseEntity<?> createProduct(@PathVariable Integer id, @RequestBody DtoProduct dtoProduct) {

        Product product = Convertor.dtoProductToProduct(dtoProduct);


        Donor donor = donorService.get(id);

        donorService.createProduct(donor, product);

        return new ResponseEntity<>(HttpStatus.OK);
    }






    public DonorService getDonorService() {
        return donorService;
    }

    @Autowired
    public void setDonorService(DonorService donorService) {
        this.donorService = donorService;
    }
}
