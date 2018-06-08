import java.util.Collection;
import java.util.ArrayList;
import java.util.Scanner;

public class ControladorCliente {

	public void cadastroCliente(Cliente c[], int i){
		
		
		
		Collection <Cliente> clientes = new ArrayList<Cliente>();
		Scanner scanner = new Scanner(System.in);
		
		clientes.add(c[i]);
		
		System.out.println("Nome do cliente: ");
		c[i].setNome(scanner.nextLine());
		System.out.println("CPF do cliente: ");
		c[i].setCpf(scanner.nextLine());
		System.out.println("Limite de crédito do cliente: ");
		c[i].setLimiteCredito(scanner.nextDouble());
		
		
		
		
	}
	
	
	
	
}
