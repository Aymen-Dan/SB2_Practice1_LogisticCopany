package com.example.sb2_practice1.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "receivers")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Receiver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "receiverNum", nullable = false, unique = true)
    private String receiverNum;


    public String getReceiverNum() {
        return receiverNum;
    }

    public void setReceiverNum(String receiverNum) {
        this.receiverNum = receiverNum;
    }

    @Column(name = "receiverName", nullable = false)
    private String receiverName;

}
