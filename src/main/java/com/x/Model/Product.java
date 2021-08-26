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
    private String product_id;
    @Column(name="product_name")
    private String product_name;
    @Column(name="product_price")
    private String product_price;
    @Column(name="in_stock")
    private String in_stock;
    @Column(name="product_category_id")
    private String product_category_id;
    @Column(name="product_category_name")
    private String getProduct_category_name;

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_price() {
        return product_price;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }

    public String getIn_stock() {
        return in_stock;
    }

    public void setIn_stock(String in_stock) {
        this.in_stock = in_stock;
    }

    public String getProduct_category_id() {
        return product_category_id;
    }

    public void setProduct_category_id(String product_category_id) {
        this.product_category_id = product_category_id;
    }

    public String getGetProduct_category_name() {
        return getProduct_category_name;
    }

    public void setGetProduct_category_name(String getProduct_category_name) {
        this.getProduct_category_name = getProduct_category_name;
    }
}
