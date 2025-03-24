package com.example.Gestion_Gasolinera.repository;

import com.example.Gestion_Gasolinera.model.SurtidorProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurtidorProductoRepository extends JpaRepository<SurtidorProducto, Long> {

}
