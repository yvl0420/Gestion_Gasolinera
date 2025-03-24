package com.example.Gestion_Gasolinera.service;

import com.example.Gestion_Gasolinera.model.Producto;
import com.example.Gestion_Gasolinera.model.Tanque;

import java.util.List;

public interface ITanqueService {
    public List<Tanque> getTanques();
    public void saveTanque(Tanque tanque);
    public void deleteTanque(Long idTanque);
    public Tanque findTanque(Long idTanque);
    public void editTanque(Long idOriginal,
                           String nuevoCodigo,
                           Integer nuevaCapacidadMaxima,
                           Integer nuevoNivelActual,
                           Producto nuevoProducto);
}