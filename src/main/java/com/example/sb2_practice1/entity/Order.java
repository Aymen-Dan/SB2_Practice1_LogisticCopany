package com.example.sb2_practice1.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderId", nullable = false, unique = true)
    private Long orderId;



    @Column(name = "cost", nullable = false)
    @Min(50)
    private double cost; //min = 50


    @Column(name = "weight", nullable = false)
    @Min(0)
    private double weight; // > 0


    @Column(name = "volume", nullable = false)
    @Min(0)
    private double volume; // > 0

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public enum orderStatus { NEW, ONGOING, DONE, CANCELED, LOST }



    @Override
    public String toString() {
        return "Order ID: " + orderId + ";\nOrder cost: " + cost + ";\nOrder weight: " + weight + ";\nOrder volume: " + volume + ";";
    }




}
