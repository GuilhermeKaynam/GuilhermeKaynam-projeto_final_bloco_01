package lavaRapido.model;

public class Produto {

	private String tipo;
	private float preco;

	public Produto(String tipo, float preco) {
		this.tipo = tipo;
		this.preco = preco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void visualizar() {
		System.out.println("Produto: " + tipo + " | Preço: R$ " + preco);
	}
}