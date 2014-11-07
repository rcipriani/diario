package teste;


public class Teste {

	private String nome;
	private String email;
	private Integer idade;
	private Boolean gostaDeCerveja;
	
	
	
	public Teste(String nome, String email, Integer idade, Boolean gostaDeCerveja) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.gostaDeCerveja = gostaDeCerveja;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Boolean getGostaDeCerveja() {
		return gostaDeCerveja;
	}
	public void setGostaDeCerveja(Boolean gostaDeCerveja) {
		this.gostaDeCerveja = gostaDeCerveja;
	}
	
}
