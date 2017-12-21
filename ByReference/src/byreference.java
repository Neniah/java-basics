

public class byreference {
	
	public static void main(String[] args) {
        persona p = new persona();
        p.cambiarNombre("Juan");
        imprimirNombre(p);//Imprime Juan
        modificarPersona(p);
        imprimirNombre(p);//Imprime Carlos
    }

    public static void modificarPersona(persona arg){
        arg.cambiarNombre("Carlos");
    }
    
    public static void imprimirNombre(persona p ){
        System.out.println("Valor recibido :" + p.obtenerNombre());
    }
}
