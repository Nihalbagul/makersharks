package com.example.makersharks.repository;

import com.example.makersharks.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    List<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcesses(
        String location, String natureOfBusiness, String manufacturingProcesses
    );
}
