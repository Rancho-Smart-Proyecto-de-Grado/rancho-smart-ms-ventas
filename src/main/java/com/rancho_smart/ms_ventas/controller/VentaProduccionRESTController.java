package com.rancho_smart.ms_ventas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rancho_smart.ms_ventas.entity.VentaProduccion;
import com.rancho_smart.ms_ventas.service.VentaProduccionService;

@RestController
@RequestMapping(path = "/ventas-produccion")
public class VentaProduccionRESTController {

    @Autowired
    private VentaProduccionService ventaProduccionService;

    @GetMapping
    public ResponseEntity<List<VentaProduccion>> getAllVentasProduccion() {
        List<VentaProduccion> listado = ventaProduccionService.obtenerTodas();
        return new ResponseEntity<>(listado, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VentaProduccion> getVentaProduccionById(@PathVariable Long id) {
        Optional<VentaProduccion> ventaProduccion = ventaProduccionService.obtenerPorId(id);
        return ventaProduccion.map(ResponseEntity::ok)
                              .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/usuario/{idUsuario}")
    public ResponseEntity<List<VentaProduccion>> getVentasProduccionByIdUsuario(@PathVariable Long idUsuario){
        List<VentaProduccion> ventasProduccionUsuario = this.ventaProduccionService.obtenerVentasProduccionPorIdUsuario(idUsuario);
        if(ventasProduccionUsuario.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(ventasProduccionUsuario, HttpStatus.OK);
        }
    }

    @GetMapping("/finca/{idFinca}")
    public ResponseEntity<List<VentaProduccion>> getVentasProduccionByIdFinca(@PathVariable Long idFinca){
        List<VentaProduccion> ventasProduccionFinca = this.ventaProduccionService.obtenerVentasProduccionPorIdFinca(idFinca);
        if(ventasProduccionFinca.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(ventasProduccionFinca, HttpStatus.OK);
        }
    }

    @PostMapping
    public ResponseEntity<VentaProduccion> saveVentaProduccion(@RequestBody VentaProduccion ventaProduccion) {
        VentaProduccion ventaCreada = ventaProduccionService.guardarVentaProduccion(ventaProduccion);
        return new ResponseEntity<>(ventaCreada, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<VentaProduccion> updateVentaProduccion(@PathVariable Long id, @RequestBody VentaProduccion ventaProduccion) {
        if (!ventaProduccionService.obtenerPorId(id).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            ventaProduccion.setIdVentaProduccion(id);
            VentaProduccion ventaActualizada = ventaProduccionService.guardarVentaProduccion(ventaProduccion);
            return new ResponseEntity<>(ventaActualizada, HttpStatus.OK);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVentaProduccion(@PathVariable Long id) {
        if (!ventaProduccionService.obtenerPorId(id).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            ventaProduccionService.eliminarVentaProduccion(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
