package org.academiadecodigo.spermmatchbank.controller;

import org.academiadecodigo.spermmatchbank.model.Consumer;
import org.academiadecodigo.spermmatchbank.model.Donor;
import org.academiadecodigo.spermmatchbank.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<List<Donor>> listDonor() {
        return new ResponseEntity<>(donorService.listDonors(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<Donor> showDonor(@PathVariable Integer id){
        return new ResponseEntity<>(donorService.get(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/", ""})
    public ResponseEntity<?> addDonor(@RequestBody Donor donor){

        donorService.save(donor);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/{id}")
    public ResponseEntity<?> updateDonor(@RequestBody Donor donor) {

        donorService.update(donor);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/{id}/product")
    public ResponseEntity<?> createProduct(@PathVariable Integer id) {




        Donor donor = donorService.get(id);

        donorService.createProduct(donor);

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
