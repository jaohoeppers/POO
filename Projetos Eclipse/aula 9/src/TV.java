
public class TV extends EquipamentoEletronico implements Icontrole{
		
		private String marca;
		private String modelo;
		private boolean estado;
		private int volume;
		private int canal;
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public boolean isEstado() {
			return estado;
		}
		public void setEstado(boolean estado) {
			this.estado = estado;
		}
		public int getVolume() {
			return volume;
		}
		public void setVolume(int volume) {
			this.volume = volume;
		}
		public int getCanal() {
			return canal;
		}
		public void setCanal(int canal) {
			this.canal = canal;
		}
		public boolean ligaDesliga() {
			if(estado==true) {
				setEstado(false);
				return false;
				}
			else {
				setEstado(true);
				return true;
			}
		}

		@Override
		public int alterarCanal(int canal) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int canalMais(int canal) {
			if(canal>10) {
			this.canal=0;
			return 0;
			}
			else
				this.canal=canal;
				return canal;
		}

		@Override
		public int canalMenos(int canal) {
			if(canal<0) {
				this.canal=0;
				return 10;
				}
				else
					this.canal=canal;
					return canal;
		}

		@Override
		public int volumeMais(int volume) {
			if(volume >=10) {
				this.volume=10;
				return this.volume;
				}
			else 
				volume=volume-1;
			return volume;
		}

		@Override
		public int volumeMenos(int volume) {
			if(volume <=0) {
				this.volume=0;
				return this.volume;
				}
			else 
				volume=volume+1;
			return volume;
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("TV [marca=");
			builder.append(marca);
			builder.append(", modelo=");
			builder.append(modelo);
			builder.append(", estado=");
			builder.append(estado);
			builder.append(", volume=");
			builder.append(volume);
			builder.append(", canal=");
			builder.append(canal);
			builder.append("]");
			return builder.toString();
		}
		
	
	

}