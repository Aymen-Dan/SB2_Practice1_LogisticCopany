package com.example.sb2_practice1.repos;


import com.example.sb2_practice1.entity.Receiver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("receiverRepo")
public interface ReceiverRepo extends JpaRepository<Receiver, Long> {

    List<Receiver> findAll();

}
