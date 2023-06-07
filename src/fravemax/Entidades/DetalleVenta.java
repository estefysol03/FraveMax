package fravemax.Entidades;

/**
 *
 * @author Adan
 */
public class DetalleVenta {
    private int idDetalleVent;
    private int cantidad;
    private double precioVenta;
    private Venta idVenta;
    private Producto idProducto;

    public DetalleVenta() {
    }

    public DetalleVenta(int cantidad, double precioVenta, Venta idVenta, Producto idProducto) {
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
    }

    public DetalleVenta(int idDetalleVent, int cantidad, double precioVenta, Venta idVenta, Producto idProducto) {
        this.idDetalleVent = idDetalleVent;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
    }

    public int getIdDetalleVent() {
        return idDetalleVent;
    }

    public void setIdDetalleVent(int idDetalleVent) {
        this.idDetalleVent = idDetalleVent;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Venta getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Venta idVenta) {
        this.idVenta = idVenta;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }
    
    
}
