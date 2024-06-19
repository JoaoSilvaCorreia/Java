// Manipulação de Strings


public class Manipulacao{
				public static void main(String[] args){
							String frase;
							int valor1 = 5;
							int valor2 = 15;
							frase = "Isso imprime a soma das varíaveis: " + (valor1 + valor2);
							System.out.pritnln(frase);
							frase = "Isso imprime o valor da varíavel:" + valor1;
							System.out.pritnln("Isso imprime o valor das duas varíaveis:" + valor1 + valor2);
							System.out.pritnln("Isso imprime o valor da variavel valor1 = " + valor1 + "e da variavel valor2 = " + valor2);
			}
}





/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////






//Criando uma caixa de dialogo

import javax.swing.JOptionPane;

public class Manipulacao{
				public static void main(String[] args){
				String nome; // declarando um variavel string
				nome = JOptionPane.showInputDialog("Digite seu nome: ");
				JOptionPane.showMessageDialog(null, "Ola " + nome + "!");
	}
}



///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////






import javax.swing.JOptionPane;

public class Manipulacao{
				public static void main(String[] args){
				String resposta = JOptionPane.showInputDialog("Digite sua idade:");
				int idade = Integer.parseInt(resposta);
				if(idade >= 18){
						JOptionPane.showMessageDialog(null, "Pode entrar na festa !");
				} else {
								JOptionPane.showMessageDialog(null, "Não pode entrar na festa !");
				}
}

}
*/




//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




// Incremento de i usando o FOR
/*
public class Manipulacao{
				public static void main(String[] args){
							for(int i = 4; i >= 0; i--){  // o i só existe no for
									System.out.println("Contando: " + i);
		}
	}
}

*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





//Condição while

public class Manipulacao{
				public static void main(String[] args){
					String produto = JOptionPane.showInputDialog("Digite o nome" + "de um produto ou 0 pra sair:");
					while(!produto.equals("0")){
							System.out.println(produto);
							produto = JOptionPane.showInputDialog("Digite o nome" + "de um produto ou 0 pra sair:");
					}
				}
	}

















									
				
