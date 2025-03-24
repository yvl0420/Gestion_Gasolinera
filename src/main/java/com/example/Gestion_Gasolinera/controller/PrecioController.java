package com.example.Gestion_Gasolinera.controller;

import com.example.Gestion_Gasolinera.model.Precio;
import com.example.Gestion_Gasolinera.model.Producto;
import com.example.Gestion_Gasolinera.service.IPrecioService;
import com.example.Gestion_Gasolinera.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class PrecioController {

    @Autowired
    private IPrecioService servicioPrecios;

    @Autowired
    private IProductoService servicioProductos;

    @GetMapping("/listado-precios")
    public List<Precio> obtenerPrecios() {
        return servicioPrecios.getPrecios();
    }

    @GetMapping("/precio/{id}")
    public Precio obtenerPrecioPorId(@PathVariable Long id) {
        return servicioPrecios.findPrecio(id);
    }

    @PostMapping("/precio/nuevo")
    public String crearPrecio(@RequestBody Precio precio) {
        servicioPrecios.savePrecio(precio);
        return "El precio ha sido registrado exitosamente";
    }

    @DeleteMapping("/precio/eliminar/{id}")
    public String eliminarPrecio(@PathVariable Long id) {
        servicioPrecios.deletePrecio(id);
        return "El precio ha sido eliminado exitosamente";
    }

    @PutMapping("/precio/actualizar/{idOriginal}")
    public Precio actualizarPrecio(@PathVariable Long idOriginal,
                                   @RequestParam(required = false, name = "idProducto") Long idProducto,
                                   @RequestParam(required = false, name = "fechaInicio") String fechaInicio,
                                   @RequestParam(required = false, name = "fechaFin") String fechaFin,
                                   @RequestParam(required = false, name = "precioPorLitro") BigDecimal precioPorLitro) {

        Precio precioExistente = servicioPrecios.findPrecio(idOriginal);
        Producto producto = (idProducto != null) ? servicioProductos.findProducto(idProducto) : precioExistente.getProducto();

        LocalDate fechaInicioActualizada = (fechaInicio != null) ? LocalDate.parse(fechaInicio) : precioExistente.getFechaInicio();
        LocalDate fechaFinActualizada = (fechaFin != null) ? LocalDate.parse(fechaFin) : precioExistente.getFechaFin();

        servicioPrecios.editPrecio(idOriginal, producto, fechaInicioActualizada, fechaFinActualizada, precioPorLitro);

        return servicioPrecios.findPrecio(idOriginal);
    }

    @PutMapping("/precio/actualizar")
    public Precio actualizarPrecio(@RequestBody Precio precio) {
        Precio precioExistente = servicioPrecios.findPrecio(precio.getIdPrecio());

        servicioPrecios.editPrecio(
                precioExistente.getIdPrecio(),
                precio.getProducto(),
                precio.getFechaInicio(),
                precio.getFechaFin(),
                precio.getPrecioPorLitro()
        );

        return servicioPrecios.findPrecio(precio.getIdPrecio());
    }
}
