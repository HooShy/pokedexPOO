package categoria;

public class Categoria {
	private String categoria;

	
	
	public String toString() {
		return "Categoria [categoria=" + categoria + "]";
	}

	public Categoria(String categoria) {
		super();
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	} 
}
