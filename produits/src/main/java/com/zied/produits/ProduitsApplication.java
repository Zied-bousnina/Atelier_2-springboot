package com.zied.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zied.produits.entities.Produit;
import com.zied.produits.repos.ProduitRepository;

@SpringBootApplication
public class ProduitsApplication {
	
     


     
	public static void main(String[] args) {
		SpringApplication.run(ProduitsApplication.class, args);
	}

}
