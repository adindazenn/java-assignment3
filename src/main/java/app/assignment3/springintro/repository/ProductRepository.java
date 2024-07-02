package app.assignment3.springintro.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import app.assignment3.springintro.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
  
}
