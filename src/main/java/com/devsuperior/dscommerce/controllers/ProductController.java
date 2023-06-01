package com.devsuperior.dscommerce.controllers;


import com.devsuperior.dscommerce.dto.ProductDTO;
import com.devsuperior.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;


    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id){

        /*ProductDTO dto = service.findById(id);
        return dto;*/

        //ou mais resumido
        return service.findById(id);


    }

    @GetMapping
    public Page<ProductDTO> findAll(Pageable pageable) { //o import é do data.domain.Pageable;

        return service.findAll(pageable);

    }


}
