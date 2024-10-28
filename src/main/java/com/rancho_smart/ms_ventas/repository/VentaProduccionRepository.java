package com.rancho_smart.ms_ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rancho_smart.ms_ventas.entity.VentaProduccion;

@Repository
public interface VentaProduccionRepository extends JpaRepository<VentaProduccion, Long>{
    
}
