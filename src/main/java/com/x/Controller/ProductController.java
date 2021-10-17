package com.x.Controller;

import com.x.Model.Product;
import com.x.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/cart")
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/product")
    public List<Product> getProd(){
        return productService.getProduct();
    }

    @PostMapping("/deleteProduct")
    public List<Product> delProd(@RequestBody Product pro){
        List<Product> deleteproduct = productService.deleteProduct(pro);
        return deleteproduct;
    }

    @PutMapping("/update")
    public List<Product> updateProd(@RequestBody Product productUpdate){
        List<Product> updateproduct= productService.updateProduct(productUpdate);
        return updateproduct;
    }
    @PostMapping("/search")
    public List<Product> searchProd(@RequestBody String searchString){
        List<Product> searchproduct= productService.searchProduct(searchString);
        return searchproduct;
    }
}
