import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Main {
	public static void main(String[] args) {
		
		int opcao;
		
		do {
			opcao= parseInt(showInputDialog(Util.menu()));
			
			if(opcao < 1 || opcao > 6) {
				showMessageDialog(null, "Opção inválida!");
			}else {
				switch (opcao) {
				case 1:
					Util.cadastrar();
					break;
				case 2:
					Util.sacar();
					break;
				case 3:
					Util.depositar();
					break;
				case 4:
					Util.fazerRelatorio();
					break;
				case 5: 
					Util.encerrarConta();
				}
			}
			
			
			
		}while(opcao != 6);
		
		
		
		}
	}

	