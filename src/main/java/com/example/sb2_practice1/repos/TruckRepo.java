package com.example.sb2_practice1.repos;

import com.example.sb2_practice1.entity.Truck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("truckRepository")
public interface TruckRepo extends JpaRepository<Truck, Long> {

    List<Truck> findAll();
}