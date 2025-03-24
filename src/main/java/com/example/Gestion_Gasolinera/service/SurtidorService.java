package com.example.Gestion_Gasolinera.service;

import com.example.Gestion_Gasolinera.model.Surtidor;
import com.example.Gestion_Gasolinera.repository.SurtidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SurtidorService implements ISurtidorService {

    @Autowired
    private SurtidorRepository repoSurtidor;

    @Override
    public List<Surtidor> getSurtidores() {
        List<Surtidor> listaSurtidores = repoSurtidor.findAll();
        return listaSurtidores;
    }

    @Override
    public void saveSurtidor(Surtidor surtidor) {
        repoSurtidor.save(surtidor);
    }

    @Override
    public void deleteSurtidor(Long idSurtidor) {
        repoSurtidor.deleteById(idSurtidor);
    }

    @Override
    public Surtidor findSurtidor(Long idSurtidor) {
        return repoSurtidor.findById(idSurtidor).orElse(null);
    }

    @Override
    public void editSurtidor(Long idOriginal, String nuevoCodigo,
                             LocalDate nuevaFechaInstalacion, boolean nuevoActivo) {

        // busco el objeto original
        Surtidor surtidor = this.findSurtidor(idOriginal);

        // proceso de modificación a nivel lógico
        surtidor.setCodigo(nuevoCodigo);
        surtidor.setFechaInstalacion(nuevaFechaInstalacion);
        surtidor.setActivo(nuevoActivo);

        // guardar los cambios
        this.saveSurtidor(surtidor);
    }
}