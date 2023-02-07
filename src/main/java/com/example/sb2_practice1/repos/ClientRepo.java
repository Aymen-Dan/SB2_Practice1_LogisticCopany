package com.example.sb2_practice1.repos;

import com.example.sb2_practice1.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("clientRepository")
public interface ClientRepo extends JpaRepository<Client, Long> {


    List<Client> findAll();
}