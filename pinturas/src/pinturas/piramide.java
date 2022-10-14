package pinturas;

public class piramide {
		
		private double ab;
		private double h;
		private double a1;
			
		private double areat;
		private double areab;
		private double area;
		
		private int tipo;
		private double rend=4.76;
		private double litros;
		private int latas;
		private double preco;	
		private double volume;
			
		public double Area (double h, double ab) {
			double area= 0;
			double area2=0;
			double a1=0;
			a1=ab*ab+h*h;
			area2=((ab*2)*java.lang.Math.sqrt(a1))/2;
			area=(area2*4)+(ab+ab)*(ab+ab);
			
			this.areat=area2;
			this.area=area;
			this.areab=(ab+ab)*(ab+ab);
			
			this.ab=ab;
			this.h=h;
			this.a1=java.lang.Math.sqrt(a1);
			
			
			this.volume=(this.areab/3)*h;	
			
			return area;	
		}
		
		public double litros () {
			int latas=1;
			double litros1=0;
			double litros=(this.area/this.rend);
			
			litros1=litros/18;
			latas=(int)litros1+1;
			
			this.litros=litros;
			this.latas=latas;
			
			return litros ;		
		}
		
		public double preco(int tipo) {
			double prec=0;
			if(tipo==1) {
				prec=this.latas*127.9;
			}
			else if(tipo==2) {
				prec=this.latas*258.98;
			}
			else {
				prec=this.latas*344.34;
			}
			this.preco=prec;
			this.tipo=tipo;
			return prec;
		}

		
		public double getAb() {
			return ab;
		}

		public void setAb(double ab) {
			this.ab = ab;
		}

		public double getH() {
			return h;
		}

		public void setH(double h) {
			this.h = h;
		}

		public double getA1() {
			return a1;
		}

		public void setA1(double a1) {
			this.a1 = a1;
		}

		public double getAreat() {
			return areat;
		}

		public void setAreat(double areat) {
			this.areat = areat;
		}

		public double getAreab() {
			return areab;
		}

		public void setAreab(double areab) {
			this.areab = areab;
		}

		public double getArea() {
			return area;
		}

		public void setArea(double area) {
			this.area = area;
		}

		public int getTipo() {
			return tipo;
		}

		public void setTipo(int tipo) {
			this.tipo = tipo;
		}

		public double getRend() {
			return rend;
		}

		public void setRend(double rend) {
			this.rend = rend;
		}

		public double getLitros() {
			return litros;
		}

		public void setLitros(double litros) {
			this.litros = litros;
		}

		public int getLatas() {
			return latas;
		}

		public void setLatas(int latas) {
			this.latas = latas;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		public double getVolume() {
			return volume;
		}

		public void setVolume(double volume) {
			this.volume = volume;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("ab =");
			builder.append(ab);
			builder.append(", h =");
			builder.append(h);
			builder.append(", a1 =");
			builder.append(a1);
			builder.append(", area triangulo =");
			builder.append(areat);
			builder.append(", area base =");
			builder.append(areab);
			builder.append(", area total =");
			builder.append(area);
			builder.append(", tipo de tinta =");
			builder.append(tipo);
			builder.append(", rendimento =");
			builder.append(rend);
			builder.append(", litros =");
			builder.append(litros);
			builder.append(", latas =");
			builder.append(latas);
			builder.append(", preco =");
			builder.append(preco);
			builder.append(", volume =");
			builder.append(volume);
			builder.append("]");
			return builder.toString();
		}
		
		

	
	
}
