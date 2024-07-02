package app.assignment3.springintro.controller;

import app.assignment3.springintro.service.ProductService;
import app.assignment3.springintro.entity.Product;
import app.assignment3.springintro.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @Autowired
    ProductRepository productRepository;

    @GetMapping(value = "")
    public ResponseEntity<List<Product>> getAllProducts(){
        List<Product> product = productService.listAllProduct();
        return new ResponseEntity<List<Product>>(product, HttpStatus.OK);
    }
    

    @PostMapping(value = "")
    public ResponseEntity<Product> add(@RequestBody Product product){
        productService.saveProduct(product);

        return new ResponseEntity<Product>(product, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        if (productRepository.existsById(id)) {
            productService.deleteProduct(id);
            return new ResponseEntity<>("Delete sukses", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Produk dengan ID " + id + " tidak ditemukan", HttpStatus.NOT_FOUND);
        }
    }
}
