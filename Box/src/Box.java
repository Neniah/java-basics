
public class Box {
	
	int ancho, alto, profundo, volumen;
	
	Box(int width, int height, int deep){
		ancho = width;
		alto = height;
		profundo = deep;
	}
	
	Box() {
		System.out.println("Has creado una caja.");
	}
	
	void Volumen() {
		volumen = ancho * alto * profundo;
	}
	
	void showVolumen() {
		System.out.println("El volumen es: " + volumen);
	}
	

	public static void main(String[] args) {
		Box caja = new Box(3, 2, 6);
		caja.Volumen();
		caja.showVolumen();
	}
}
