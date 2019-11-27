package com.simple_pattern.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Product extends BaseModel {

    @Size(max = 80)
    @NotEmpty(message = "The field name is required")
    private String name;

    public Product() {
    }

    public Product(@Size(max = 80) @NotEmpty(message = "The field name is required") String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
