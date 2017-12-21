package sellings;

public class Order {

	private final int idOrden;
    //Declaracion del arreglo de productos
    private final Product productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    //Definimos el maximo elementos del arreglo
    private static final int maxProductos = 10;

    public Order() {
        this.idOrden = ++contadorOrdenes;
        //Se instancia el arreglo de productos
        productos = new Product[maxProductos];
    }

    public void agregarProducto(Product producto) {
        //Si los productos agregados no superan al mÃ¡ximo de productos
        //agregamos el nuevo producto
        if (contadorProductos < maxProductos) {
            //Agregamos el nuevo producto al arreglo
            //e incrementamos el contador de productos
            productos[contadorProductos++] = producto;
        }
        else{
            System.out.println("Se ha superado el maximo de productos: " + maxProductos);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < contadorProductos; i++) {
            total += productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("Orden #:" + idOrden);
        System.out.println("Total de la orden #"+ idOrden + ": $" + calcularTotal());
        System.out.println("Productos de la orden #" + idOrden + ":");
        for (int i = 0; i < contadorProductos; i++) {
            System.out.println(productos[i]);
        }
    }
}
