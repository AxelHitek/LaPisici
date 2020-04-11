package com.lapisici.lapisici.domain.controller;

import com.lapisici.lapisici.domain.entity.Cat;
import com.lapisici.lapisici.domain.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cat")
public class CatController {

    @Autowired
    private CatRepository catRepository;

    @GetMapping(value = "/get-cat")
    public Cat getCatById(@RequestParam("id") Long id) {
        return catRepository.findById(id).get();
    }

}
