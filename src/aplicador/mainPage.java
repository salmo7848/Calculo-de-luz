package aplicador;

import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class mainPage {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		double atual = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de KW atual: "));
		
		double anterior = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de KW anterior"));

		double icms = Double.parseDouble(JOptionPane.showInputDialog("Informe o ICMS: "));
	
		double icmsTe = Double.parseDouble(JOptionPane.showInputDialog("Informe o ICMSTE: "));
		
		
		/*JOptionPane.showMessageDialog(null,"A seguir, digite seu dados ");
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		JOptionPane.showMessageDialog(null,"Bom dia "+nome);*/
		
		Operator dados = new Operator(atual,anterior,icms,icmsTe);
		
		
	    NumberFormat formato = new DecimalFormat("##.###");
	    NumberFormat real = new DecimalFormat("R$##.##");
		
	    
		JOptionPane.showMessageDialog(null, "Quantidade consumida: "+formato.format(dados.soma())+"\nConsumo em TUSD: "+real.format(dados.usoDistribu())+
	"\nDados.energiaTe(): "	+ ""+real.format(dados.energiaTe()));
		
	    /*JOptionPane.showMessageDialog(null, "Consumo em TUSD: "+dados.usoDistribu());
		JOptionPane.showMessageDialog(null, "Consumo energiaTe: "+dados.energiaTe());*/
		
		
		
		sc.close();

	}

}
