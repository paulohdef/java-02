package unidade4.sisalucar;

import java.time.LocalDate;

public class SisalucarApp {

	static int totalCarros = 0;
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		carro1.setIdCarro(1);
		carro1.setModelo("gol");
		carro1.setPlaca("jdk-0001");
		carro1.setCor("azul");
		carro1.setAno(2013);
		carro1.setValorDiaria(99.90f);
		carro1.setFabricante("volkswagen");
		
		totalCarros = totalCarros + 1;
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setIdCliente(1);
		cliente1.setCpf("12345678-90");
		cliente1.setNome("Joao Pedro");
		cliente1.setCnh("XYZ0001");
		
		SisalucarApp sisalucar = new SisalucarApp();
		
		sisalucar.realizarLocacao(carro1.getIdCarro(), cliente1.getIdCliente(), carro1.getValorDiaria());
		
		gerarRelatorioLocacao(carro1, LocalDate.now(), LocalDate.now().plusDays(5));

	}
	
	public void realizarLocacao(long idCarro, long idCliente, float valorDiaria) {
		Locacao locacao = new Locacao();
		locacao.setIdCarro(idCarro);
		locacao.setIdCliente(idCliente);
		locacao.setIdLocacao(1);
		locacao.setDataInicial(LocalDate.now());
		locacao.setDataFinal(LocalDate.now().plusDays(2));
		locacao.setValorLocado(2 * valorDiaria);
	}
	
	public static void gerarRelatorioLocacao(Carro carro1, LocalDate ...datas) {
		float totalFaturado = carro1.getValorDiaria();
	}

}
