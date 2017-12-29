package classobject;

public class ClassObject {
	
	public static void main(String[] args) {
		Persona emp1 = new Persona("Juan", 100000);
		Persona emp2 = new Persona("Juan", 100000);
		
		compararObjectos(emp1, emp2);
	}
	
	private static void compararObjectos(Persona emp1, Persona emp2) {
		
		System.out.println("Contenido objeto: " + emp1);
		
		if (emp1 == emp2) {
			System.out.println("Los objetos tienen misma direccion de memoria");
		} else {
			System.out.println("Los objetos tienen distinta dirección de memoria");
		}
		
		if(emp1.equals(emp2))
			System.out.println("Los objetos tienen el mismo contenido, son iguales.");
		else 
			System.out.println("Los objetos NO tienen el mismo contenido.");
		
		if(emp1.hashCode() == emp2.hashCode())
			System.out.println("Los objetos tienen el mismo codigo hash");
		else
			System.out.println("Los objetos NO tienen el mismo codigo hash");
	}
}
