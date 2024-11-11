package com.rancho_smart.ms_ventas.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "VENTA_PRODUCCION")
public class VentaProduccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVentaProduccion;

    @Column(name = "ID_USUARIO")
    private Long idUsuario;

    @Column(name = "ID_FINCA")
    private Long idFinca;

    @Column(name = "CANTIDAD_VENDIDA")
    private Float cantidadVendida;

    @Column(name = "TIPO_PRODUCCION")
    private TipoProduccion tipoProduccion;

    @Column(name = "PRECIO_TOTAL")
    private Float precioTotal;

    @Column(name = "FECHA")
    private LocalDateTime fecha;

    @Column(name = "COMPRADOR")
    private String comprador;

    public VentaProduccion() {
    }

    public VentaProduccion(Long idUsuario, Long idFinca, Float cantidadVendida, TipoProduccion tipoProduccion,
            Float precioTotal, LocalDateTime fecha, String comprador) {
        this.idUsuario = idUsuario;
        this.idFinca = idFinca;
        this.cantidadVendida = cantidadVendida;
        this.tipoProduccion = tipoProduccion;
        this.precioTotal = precioTotal;
        this.fecha = fecha;
        this.comprador = comprador;
    }

    public Long getIdVentaProduccion() {
        return idVentaProduccion;
    }

    public void setIdVentaProduccion(Long idVentaProduccion) {
        this.idVentaProduccion = idVentaProduccion;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdFinca() {
        return idFinca;
    }

    public void setIdFinca(Long idFinca) {
        this.idFinca = idFinca;
    }

    public Float getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(Float cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public TipoProduccion getTipoProduccion() {
        return tipoProduccion;
    }

    public void setTipoProduccion(TipoProduccion tipoProduccion) {
        this.tipoProduccion = tipoProduccion;
    }

    public Float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    
}
