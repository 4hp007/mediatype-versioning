package com.github._4hp007.mediatypeversioning.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.RepresentationModel;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerV2Model extends RepresentationModel<CustomerV2Model> {

    private String id;
    private String firstName;
    private String lastName;
    @JsonFormat(pattern = "YYYY-MM-dd'T'HH:mm:ss")
    private Date birthDate;
}
