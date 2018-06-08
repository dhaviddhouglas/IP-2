
public class Cliente extends Pessoa_fisica {

	private double limiteCredito;

	public double getLimiteCredito() 
	{
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) 
	{
		this.limiteCredito = limiteCredito;
	}
	
	public Cliente(String nome, String cpf, double limiteCredito)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.limiteCredito = limiteCredito;
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
        return "Cliente{\n\t" +
                "SUPER=" + super.toString() + ", \n\t" +
                "limiteCredito=" + limiteCredito +
                '}';
    }
		
	
	
}

