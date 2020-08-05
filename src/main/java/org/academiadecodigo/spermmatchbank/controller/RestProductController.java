package org.academiadecodigo.spermmatchbank.controller;

import org.academiadecodigo.spermmatchbank.model.Consumer;
import org.academiadecodigo.spermmatchbank.model.Product;
import org.academiadecodigo.spermmatchbank.service.ProductService;
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
@RequestMapping("/api/product")
public class RestProductController {

    private ProductService productService;


    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public ResponseEntity<List<Product>> listProduct() {
        return new ResponseEntity<>(productService.listProducts(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<Product> showProduct(@PathVariable Integer id){
        return new ResponseEntity<>(productService.get(id - 1), HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.POST, path = {"/", ""}) // TODO: 05/08/2020 CHANGE ME
    public ResponseEntity<?> addProduct(@RequestBody Product product){

        productService.save(product);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @RequestMapping(method = RequestMethod.POST, path = "/{id}")
    public ResponseEntity<?> updateProduct(@RequestBody Product product) {

        productService.update(product);

        return new ResponseEntity<>(HttpStatus.OK);
    }






    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public ProductService getProductService() {
        return productService;
    }
}
