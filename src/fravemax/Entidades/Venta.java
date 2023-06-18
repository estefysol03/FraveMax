package fravemax.Entidades;

import java.time.LocalDate;

/**
 *
 * @author Rafael
 */
public class Venta {
    private int idVenta;
    private LocalDate fecha;
    private Cliente idCliente;
    private boolean estado;

    public Venta() {
    }

    public Venta(LocalDate fecha, Cliente idCliente, boolean estado) {
        this.fecha = fecha;
        this.idCliente = idCliente;
        this.estado = estado;
    }

    public Venta(int idVenta, LocalDate fecha, Cliente idCliente, boolean estado) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.idCliente = idCliente;
        this.estado = estado;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

   @Override
    public String toString() {
        return "[Id Venta: " + idVenta + "] [Fecha: " + fecha + "] [idCliente: " + idCliente.getIdCliente() + "]";
    }
    
}
