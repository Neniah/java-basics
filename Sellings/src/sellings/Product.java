package sellings;

public class Product {

	private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    //Constructor vacÃ­o
    private Product() {
        //Asignamos el id producto Ãºnico por cada objeto creado
        this.idProducto = ++contadorProductos;
    }

    //Constructor sobrecargado de dos argumentos
    public Product(String nombre, double precio) {
        //Llamamos al constructor vacÃ­o para asignar el idProducto
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto #" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
}
