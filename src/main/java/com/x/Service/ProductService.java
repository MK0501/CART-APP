package com.x.Service;

import com.x.Model.Product;
import com.x.Repository.ProductRepository;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@Transactional
public class ProductService {
@Autowired
ProductRepository productRepository;

@Autowired
private EntityManager entityManager;

@Autowired
private ProductService productService;


public List<Product> getProduct() {
    List<Product> list = new ArrayList<Product>();
    productRepository.findAll().forEach(pro1 -> list.add(pro1));
    return list;
}

public List<Product> deleteProduct(Product pro) {
    productRepository.delete(pro);
    return getProduct();
}

public List<Product> updateProduct(Product updateProduct) {
    productRepository.save(updateProduct);
    return getProduct();
}

public List<Product> searchProduct(String searchString) {
    List<Product> searchResults = new ArrayList<>();
    List<Product> result = productService.findAllByProductName(searchString);
    Iterator itr=result.iterator();
    
    while(itr.hasNext()){
        Product pro =new Product();
        Object[] objArr=(Object[])itr.next();
        pro.setProductId(String.valueOf(objArr[1]));
        pro.setProductName(String.valueOf(objArr[2]));
        pro.setProductPrice(String.valueOf(objArr[3]));
        pro.setInStock(String.valueOf(objArr[4]));
        pro.setProductCategoryId(String.valueOf(objArr[5]));
        pro.setGetProductCategoryName(String.valueOf(objArr[6]));
        searchResults.add(pro);
    }
    
    return searchResults;
}

public List<Product> findAllByProductName(String search) {
    List searchResults = new ArrayList<>();
    Session sessionobject=entityManager.unwrap(Session.class);
//    String queryString="SELECT * FROM product";
    NativeQuery query=sessionobject.createNativeQuery("SELECT * FROM product WHERE product_name LIKE :search")
            .setParameter("search","%"+search+"%");
//        query.setParameter("searchWord","%"+s+"%");
        searchResults=query.getResultList();
//        entityManager.close();
    System.out.println(searchResults);
   
    return searchResults;
}
}
