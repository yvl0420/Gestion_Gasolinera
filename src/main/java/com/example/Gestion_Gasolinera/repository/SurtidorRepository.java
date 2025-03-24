package com.example.Gestion_Gasolinera.repository;

import com.example.Gestion_Gasolinera.model.Surtidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurtidorRepository extends JpaRepository<Surtidor, Long> {

}