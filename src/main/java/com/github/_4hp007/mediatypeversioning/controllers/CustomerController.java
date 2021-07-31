package com.github._4hp007.mediatypeversioning.controllers;

import com.github._4hp007.mediatypeversioning.models.CustomerModel;
import com.github._4hp007.mediatypeversioning.models.CustomerV2Model;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping(produces = "application/vnd.com.github._4hp007.v1+json")
    ResponseEntity<?> getV1() {
        CustomerModel customerModel = new CustomerModel();
        customerModel.add(linkTo(methodOn(CustomerController.class).getV1()).withSelfRel());
        return ResponseEntity.ok(customerModel);
    }

    @GetMapping(produces = "application/vnd.com.github._4hp007.v2+json")
    ResponseEntity<?> getV2() {
        CustomerV2Model CustomerV2Model = new CustomerV2Model();
        CustomerV2Model.add(linkTo(methodOn(CustomerController.class).getV2()).withSelfRel());
        return ResponseEntity.ok(CustomerV2Model);
    }

}
