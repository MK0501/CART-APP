package com.x.Service;

import com.x.Model.Product;
import com.x.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getProduct() {
        List<Product> list =new ArrayList<Product>();
        productRepository.findAll().forEach(pro1 -> list.add(pro1));
        return list;
    }

    public List<Product> deleteProduct(Product pro){
        productRepository.delete(pro);
        return getProduct();
    }

    public List<Product> updateProduct(Product updateProduct){
         productRepository.save(updateProduct);
         return getProduct();
    }
}
