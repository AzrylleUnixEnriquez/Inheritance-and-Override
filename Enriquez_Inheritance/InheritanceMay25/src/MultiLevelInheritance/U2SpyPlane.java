package MultiLevelInheritance;
//Plane class inherits the variables and method of vehicle
public class U2SpyPlane extends Vehicle {
	
	String PlaneName = "U-2 Spy Plane";
	String WingSpan = "31m";
	
	//Over writes the STOP method of Vehicle
	@Override
	public void STOP() {
		System.out.println("Touch down");
		//super.STOP();
	}
	public void fly() {
		System.out.println("Take off");
	}
}
