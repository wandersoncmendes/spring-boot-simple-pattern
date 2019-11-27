package com.simple_pattern.models;

import javax.persistence.Entity;
import javax.validation.constraints.*;

@Entity
public class Person extends BaseModel {

    @Size(max = 80)
    @NotEmpty(message = "The field name is required")
    private String name;


    @NotNull(message = "The field age is required")
    @Min(value = 0, message = "Age should not be less than 0")
    @Max(value = 150, message = "Age should not be greater than 150")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person(@Size(max = 80) @NotEmpty(message = "The field name is required") String name, @Size(max = 3) @NotEmpty(message = "The field age is required") @Min(value = 0, message = "Age should not be less than 0") @Max(value = 150, message = "Age should not be greater than 150") Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}
