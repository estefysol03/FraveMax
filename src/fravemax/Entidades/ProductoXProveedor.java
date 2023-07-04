package fravemax.Entidades;

/**
 *
 * @author RAFAEL
 */
public class ProductoXProveedor {

    private int id;
    private Proveedor idProveedor;
    private Producto idProducto;
    private double precioCosto;
    private boolean estado;

    public ProductoXProveedor() {
    }

    public ProductoXProveedor(Proveedor idProveedor, Producto idProducto, double precioCosto, boolean estado) {
        this.idProveedor = idProveedor;
        this.idProducto = idProducto;
        this.precioCosto = precioCosto;
        this.estado = estado;
    }

    public ProductoXProveedor(int id, Proveedor idProveedor, Producto idProducto, double precioCosto, boolean estado) {
        this.id = id;
        this.idProveedor = idProveedor;
        this.idProducto = idProducto;
        this.precioCosto = precioCosto;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Proveedor getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Proveedor idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "[" + id + "][" + idProveedor.getRazonSocial() + "][" + idProducto.getDescripcion() + "]";
    }

}
