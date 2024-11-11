package com.rancho_smart.ms_ventas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rancho_smart.ms_ventas.entity.Venta;
import com.rancho_smart.ms_ventas.repository.VentaRepository;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    public List<Venta> getVentas() {
        return this.ventaRepository.findAll();
    }

    public List<Venta> getVentasByIdFinca(Long idFinca){
        return this.ventaRepository.findByIdFinca(idFinca);
    }

    public List<Venta> getFincasByIdUsuario(Long idUsuario){
        return this.ventaRepository.findByIdUsuario(idUsuario);
    }

    public Optional<Venta> getVentaById(Long id) {
        return this.ventaRepository.findById(id);
    }

    public Venta saveVenta(Venta venta) {
        return this.ventaRepository.save(venta);
    }

    public void deleteVenta(Long id) {
        this.ventaRepository.deleteById(id);
    }
}
