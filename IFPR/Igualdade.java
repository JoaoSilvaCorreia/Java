public class Igualdade{
				public static void main(String[]args){				
							boolean variavel;   // verifica igualdade and bit a bit
							variavel = (-5==5);
							System.out.println(variavel);
				
				// verifica igualdade com &;
							byte x = 3;
							byte y = 2;
							int z = x&y;
							System.out.println(z);

			// verifica igualdade OR bit a bit exclusivo (^);
							byte a = 3;
							byte b = 2;
							int c = a^b;
							System.out.println(c);

			//verifica OR bit a bit inclusivo (|);
							byte k = 3;
							byte l = 2;
							int m = k|l;
							System.out.println(m);			
		
		}
}


// AND lógico = &&
//OR lógico = ||
//AND bit a bit = &
//OR bit a bit exclusivo = ^
// OR bit a bit inclusivo = |
