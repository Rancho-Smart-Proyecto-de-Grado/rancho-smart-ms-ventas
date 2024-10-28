package com.rancho_smart.ms_ventas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rancho_smart.ms_ventas.entity.VentaProduccion;
import com.rancho_smart.ms_ventas.repository.VentaProduccionRepository;

@Service
public class VentaProduccionService {

    @Autowired
    private VentaProduccionRepository ventaProduccionRepository;

    public List<VentaProduccion> obtenerTodas() {
        return ventaProduccionRepository.findAll();
    }

    public Optional<VentaProduccion> obtenerPorId(Long id) {
        return ventaProduccionRepository.findById(id);
    }

    public VentaProduccion guardarVentaProduccion(VentaProduccion ventaProduccion) {
        return ventaProduccionRepository.save(ventaProduccion);
    }

    public void eliminarVentaProduccion(Long id) {
        ventaProduccionRepository.deleteById(id);
    }
}
