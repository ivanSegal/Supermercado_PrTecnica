package somosPNTprueba.iSegal;



import somosPNTprueba.entity.Capilar;
import somosPNTprueba.entity.Gaseosa;
import somosPNTprueba.entity.Producto;
import somosPNTprueba.entity.Verdura;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Producto> productos = cargarProductos();

        for (Producto producto : productos) {
            System.out.println(producto);
        }


        System.out.println("=============================");

        System.out.println("Producto más caro: "+ productos.stream().max(Producto::compareTo).get().getNombre() );
        System.out.println("Producto más barato: "+ productos.stream().min(Producto::compareTo).get().getNombre() );



    }

    private static List<Producto> cargarProductos() {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Gaseosa("Coca Cola",1.5,18 ));
        productos.add(new Gaseosa("Coca-Cola Zero", 1.5, 20));
        productos.add(new Capilar("Shampoo Sedal", 500, 19));
        productos.add(new Verdura("Frutillas", 64, "kilo"));

        return productos;
    }

}