package com.example.makersharks.controller;

import com.example.makersharks.model.Supplier;
import com.example.makersharks.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/query")
    public List<Supplier> querySuppliers(
        @RequestParam String location,
        @RequestParam String natureOfBusiness,
        @RequestParam String manufacturingProcesses
    ) {
        return supplierService.findSuppliers(location, natureOfBusiness, manufacturingProcesses);
    }
}
