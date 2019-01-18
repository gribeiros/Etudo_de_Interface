package entities;

import model.servive.Ipva;

public class Carro {

	private String marca;
	private Double preco;
	private Double porcentagem;

	private Ipva ipva;

	public Carro() {
	}

	public Carro(String marca, Double preco, Double porcentagem, Ipva ipva) {
		this.marca = marca;
		this.preco = preco;
		this.porcentagem = porcentagem;
		this.ipva = ipva;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(Double porcentagem) {
		this.porcentagem = porcentagem;
	}

	public Ipva getIpva() {
		return ipva;
	}

	public void setIpva(Ipva ipva) {
		this.ipva = ipva;
	}

	@Override
	public String toString() {
		return "Marca=" + marca + "\n" + "Preço=" + preco + "\n" + "Ipva=" + ipva.calIpva(preco, porcentagem);
	}

}
