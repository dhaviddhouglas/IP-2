import java.util.Collection;
import java.util.ArrayList;
import java.util.Scanner;

public class ControladorCliente {
	Collection <Cliente> clientes = new ArrayList<Cliente>();
	
	public void cadastroCliente(){
		
		Cliente c = new Cliente();		
		Scanner scanner = new Scanner(System.in);
										
		System.out.println("Nome do cliente: ");
		c.setNome(scanner.nextLine());
		System.out.println("CPF do cliente: ");
		c.setCpf(scanner.nextLine());
		System.out.println("Limite de crédito do cliente: ");
		c.setLimiteCredito(scanner.nextDouble());
		
		clientes.add(c);
		
		
		
	}
	
	
	
	
}
