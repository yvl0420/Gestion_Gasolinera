package com.example.Gestion_Gasolinera.repository;

import com.example.Gestion_Gasolinera.model.Tanque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TanqueRepository extends JpaRepository<Tanque, Long> {

}
