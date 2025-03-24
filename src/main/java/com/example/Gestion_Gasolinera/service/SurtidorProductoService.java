package com.example.Gestion_Gasolinera.service;

import com.example.Gestion_Gasolinera.model.Producto;
import com.example.Gestion_Gasolinera.model.Surtidor;
import com.example.Gestion_Gasolinera.model.SurtidorProducto;
import com.example.Gestion_Gasolinera.repository.SurtidorProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurtidorProductoService implements ISurtidorProductoService {

    @Autowired
    private SurtidorProductoRepository repoSurtidorProducto;

    @Override
    public List<SurtidorProducto> getSurtidorProductos() {
        List<SurtidorProducto> listaSurtidorProductos = repoSurtidorProducto.findAll();
        return listaSurtidorProductos;
    }

    @Override
    public void saveSurtidorProducto(SurtidorProducto surtidorProducto) {
        repoSurtidorProducto.save(surtidorProducto);
    }

    @Override
    public void deleteSurtidorProducto(Long idSurtidorProducto) {
        repoSurtidorProducto.deleteById(idSurtidorProducto);
    }

    @Override
    public SurtidorProducto findSurtidorProducto(Long idSurtidorProducto) {
        return repoSurtidorProducto.findById(idSurtidorProducto).orElse(null);
    }

    @Override
    public void editSurtidorProducto(Long idOriginal, Surtidor nuevoSurtidor,
                                     Producto nuevoProducto) {

        // busco el objeto original
        SurtidorProducto surtidorProducto = this.findSurtidorProducto(idOriginal);

        // proceso de modificación a nivel lógico
        surtidorProducto.setSurtidor(nuevoSurtidor);
        surtidorProducto.setProducto(nuevoProducto);

        // guardar los cambios
        this.saveSurtidorProducto(surtidorProducto);
    }
}
