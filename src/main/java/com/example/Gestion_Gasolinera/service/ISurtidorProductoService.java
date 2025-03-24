package com.example.Gestion_Gasolinera.service;

import com.example.Gestion_Gasolinera.model.Producto;
import com.example.Gestion_Gasolinera.model.Surtidor;
import com.example.Gestion_Gasolinera.model.SurtidorProducto;

import java.util.List;

public interface ISurtidorProductoService {
    public List<SurtidorProducto> getSurtidorProductos();
    public void saveSurtidorProducto(SurtidorProducto surtidorProducto);
    public void deleteSurtidorProducto(Long idSurtidorProducto);
    public SurtidorProducto findSurtidorProducto(Long idSurtidorProducto);
    public void editSurtidorProducto(Long idOriginal,
                                     Surtidor nuevoSurtidor,
                                     Producto nuevoProducto);
}
