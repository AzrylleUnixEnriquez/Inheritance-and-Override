package MultiLevelInheritance;

public class U2SpyPlane extends Vehicle {
	
	String PlaneName = "U-2 Spy Plane";
	String WingSpan = "31m";
	
	public void STOP() {
		System.out.println("Touch down");
		//super.STOP();
	}
	public void fly() {
		System.out.println("Take off");
	}
}
