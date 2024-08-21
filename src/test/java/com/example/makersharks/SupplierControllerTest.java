package com.example.makersharks;

import com.example.makersharks.model.Supplier;
import com.example.makersharks.repository.SupplierRepository;
import com.example.makersharks.service.SupplierService;
import com.example.makersharks.controller.SupplierController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(SupplierController.class)
public class SupplierControllerTest {

    @InjectMocks
    private SupplierController supplierController;

    @Mock
    private SupplierService supplierService;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(supplierController).build();
    }

    @Test
    public void testQuerySuppliers() throws Exception {
        mockMvc.perform(post("/api/supplier/query")
                .param("location", "India")
                .param("natureOfBusiness", "small_scale")
                .param("manufacturingProcesses", "3d_printing"))
                .andExpect(status().isOk());
    }
}
