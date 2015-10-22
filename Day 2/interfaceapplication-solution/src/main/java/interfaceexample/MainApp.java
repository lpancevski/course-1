package interfaceexample;

/**
 * Created by Laze on 9/2/2015.
 */
public class MainApp {

    public static void main(String[] args) {

        IVehicle carVehicle = new Car();
        carVehicle.setFuel(40);
        carVehicle.drive();
        carVehicle.vehicleBreak();
        System.out.println("Car fuel:"+carVehicle.getFuel());

        int temp = 1;

        IVehicle vanVehicle = getVehicle(1);

        vanVehicle.setFuel(120);
        vanVehicle.drive();
        vanVehicle.vehicleBreak();
        System.out.println("Van fuel:"+vanVehicle.getFuel());

        vanVehicle = new Car();
        vanVehicle.setFuel(20);
        vanVehicle.drive();
        vanVehicle.vehicleBreak();
        System.out.println("Van fuel:"+vanVehicle.getFuel());


        IVehicle vehicle2 = new IVehicle() {

            @Override
            public void vehicleBreak() {
            }

            @Override
            public void setFuel(int fuel) {
            }

            @Override
            public int getFuel() {
                return 0;
            }

            @Override
            public void drive() {
            }
        };

        vehicle2.drive();
        vehicle2.getFuel();


        Car.setService();


        // Presenting Use of static helper classes
        int calculate = Helper.calculate(10, 20);
        System.out.println(calculate);
    }

    private static IVehicle getVehicle(int a) {
        if (a == 1) {
            return new Car();
        } else {
            return new Van();
        }

    }
}
