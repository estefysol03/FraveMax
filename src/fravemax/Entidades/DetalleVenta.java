package fravemax.Entidades;

/**
 *
 * @author Rafael
 */
public class DetalleVenta {
    private int idDetalleVent;
    private int cantidad;
    private double precioVenta;
    private Venta idVenta;
    private Producto idProducto;
    private boolean estado;

    public DetalleVenta() {
    }

    public DetalleVenta(int cantidad, double precioVenta, Venta idVenta, Producto idProducto, boolean estado) {
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.estado = estado;
    }

    public DetalleVenta(int idDetalleVent, int cantidad, double precioVenta, Venta idVenta, Producto idProducto, boolean estado) {
        this.idDetalleVent = idDetalleVent;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.estado = estado;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "idDetalleVent=" + idDetalleVent + ", cantidad=" + cantidad + ", precioVenta=" + precioVenta + ", idVenta=" + idVenta.getIdVenta() + ", Producto=" + idProducto.getDescripcion() + '}';
    }
    
}
