package somosPNTprueba.entity;

public class Verdura extends Producto{
    private String unidadVenta;

    public Verdura(String nombre, double precio, String unidadVenta) {
        super(nombre, precio);
        this.unidadVenta = unidadVenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                " /// Precio: $" + precio +
                " /// Unidad de Venta: " + unidadVenta;
    }
}
