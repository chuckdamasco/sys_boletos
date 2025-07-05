package controller;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Boleto;

public class Controller {
	private List<Boleto> listaBoletos = new ArrayList<Boleto>();
	private boolean processado=false;
	private int maiorAtraso=0;
	private int menorAtraso=10000;
	private int mediaAtraso=0;
	private double vlrTotalBoletos=0;
	private double vlrTotalMultas=0;
	private double vlrTotalJuros=0;
	
	private final double txMulta=2;
	private final double txJurosMes=1.2;
	
	//getters da classe
	public Boleto[] getListaBoletos() {
		return (Boleto[]) listaBoletos.toArray();
	}

	public boolean isProcessado() {
		return processado;
	}
	public void setProcessado(boolean processado) {
		this.processado = processado;
	}

	public int getMaiorAtraso() {
		return maiorAtraso;
	}

	public int getMenorAtraso() {
		return menorAtraso;
	}


	public int getMediaAtraso() {
		return mediaAtraso;
	}

	public double getvlrTotalBoletos() {
		return vlrTotalBoletos;
	}

	public double getvlrTotalMultas() {
		return vlrTotalMultas;
	}
	
	public double getvlrTotalJuros() {
		return vlrTotalJuros;
	}
	
	public int getQtdeBoletos() {
		return this.listaBoletos.size();
	}
	
	//Metodos publicos da classe
	public String getSummary() {
		DecimalFormat df= new DecimalFormat();
		df.applyPattern("R$ #,##0.00");
		String mensagem="Foram lidos "+this.getQtdeBoletos()+" boletos \n";
		mensagem+="O valor total dos boletos é "+df.format(vlrTotalBoletos)+"\n";
		
		if(this.isProcessado()) {
			mensagem+="O maior atraso em dias é de "+ maiorAtraso + " dias\n"; 
			mensagem+="O menor atraso em dias é de "+ menorAtraso+ " dias\n";
			mensagem+="A media de dias atrasados é de "+ mediaAtraso+ " dias\n";
			mensagem+="O valor total de multas é "+df.format(vlrTotalMultas)+"\n";
			mensagem+="O valor total de juros é "+df.format(vlrTotalJuros);
		}
		return mensagem;
	}
	
	
	public void lerArquivoBoletos(String fileName) {
		resetaVars();
		//Implementar a leitura do aquivo e durante a leitura dos dados acumular o vlrTotalBoletos
		//cada boleto lido deve ser adicionado na List listaBoletos
		JOptionPane.showMessageDialog(null, "FALTA IMPLEMENTAR ESSE METODO PARA LER O AQUIVO!\n"+fileName);
	}
	
	//2%multa e 1.2%juros por mes
	public void processarBoletos() {
		resetaVars();

		//Aqui fazer a implementacao do codigo para calcular os juros e multa dos boletos de listaBoletos
		JOptionPane.showMessageDialog(null, "FALTA IMPLEMENTAR ESSE METODO!");

		processado=true;
	}
	
	
	public void salvarArquivoBoletos(String fileName) {
		//Aqui fazer a implementacao do codigo para salvar o arquivo de boletos
		JOptionPane.showMessageDialog(null, "FALTA IMPLEMENTAR ESSE METODO PARA SALVAR O AQUIVO!\n"+fileName);
	}
	
	//Metodo privado para voltar as variaveis para os valores iniciais
	private void resetaVars() {
		processado=false;
		maiorAtraso=0;
		menorAtraso=10000;
		mediaAtraso=0;
		vlrTotalBoletos=0;
		vlrTotalMultas=0;
		vlrTotalJuros=0;
	}
	
}
