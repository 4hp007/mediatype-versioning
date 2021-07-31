package com.github._4hp007.mediatypeversioning.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.RepresentationModel;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerModel extends RepresentationModel<CustomerModel> {

    private String id;
    private String name;
    private Integer age;
}
