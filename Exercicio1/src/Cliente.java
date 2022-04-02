import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Cliente {

	String nome;
	String cpf;
	double saldo = 0;
	
	public Cliente(String nome, String cpf) {
		this.nome= nome;
		this.cpf=cpf;

	}
	
	@Override
	public boolean equals(Object obj) {
		Cliente aux= (Cliente) obj;
		if(aux.cpf.equals(cpf)) {
			return true;
		}else {
			return false;
		}
}
	
	
	public void sacar(double valor) {
		
		if(saldo<valor) {
			showMessageDialog(null, "Saldo insuficiente para operação");
		}else {
			saldo=saldo-valor;
		}
		
	}
	
	public void depositar(double valor) {
		saldo=saldo+valor;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{Nome: " + nome +" CPF: "+cpf+" Saldo: "+ saldo +"}"; 
	}
	
	
	
}
