package com.simple_pattern.controllers;

import com.simple_pattern.models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/person")
public class PersonController extends BaseController<Person> {
}
