package aplicador;

public class Operator {
	public double atual;
	public double anterior;
	public double icms;
	public double icmsTe;
	
	public Operator(double atual,double anterior,double icms,double icmsTe) {
		this.atual = atual;
		this.anterior = anterior;
		this.icms = icms;
		this.icmsTe = icmsTe;
	}
	
	public double soma() {
		return (atual - anterior) * 1000.000;
	}
	
	public double usoDistribu() {
		return soma() * icms;
	}
	
	public double energiaTe() {
		return soma() * icmsTe;
	}

}
