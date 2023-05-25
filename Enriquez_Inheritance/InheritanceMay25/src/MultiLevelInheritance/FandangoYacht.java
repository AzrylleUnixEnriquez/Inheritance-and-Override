package MultiLevelInheritance;
//boat class inherits the variables and method of vehicle
public class FandangoYacht extends Vehicle{
	
	String YachtName = "Fandango Yacht";
	String MainSailColor = "Blue";
	//Overwrites the STOP method of vehicle
	public void STOP() {
		System.out.println("Drop the Anchor");
		//super.STOP();
	}
	// method Float
	public void Float() {
		
	System.out.println("Open MainSail and move");
}
	
}
