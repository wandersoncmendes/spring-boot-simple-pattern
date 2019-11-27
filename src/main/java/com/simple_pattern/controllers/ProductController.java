package com.simple_pattern.controllers;

import com.simple_pattern.models.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/product")
public class ProductController extends BaseController<Product> {
}
