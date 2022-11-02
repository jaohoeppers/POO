
public class CONTA {
	
	private String banco;
	private int agencia;
	private int numeroconta;
	private double saldo;
	boolean num=true;
	
	public CONTA(String banco) {
		setBanco(banco);
	}
	
	public boolean deposito(double valor) {
		if (valor>0) {
		num =true;	
			
		}
		return num ;
	}
	
	public boolean saque(double valor) {
		if (valor<0) {
		num =false;	
			
		}
		return num ;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroconta() {
		return numeroconta;
	}

	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isNum() {
		return num;
	}

	public void setNum(boolean num) {
		this.num = num;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CONTA [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroconta=");
		builder.append(numeroconta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", num=");
		builder.append(num);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
