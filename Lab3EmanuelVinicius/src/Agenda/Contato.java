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
	public String getContato(String nome) {
		return this.nome = nome;
	}
	
	/**
	 * 
	 * @param sobrenome
	 * @return o sobrenome do contato
	 */
	public String getSobrenome(String sobrenome) {
		return this.sobrenome = sobrenome;
	}
	
	/**
	 * 
	 * @param numero de telefone do contato
	 * @return telefone do contato
	 */
	public String getNumero(String numero) {
		return this.telefone = numero;
	}
}
