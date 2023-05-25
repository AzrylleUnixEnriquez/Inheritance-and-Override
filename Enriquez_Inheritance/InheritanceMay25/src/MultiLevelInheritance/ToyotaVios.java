package MultiLevelInheritance;
//Car class inherits the variables and method of vehicle
public class ToyotaVios extends Vehicle {

	String CarName= "Toyota-VIOS";
	String TireType = "Rubber";
	
	//Over writes the method STOP of vehicle
	@Override
	public void STOP() {
		System.out.println("Hit the brake");
		//super.STOP();
	}

	//method drive
	public void drive() {
		System.out.println("Driving A Toyota-Vios");
		
	}
}
