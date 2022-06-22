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
	 * 
	 */
	private String[] addTags;
	
	/**
	 * Construtor que recebe o nome, sobrenome e numero de telefone do contato
	 * 
	 * @param nome do contato
	 * @param sobrenome do contato
	 * @param numero de telefone do contato
	 * 
	 */
	public Contato(String nome, String sobrenome, String numero) {
		
		this.addTags = new String[5];
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = numero;
	}
	
	public Contato() {
		
		// TODO Auto-generated constructor stub
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
	
	/**
	 * 
	 */
	public String toString() {
		return this.nome + " " + this.sobrenome;
		
	}
	
	/**
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		} if(!obj.getClass().equals(this.getClass())) {
			return false;
		} 
		Contato contato = (Contato) obj;
		
		return this.nome.equals(contato.nome) && this.sobrenome.equals(contato.sobrenome);
	}
	/**
	 * 
	 * @return
	 */
	public String getTag() {
		
		String addTag = "";  
		for(int indice = 0; indice < addTags.length; indice++) {
			
			if(addTags[indice] != null) {
				addTag += addTags[indice] + " ";
			}
		} return addTag.trim();
	}
	/**
	 * 
	 * @param tag
	 * @param posicao
	 */
	public void colocaTag(String tag, int posicao) {
		this.addTags[posicao - 1] = tag;
	}
	
	public int codigoHash() {
		return this.nome.hashCode() + this.sobrenome.hashCode();
	}
}	
