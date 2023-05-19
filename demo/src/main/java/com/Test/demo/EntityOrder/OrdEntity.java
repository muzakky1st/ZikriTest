package com.Test.demo.EntityOrder;

import javax.persistence.*;

@Entity
@Table(name = "order")
public class OrdEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ord")
    private Integer id;

    @Column(name = "customer_id")
    private Integer customerID;

    @Column(name = "total_price")
    private Integer totalPrice;

    @Column(name = "created_at")
    private String createdAt;

    public OrdEntity(){}

    public OrdEntity(Integer id, Integer customerID, Integer totalPrice, String createdAt) {
        this.id = id;
        this.customerID = customerID;
        this.totalPrice = totalPrice;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
