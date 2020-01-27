package br.org.generation.sistemaalunos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   // indico que vai ser armazenada em banco de dados 
@Table(name="tbl_aluno") // associo a tabela ao nome dela
public class Aluno {	
	@Column(name="ra")   //defino que o atributo agora é uma coluna da tabela 
	@Id                  // CHAVE PRIMARIA
	@GeneratedValue (strategy = GenerationType.IDENTITY)// indica que é auto gerado *autoincrement
	private int ra ;
	
	@Column(name = "nome", length = 100) // indicamos o tamanho da coluna 
	private String nome;
	
	@Column(name = "email", length = 100,unique = true )
	private String email;
	
	@Column(name = "telefone", length = 20)
	private String telefone;

	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
