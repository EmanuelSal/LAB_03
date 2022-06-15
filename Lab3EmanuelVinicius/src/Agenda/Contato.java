package agenda;

/**
 * Essa classe tem como intuito cadastrar os contatos
 * sendo seu nome,
 * sobrenome,
 * e numero
 * 
 * @author Emanuel Lima
 *
 */
public class Contato {
	
	/**
	 * Recebe o nome do contato 
	 */
	private String nome;
	
	/**
	 * Recebe o sobrenome do contato
	 */
	private String sobrenome;
	
	/**
	 * Recebe o numero de telefone do contato
	 */
	private String telefone;
	
	/**
	 * Construtor que recebe o nome, sobrenome e numero de telefone do contato
	 * 
	 * @param nome do contato
	 * @param sobrenome do contato
	 * @param numero de telefone do contato
	 */
	public Contato(String nome, String sobrenome, String numero) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = numero;
	}
	
	/**
	 * 
	 * @param nome da contato
	 * @return o nome
	 */
	public String getNome() {
		return this.nome;
	}
	
	/**
	 * 
	 * @param sobrenome
	 * @return o sobrenome do contato
	 */
	public String getSobrenome() {
		return this.sobrenome;
	}
	
	/**
	 * 
	 * @param numero de telefone do contato
	 * @return telefone do contato
	 */
	public String getNumero() {
		return this.telefone;
	}
	public String toString( ) {
		return this.nome + " " + this.sobrenome;
		
	}
}
