package MultiLevelInheritance;
//Display A, B, C - Car, Plane, Boat
public class DisplayTest {

		public static void main(String[]args) {
			//Instantiation
			ToyotaVios beep = new ToyotaVios();
			U2SpyPlane woosh = new U2SpyPlane();
			FandangoYacht honk = new FandangoYacht();
			
			//Display inherited Variables
			
			//Car
			System.out.println("Car: " + beep.CarName);
			System.out.println("Color: " + beep.CARCOLOR);
			System.out.println("Price: " + beep.CARPRICE);
			System.out.println("Speed: " + beep.CARSPEED);
			System.out.println("Tire Type: " + beep.TireType);
			
			beep.drive();
			beep.STOP();
			System.out.println("_________________________");
			
			//Plane
			
			System.out.println("Plane: " + woosh.PlaneName);
			System.out.println("Color: " + woosh.PLANECOLOR);
			System.out.println("Price: " + woosh.PLANEPRICE);
			System.out.println("Speed: " + woosh.PLANESPEED);
			System.out.println("Wing Span: " + woosh.WingSpan);
			
			woosh.fly();
			woosh.STOP();
			System.out.println("_________________________");
			
			//Yacht
			
			System.out.println("Yacht: " + honk.YachtName);
			System.out.println("Color: " + honk.BOATCOLOR);
			System.out.println("Price: " + honk.BOATPRICE);
			System.out.println("Speed: " + honk.BOATSPEED);
			System.out.println("Mainsail Color:" + honk.MainSailColor);
			
			honk.Float();
			honk.STOP();
			
		}
}
