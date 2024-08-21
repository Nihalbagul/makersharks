package com.example.makersharks.service;

import com.example.makersharks.model.Supplier;
import com.example.makersharks.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> findSuppliers(String location, String natureOfBusiness, String manufacturingProcesses) {
        return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcesses(
            location, natureOfBusiness, manufacturingProcesses
        );
    }
}
