package pinturas;

public class cubo {
	
	private double lado;
	private double rend;
	private int tipo;
	
	private double areaz;
	private double area;
	private double volume;
	private double diagonal;
	
	private double litros;
	private int latas;
	private double preco;	
	
	public double Area (double x) {
		double area= 0;
		double area2=0;
		area2=x*x;
		area=area2*6;
		this.area=area;
		this.lado=x;
		this.areaz=area2;
		this.volume=area*area*area;
		this.diagonal=area*java.lang.Math.sqrt(3);
		
		
		return area;	
	}
	
	public double litros (double x) {
		int latas=1;
		double litros1=0;
		double litros=(this.area/x);
		
		litros1=litros/18;
		latas=(int)litros1+1;
		
		this.litros=litros;
		this.rend=x;
		this.latas=latas;
		
		return litros ;		
	}
	
	public double preco(int tipo) {
		double prec=0;
		if(tipo==1) {
			prec=this.latas*101.9;
		}
		else if(tipo==2) {
			prec=this.latas*212.45;
		}
		else {
			prec=this.latas*345.56;
		}
		this.preco=prec;
		this.tipo=tipo;
		return prec;
	}
	
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getRend() {
		return rend;
	}
	public void setRend(double rend) {
		this.rend = rend;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("cubo a =");
		builder.append(lado);
		builder.append(", rendimento =");
		builder.append(rend);
		builder.append(", tipo de tinta =");
		builder.append(tipo);
		builder.append(", area da base =");
		builder.append(areaz);
		builder.append(", area total =");
		builder.append(area);
		builder.append(", volume =");
		builder.append(volume);
		builder.append(", diagonal do cubo =");
		builder.append(diagonal);
		builder.append(", litros de tinta =");
		builder.append(litros);
		builder.append(", latas de tinta =");
		builder.append(latas);
		builder.append(", valor total=");
		builder.append(preco);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
