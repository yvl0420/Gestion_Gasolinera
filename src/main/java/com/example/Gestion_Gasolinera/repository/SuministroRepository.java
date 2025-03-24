package com.example.Gestion_Gasolinera.repository;

import com.example.Gestion_Gasolinera.model.Suministro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuministroRepository extends JpaRepository<Suministro, Long> {

}
