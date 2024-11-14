package lavaRapido.model;

import java.time.LocalDateTime;

public class Agendamento {

	private Cliente cliente;
	private String tipoLavagem;
	private String data;

	public Agendamento(Cliente cliente, String tipoLavagem, String data) {
		this.cliente = cliente;
		this.tipoLavagem = tipoLavagem;
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getTipoLavagem() {
		return tipoLavagem;
	}

	public void setTipoLavagem(String tipoLavagem) {
		this.tipoLavagem = tipoLavagem;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void visualizar() {
		System.out.println("Agendamento: " + cliente.getNome() + " - " + tipoLavagem + " - Data: " + data);
	}

}
