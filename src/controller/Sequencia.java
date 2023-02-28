
package controller;

public class Sequencia {

	public Sequencia() {
		super();
	}
	
	public double seq (double divisor) {
		if (divisor == 1) { //condição de parada
			return 1;
		}
		else {
			double div = 1 / divisor;
			divisor = divisor - 1;
			return div + seq(divisor); //cálculo função
		}
	}

}