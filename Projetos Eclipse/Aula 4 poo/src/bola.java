
public class bola {

	private String tipo;
	private String material;
	private double preco;
	
	public void setTipo(String tipo) {
		if(tipo.length()>0)
			this.tipo=tipo;
	}
	
	public String getTipo(){
		return tipo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		if(material.length()>0)
		this.material = material;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if(preco>0)
		this.preco = preco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("bola [tipo=");
		builder.append(tipo);
		builder.append(", material=");
		builder.append(material);
		builder.append(", preco=");
		builder.append(preco);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	

}
