
package controller;

public class Sequencia {

	public Sequencia() {
		super();
	}
	
	public double seq (double divisor) {
		if (divisor == 1) { //condi��o de parada
			return 1;
		}
		else {
			double div = 1 / divisor;
			divisor = divisor - 1;
			return div + seq(divisor); //c�lculo fun��o
		}
	}

}