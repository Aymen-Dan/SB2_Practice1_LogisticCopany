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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "receiverNum", nullable = false, unique = true)
    private Long receiverNum;


    public Long getReceiverNum() {
        return receiverNum;
    }

    public void setReceiverNum(Long receiverNum) {
        this.receiverNum = receiverNum;
    }

    //bonus
    @Column(name = "receiverName", nullable = false)
    private String receiverName;


    @Override
    public String toString() {
        return "Receiver name: " + receiverName + ";\nReceiver Code: " + receiverNum + ";";
    }

}
