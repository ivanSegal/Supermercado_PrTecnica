package somosPNTprueba.entity;

public class Capilar extends Producto{
    private int contenido;

    public Capilar(String nombre,int contenido, double precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Contenido: " + contenido + "ml /// Precio: $" + precio;
    }
}
