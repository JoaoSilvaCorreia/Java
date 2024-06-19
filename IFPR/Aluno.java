package br.edu.ifpr.control;

public class Aluno {

	private String nomeAluno;
	private int registroAcademico;
	private boolean alunoPossuiBolsa;
	private double valorMensalidade;
	
	
	public Aluno (String nomeAluno, int registroAcademico, double valorMensalidade){
		this.nomeAluno = nomeAluno;
		this.registroAcademico = registroAcademico;
		this.valorMensalidade = valorMensalidade;
		alunoPossuiBolsa = false;
	
		
	}
	public boolean verificaAlunoPossuiBolsa () {
		if (alunoPossuiBolsa) {
			System.out.println("Aluno possui bolsa!");
			return true;
			
		} else {
			System.out.println("Aluno não possui bolsa!");
			return false; }
	}
	
	public boolean alteraBolsa () {
		if (alunoPossuiBolsa){
			alunoPossuiBolsa = false;
			return alunoPossuiBolsa;
			
		} alunoPossuiBolsa = true;
		return alunoPossuiBolsa;
		
	}
	public void pagaMensalidade (double valor) {
		if (alunoPossuiBolsa == true) {
			valorMensalidade /= 2;
			
			if (( valorMensalidade - (valor/2)) < 0) {
				System.out.println("Valor insuficiente.");
				
			} else if ((valorMensalidade - (valor/2)) == 0) {
				System.out.println("Mensalidade de 2 vezes de R$ " + valorMensalidade + " reais a ser paga.");
				System.out.println("A mensalidade foi dividida em 2 vezes por se tratar de um aluno bolsista.");
				
			}  else {
				System.out.println("Mensalidade de R$ " + valorMensalidade + " reais a ser paga.");
				System.out.println("Troco de R$ " + ( valor - valorMensalidade) + " reais.");
			}
			
		} else {
			if ((valor - valorMensalidade) < 0) {
				System.out.println("Valor insuficiente.");
				
			} else if ((valorMensalidade - valor) == 0) {
				System.out.println("Mensalidade de R$ " + valorMensalidade + " reais a ser paga.");
				
			}  else {
				System.out.println("Mensalidade de R$ " + valorMensalidade + " reais a ser paga.");
				System.out.println("Troco de R$ " + ( valor - valorMensalidade) + " reais.");
			}

		
		} 


	}

}



