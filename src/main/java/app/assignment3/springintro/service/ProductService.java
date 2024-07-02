package app.assignment3.springintro.service;

import app.assignment3.springintro.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import app.assignment3.springintro.repository.ProductRepository;

@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public void saveProduct(Product product){
        productRepository.save(product);
    }

    public List<Product> listAllProduct(){
        return productRepository.findAll();
    }

    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }
}
