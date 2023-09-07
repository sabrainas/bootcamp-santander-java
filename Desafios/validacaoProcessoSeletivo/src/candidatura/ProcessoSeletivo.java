package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Processo seletivo");
		String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		
		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
		}
	}
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			
			if(continuarTentando) {
				tentativasRealizadas++;
			}else {
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			}
		}while(continuarTentando && tentativasRealizadas < 3);
		
		if(atendeu) {
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
		}else {
			System.out.println("NAO CONSEGUIMOS CONTATO COM " + candidato + ", NUMERO MAXIMO DE TENTATIVAS ATINGIDAS");
		}
	}
	//metodo auxiliar
	static boolean atender() {
		return new Random().nextInt(3) == 1;
	}
	static void imprimirSelecionados(){
		String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

		for(String candidato: candidatos) {
			System.out.println("O candidato selecionado foi: " + candidato);
		}
	}
	static void selecaoCandidatos() {
		String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados <3  && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " Solicitou esse valor de salario: R$" + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2900);
	}
	static void analisarCandidato(double salarioPretendido){
		double salarioBase = 2000.00;
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}else if(salarioBase == salarioPretendido) {
			System.out.println("FAZER UMA CONTRA-PROPOSTA");
		}else {
			System.out.println("ANALISAR OUTROS CANDIDATOS");
		}
	}	
};