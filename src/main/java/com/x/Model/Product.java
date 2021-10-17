package com.x.Model;


import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="product")
@Entity
public class Product {

@Id
    @Column(name="product_id")
    private String productId;
    @Column(name="product_name")
    private String productName;
    @Column(name="product_price")
    private String productPrice;
    @Column(name="in_stock")
    private String inStock;
    @Column(name="product_category_id")
    private String productCategoryId;
    @Column(name="product_category_name")
    private String getProductCategoryName;

public String getProductId() {
    return productId;
}

public void setProductId(String productId) {
    this.productId = productId;
}

public String getProductName() {
    return productName;
}

public void setProductName(String productName) {
    this.productName = productName;
}

public String getProductPrice() {
    return productPrice;
}

public void setProductPrice(String productPrice) {
    this.productPrice = productPrice;
}

public String getInStock() {
    return inStock;
}

public void setInStock(String inStock) {
    this.inStock = inStock;
}

public String getProductCategoryId() {
    return productCategoryId;
}

public void setProductCategoryId(String productCategoryId) {
    this.productCategoryId = productCategoryId;
}

public String getGetProductCategoryName() {
    return getProductCategoryName;
}

public void setGetProductCategoryName(String getProductCategoryName) {
    this.getProductCategoryName = getProductCategoryName;
}

}
