import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private ArrayList<Conta> contas;

	public String getNome() {
		return nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<Conta>();
	}
	
	public void cadastrarCliente(Cliente cliente, String tipo) {
		if (tipo.equalsIgnoreCase("C")) {
			Conta novaConta = new ContaCorrente(cliente);
			contas.add(novaConta);
			System.out.println("Conta corrente criada com sucesso!");
		} else if (tipo.equalsIgnoreCase("P")) {
			Conta novaConta = new ContaPoupanca(cliente);
			contas.add(novaConta);
			System.out.println("Conta poupança criada com sucesso!");
		} else {
			System.out.println("Opção inválida.");
		}
	}
	
	@Override
	public String toString() {
		System.out.println("Lista de clientes do "+this.nome);
		for (Conta c : contas) {
			c.imprimirInfosComuns();
			System.out.println("---------------------");
		}
		return "";
		
	}

}
