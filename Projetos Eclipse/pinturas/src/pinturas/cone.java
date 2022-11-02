package pinturas;

public class cone {
	
	private double raio;
	private double altura;
	
	private double geratriz;
	
	private double areaf;
	private double areac;
	private double area;
	
	private double rendimento=3.45;
	private double tipo;
	private double litros;
	private double latas;
	
	private double preco;
	
	public double area(double z, double r) {
		double gerat=0;
		gerat=(z*z)+(r*r);
		
		this.raio=r;
		this.altura=z;
		this.areaf=3.14*(r*r);
		this.areac=3.14*r*java.lang.Math.sqrt(gerat);
		this.geratriz=java.lang.Math.sqrt(gerat);
		this.area=this.areaf+this.areac;
		
		return 0;
	}
	
	public double litros() {
		double litros=0;
		double litros1=0;
		double latas=0;
		
		litros=this.area/this.rendimento;
		litros1=litros/18;
		latas=(int)litros1+1;
		
		this.litros=litros;
		this.latas=latas;
				
		return 0;
	}
	
	public double preco(int tipo) {
		double prec=0;
		if(tipo==1) {
			prec=this.latas*238.9;
		}
		else if(tipo==2) {
			prec=this.latas*467.98;
		}
		else {
			prec=this.latas*758.34;
		}
		this.preco=prec;
		this.tipo=tipo;
		return prec;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getGeratriz() {
		return geratriz;
	}

	public void setGeratriz(double geratriz) {
		this.geratriz = geratriz;
	}

	public double getAreaf() {
		return areaf;
	}

	public void setAreaf(double areaf) {
		this.areaf = areaf;
	}

	public double getAreac() {
		return areac;
	}

	public void setAreac(double areac) {
		this.areac = areac;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	public double getTipo() {
		return tipo;
	}

	public void setTipo(double tipo) {
		this.tipo = tipo;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public double getLatas() {
		return latas;
	}

	public void setLatas(double latas) {
		this.latas = latas;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("raio =");
		builder.append(raio);
		builder.append(", altura =");
		builder.append(altura);
		builder.append(", geratriz =");
		builder.append(geratriz);
		builder.append(", area do fundo =");
		builder.append(areaf);
		builder.append(", area lateral cone=");
		builder.append(areac);
		builder.append(", area total =");
		builder.append(area);
		builder.append(", rendimento =");
		builder.append(rendimento);
		builder.append(", tipo de tinta =");
		builder.append(tipo);
		builder.append(", litros =");
		builder.append(litros);
		builder.append(", latas =");
		builder.append(latas);
		builder.append(", preco total =");
		builder.append(preco);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
