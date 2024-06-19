package br.edu.ifpr.control;

public class principal {

	/**
	 * 
	 */
	public static void main(String[] args) {
		Aluno aluno = new Aluno("João", 1234, 200.0 );
		aluno.verificaAlunoPossuiBolsa();
		aluno.alteraBolsa();
		aluno.pagaMensalidade(400.0);

	}

}
