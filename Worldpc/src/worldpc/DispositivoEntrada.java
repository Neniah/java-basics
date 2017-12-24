package worldpc;

public class DispositivoEntrada {

	private String tipoEntrada;
	private String marca;
	
	private DispositivoEntrada(String tipoEntrada, String marca) {
		this.tipoEntrada = tipoEntrada;
		this.marca = marca;
	}
	
	private String toString() {
		return "Dispositivo de Entrada: ";
	}
	
	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	} 
	
	public String getTipoEntrada() {
		return tipoEntrada;
	}
	
	
	
}
