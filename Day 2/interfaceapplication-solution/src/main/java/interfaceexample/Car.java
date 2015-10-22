package interfaceexample;

public class Car implements IVehicle {
	
	public static int variable;
	
	public static void setService() {
		
	}
	
	private int fuel;
	
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("CAR IS DRIVING");
	}

	@Override
	public int getFuel() {
		// TODO Auto-generated method stub
		return this.fuel;
	}

	@Override
	public void vehicleBreak() {
		// TODO Auto-generated method stub
		System.out.println("CAR STOP");
	}

	@Override
	public void setFuel(int fuel) {
		// TODO Auto-generated method stub
		this.fuel = fuel;
	}

}
