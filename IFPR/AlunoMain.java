package br.edu.ifpr.control;

public class principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Aluno aluno = new Aluno("Sergio", 1234, 200.0 );
		aluno.verificaAlunoPossuiBolsa();
		aluno.alteraBolsa();
		aluno.pagaMensalidade(400.0);

	}

}
