package pokemon;
import java.util.Arrays;
import categoria.*;
import classe.*;

public  class Pokemon {
	private int id;
	private String nome;
	private float peso;
	private float altura;
	private Tipo[] tipo;
	private Categoria categoria;
	public Pokemon(int id, String nome, float peso, float altura, Tipo[] tipo,Categoria categoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.tipo = tipo;
		this.categoria = categoria;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public Tipo[] getTipo() {
		return tipo;
	}
	public void setTipo(Tipo[] tipo) {
		this.tipo = tipo;
	}

	public String toString() {
		return "Pokemon [id=" + id + ", nome=" + nome + ", peso=" + peso
				+ ", altura=" + altura + ", tipo="
				+ (tipo != null ? Arrays.asList(tipo) : null) + ", categoria="
				+ categoria + "]";
	}

	
	
}
