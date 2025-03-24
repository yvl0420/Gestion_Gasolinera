package com.example.Gestion_Gasolinera.repository;

import com.example.Gestion_Gasolinera.model.Precio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrecioRepository extends JpaRepository<Precio, Long> {
}
