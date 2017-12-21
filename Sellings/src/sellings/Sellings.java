package sellings;

public class Sellings {

	public static void main(String[] args) {
        //Creamos varios objetos Producto
        Product p1 = new Product("Camisa",50.00);
        Product p2 = new Product("Pantalon",100.00);
        Product p3 = new Product("Corbata",30.00);
        
        //Creamos un objeto Orden
        Order orden1 = new Order();
        
        //Agregamos los productos a la orden
        orden1.agregarProducto(p1);
        orden1.agregarProducto(p2);
        orden1.agregarProducto(p3);
        
        //Imprimimos la orden
        orden1.mostrarOrden();
        
        //Creamos una segunda orden
        Order orden2 = new Order();
        
        //Creamos nuevos productos
        Product p4 = new Product("Zapatos", 200);
        Product p5 = new Product("Blusa", 90);
        
        //Agregamos productos a la orden 2
        orden2.agregarProducto(p1);
        orden2.agregarProducto(p4);
        orden2.agregarProducto(p5);
        orden2.agregarProducto(p3);
        
        //Imprimimos la orden 2
        System.out.println("");
        orden2.mostrarOrden();
    }
}
