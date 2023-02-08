package com.example.sb2_practice1.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "trucks")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Truck {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "truckId", nullable = false, unique = true)
    private Long truckId;


    public Long getTruckId() {
        return truckId;
    }

    public void setTruckId(Long truckId) {
        this.truckId = truckId;
    }

    @Column(name = "volAvailable", nullable = false)
    public double volAvailable; // > 0

    @Column(name = "weightAvailable", nullable = false)
    public double weightAvailable; // > 0


}
