package MultiLevelInheritance;

public class ToyotaVios extends Vehicle {

	String CarName= "Toyota-VIOS";
	String TireType = "Rubber";
	
	
	@Override
	public void STOP() {
		System.out.println("Hit the brake");
		//super.STOP();
	}


	public void drive() {
		System.out.println("Driving A Toyota-Vios");
		
	}
}
