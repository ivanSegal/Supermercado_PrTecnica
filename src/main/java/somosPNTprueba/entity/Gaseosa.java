package somosPNTprueba.entity;

public class Gaseosa extends Producto{
    private double litros;

    public Gaseosa(String nombre,double litros, double precio ) {
        super(nombre, precio);
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Litros: " + litros + " /// Precio: $" + precio;
    }
}
