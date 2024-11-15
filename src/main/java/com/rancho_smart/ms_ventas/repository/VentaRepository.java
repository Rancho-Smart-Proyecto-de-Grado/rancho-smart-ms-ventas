package com.rancho_smart.ms_ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rancho_smart.ms_ventas.entity.Venta;
import java.util.List;


@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {
    public List<Venta> findByIdFinca(Long idFinca);
    public List<Venta> findByIdUsuario(Long idUsuario);
}
