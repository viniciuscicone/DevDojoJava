package exercicioENUMcomposicoes;

import java.util.Date;

public class HourContract {
	
	private int duracao;
	private Double valor;
	private Date data;

	public HourContract(int duracao, double valor, Date data) {
		this.duracao = duracao;
		this.valor = valor;
		this.data = data;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	public double totalValue() {
		return duracao * valor;
	}

	
}
