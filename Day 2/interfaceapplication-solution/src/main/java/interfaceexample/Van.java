package interfaceexample;

public class Van implements IVehicle {

	private int fuel;
	
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("VAN IS DRIVING");
	}

	@Override
	public int getFuel() {
		return this.fuel;
	}

	@Override
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	@Override
	public void vehicleBreak() {
		System.out.println("VAN STOP");
	}

	public void runThisVehicle() {
		System.out.println("Runing Vehicle");
	}
}
