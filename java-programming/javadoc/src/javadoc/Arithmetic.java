package javadoc;

public class Arithmetic {

	int operandoA;
	int operandoB;
	
	public Arithmetic(int a, int b) {
		this.operandoA = a;
		this.operandoB = b;
	}
	
	public int sum() {
		return operandoA + operandoB;
	}
}
