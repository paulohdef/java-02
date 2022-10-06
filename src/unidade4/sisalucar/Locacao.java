package unidade4.sisalucar;

import java.time.LocalDate;

public class Locacao {

	private long idLocacao;
	private long idCliente;
	private long idCarro;
	private float valorLocado;
	private LocalDate dataInicial;
	private LocalDate dataFinal;
	
	public Locacao(long idLocacao, long idCliente, long idCarro, float valorLocado, LocalDate dataInicial, LocalDate dataFinall) {
		super();
		this.idLocacao = idLocacao;
		this.idCliente = idCliente;
		this.idCarro = idCarro;
		this.valorLocado = valorLocado;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}
	
	public Locacao() {
		
	}

	public long getIdLocacao() {
		return idLocacao;
	}

	public void setIdLocacao(long idLocacao) {
		this.idLocacao = idLocacao;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public long getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(long idCarro) {
		this.idCarro = idCarro;
	}

	public float getValorLocado() {
		return valorLocado;
	}

	public void setValorLocado(float valorLocado) {
		this.valorLocado = valorLocado;
	}

	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}
	
}
