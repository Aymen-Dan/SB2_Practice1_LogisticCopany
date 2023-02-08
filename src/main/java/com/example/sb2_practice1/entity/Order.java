package com.example.sb2_practice1.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "orderId", nullable = false, unique = true)
    private Long orderId;



    @Column(name = "cost", nullable = false)
    private double cost; //min = 50


    @Column(name = "weight", nullable = false)
    private double weight; // > 0


    @Column(name = "volume", nullable = false)
    private double volume; // > 0

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public enum orderStatus { NEW, ONGOING, DONE, CANCELED, LOST }







}
