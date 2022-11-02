
public class VEICULO {
	
	private boolean motor;
	
	public VEICULO(boolean motor) {
		setMotor(motor);
	}

	public boolean isMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VEICULO [motor=");
		builder.append(motor);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
