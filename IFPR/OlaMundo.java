import javax.swing.JOptionPane;

public class OlaMundo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String produto = JOptionPane.showInputDialog("Digite o nome" + " de um produto ou 0 para sair :");
				while(!produto.equals("0")){
					System.out.println(produto);
					produto = JOptionPane.showInputDialog("Digite o nome" + " de um produto ou 0 para sair:");
					
				}

	}

}

