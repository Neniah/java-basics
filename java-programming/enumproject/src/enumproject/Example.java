package enumproject;

public class Example {

	public static void main(String[] args) {
		System.out.println("Valor 1: " + Days.LUNES);
		
		indicarDia(Days.VIERNES);
	}
	
	public static void indicarDia(Days days) {
		switch(days){
			case LUNES:
				System.out.println("Primer dia de la semana"); break;
			case MARTES:
				System.out.println("Primer dia de la semana"); break;
			default:
				System.out.println("Y asi seguimos con los demas dias");
		}
	}
	
	
}
