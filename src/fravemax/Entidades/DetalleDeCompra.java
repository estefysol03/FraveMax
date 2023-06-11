package fravemax.Entidades;

/**
 *
 * @author Rafael
 */
public class DetalleDeCompra {

    private int idDetalle;
    private int cantidad;
    private double precioCosto;
    private Compra idCompra;
    private Producto idProducto;
    private boolean estado;

    public DetalleDeCompra() {
    }

    public DetalleDeCompra(int cantidad, double precioCosto, Compra idCompra, Producto idProducto, boolean estado) {
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.idCompra = idCompra;
        this.idProducto = idProducto;
        this.estado = estado;
    }

    public DetalleDeCompra(int idDetalle, int cantidad, double precioCosto, Compra idCompra, Producto idProducto, boolean estado) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.idCompra = idCompra;
        this.idProducto = idProducto;
        this.estado = estado;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public Compra getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Compra idCompra) {
        this.idCompra = idCompra;
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
        return "DetalleDeCompra{" + "idDetalle=" + idDetalle + ", cantidad=" + cantidad + ", precioCosto=" + precioCosto + ", idCompra=" + idCompra.getIdCompra() + ", Producto=" + idProducto.getDescripcion() + '}';
    }

}