package fravemax.Entidades;

import java.time.LocalDate;

/**
 *
 * @author Adan
 */
public class Compra {

    private int idCompra;
    private Proveedor idProveedor;
    private LocalDate fecha;

    public Compra() {
    }

    public Compra(Proveedor idProveedor, LocalDate fecha) {
        this.idProveedor = idProveedor;
        this.fecha = fecha;
    }

    public Compra(int idCompra, Proveedor idProveedor, LocalDate fecha) {
        this.idCompra = idCompra;
        this.idProveedor = idProveedor;
        this.fecha = fecha;
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

}
