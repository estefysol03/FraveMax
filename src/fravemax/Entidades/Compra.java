package fravemax.Entidades;

import java.time.LocalDate;

/**
 *
 * @author Rafael
 */
public class Compra {

    private int idCompra;
    private Proveedor idProveedor;
    private LocalDate fecha;
    private boolean estado;

    public Compra() {
    }

    public Compra(Proveedor idProveedor, LocalDate fecha, boolean estado) {
        this.idProveedor = idProveedor;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Compra(int idCompra, Proveedor idProveedor, LocalDate fecha, boolean estado) {
        this.idCompra = idCompra;
        this.idProveedor = idProveedor;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Proveedor getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Proveedor idProveedor) {
        this.idProveedor = idProveedor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", idProveedor=" + idProveedor.getIdProveedor() + ", fecha=" + fecha + ", estado=" + estado + '}';
    }

}