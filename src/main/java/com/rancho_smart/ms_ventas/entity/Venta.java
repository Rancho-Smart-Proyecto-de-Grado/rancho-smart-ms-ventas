package com.rancho_smart.ms_ventas.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "VENTA")
public class Venta {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVenta;

    @Column(name = "FECHA")
    private LocalDateTime fecha;

    @Column(name = "PRECIO")
    private double precio;

    @Column(name = "TIPO_TRANSACCION")
    private TipoTransaccion tipoTransaccion;

    @Column(name = "ID_USUARIO")
    private Long idUsuario;

    @Column(name = "ID_CLIENTE")
    private Long idCliente;

    @Column(name = "CONDICIONES_ENTREGA")
    private String condicionesEntrega;

    @Column(name = "OBSERVACIONES")
    private String observaciones;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<Long> idAnimalesEnVenta;

    @Column(name = "ESTADO_PAGO")
    private EstadoPago estadoPago;

    @Column(name = "ID_FINCA")
    private Long idFinca;

    public Venta(LocalDateTime fecha, double precio, TipoTransaccion tipoTransaccion, Long idUsuario, Long idCliente,
            String condicionesEntrega, String observaciones, List<Long> idAnimalesEnVenta, EstadoPago estadoPago,
            Long idFinca) {
        this.fecha = fecha;
        this.precio = precio;
        this.tipoTransaccion = tipoTransaccion;
        this.idUsuario = idUsuario;
        this.idCliente = idCliente;
        this.condicionesEntrega = condicionesEntrega;
        this.observaciones = observaciones;
        this.idAnimalesEnVenta = idAnimalesEnVenta;
        this.estadoPago = estadoPago;
        this.idFinca = idFinca;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public EstadoPago getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(EstadoPago estadoPago) {
        this.estadoPago = estadoPago;
    }

    public Venta() {
    }

    public Long getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Long idVenta) {
        this.idVenta = idVenta;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getCondicionesEntrega() {
        return condicionesEntrega;
    }

    public void setCondicionesEntrega(String condicionesEntrega) {
        this.condicionesEntrega = condicionesEntrega;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public TipoTransaccion getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(TipoTransaccion tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public List<Long> getIdAnimalesEnVenta() {
        return idAnimalesEnVenta;
    }

    public void setIdAnimalesEnVenta(List<Long> idAnimalesEnVenta) {
        this.idAnimalesEnVenta = idAnimalesEnVenta;
    }

    public Long getIdFinca() {
        return idFinca;
    }

    public void setIdFinca(Long idFinca) {
        this.idFinca = idFinca;
    }
    
    
}
