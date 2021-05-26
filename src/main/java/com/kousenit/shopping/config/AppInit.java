package com.kousenit.shopping.config;

import com.kousenit.shopping.dao.ProductRepository;
import com.kousenit.shopping.entities.Product;
import com.kousenit.shopping.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Profile("!test")
public class AppInit implements CommandLineRunner {
    private final ProductService service;

    @Autowired
    public AppInit(ProductService service) {
        this.service = service;
    }

    @Override
    public void run(String... args) throws Exception {
        service.initializeDatabase();
    }
}
