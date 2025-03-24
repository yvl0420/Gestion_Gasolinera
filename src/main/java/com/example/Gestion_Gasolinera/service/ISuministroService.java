package com.example.Gestion_Gasolinera.service;

import com.example.Gestion_Gasolinera.model.Producto;
import com.example.Gestion_Gasolinera.model.Suministro;
import com.example.Gestion_Gasolinera.model.Surtidor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public interface ISuministroService {
    public List<Suministro> getSuministros();
    public void saveSuministro(Suministro suministro);
    public void deleteSuministro(Long idSuministro);
    public Suministro findSuministro(Long idSuministro);
    public void editSuministro(Long idOriginal,
                               Surtidor nuevoSurtidor,
                               Producto nuevoProducto,
                               LocalDateTime nuevaFechaHora,
                               BigDecimal nuevoVolumenLitros,
                               BigDecimal nuevoImporteEuros);
}