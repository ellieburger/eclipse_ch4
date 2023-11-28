package hw_ch4;

public class hw_ch4 {
	public static void main(String[] args)
	{
		/**p.4+5
		RacingCar rccar1;
		rccar1 = new RacingCar();
		
		rccar1.setCar(1234,20.5);
		
		rccar1.setCourse(5);
		 //p.6+7
		RacingCar rccar2 = new RacingCar(1234,20.5,5);
		
		//p.9+10
		RacingCar rccar3;
		rccar3 = new RacingCar();
		
		//rccar3.newShow();
		
		//p.11+12
		RacingCar rccar4;
		rccar4 = new RacingCar();
		
		rccar4.setCar(1234,20.5);
		
		rccar4.setCourse(5);
		//rccar4.show();
		
		//p.14+15
		Car car5;
		car5 = new RacingCar();
		car5.setCar(1234, 20.5);
		car5.show();
		
		//p.17+18
		Car cars[];
		cars = new Car[2];
		cars[0] = new Car();
		cars[0].setCar(1234, 20.5);
		cars[1] = new RacingCar();
		cars[1].setCar(4567, 30.5);
		for(int i=0; i<cars.length; i++) {
			cars[i].show();
		}

		//p.24
		Car car1;
		car1 = new Car();
		car1.setCar(1234, 20.5);
		System.out.println(car1);
		
		//p.25
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3;
		car3 = car1;
		System.out.println("car1與car2相同"+car1.equals(car2));
		System.out.println("car1與car3相同"+car1.equals(car3));
		
		//p.26
		Car[] cars;
		cars = new Car[2];
		cars[0] = new Car();
		cars[1] = new RacingCar();
		for(int i=0; i<cars.length; i++) 
		{
			Class cl = cars[i].getClass();
			System.out.println("第" + (i+1) + "個物件的類別是" +cl);
		}

		//p.29
		Vehicle[] vc = new Vehicle[2];
		vc[0]  = new Car(1234, 20.5);
		vc[0].setSpeed(500);
		vc[1] = new Plane(232);
		vc[1].setSpeed(500);
		for(int i=0; i<vc.length; i++) {
			vc[i].show();
		}
		
		//p.32
		Vehicle[] vc;
		vc = new Vehicle[2];
		vc[0] = new Car(1234, 20.5);
		vc[1] = new Plane(232);
		for(int i=0; i<vc.length; i++) {
			if (vc[i] instanceof Car)
				System.out.println("第"+(i+1)+"個物件是Car類別");
			else
				System.out.println("第"+(i+1)+"個物件不是Car類別");
		}
		
		//p.38
		iVehicle[] ivc;
		ivc = new iVehicle[2];
		ivc[0] = new Car(1234, 20.5);
		ivc[1] = new Plane(232);
		for(int i=0; i<ivc.length; i++)
		{
			ivc[i].show();
		}
		**/
		//p.41
		Car car1 = new Car(1234, 20.5);
		car1.vShow();
		car1.mShow();
	}
}

interface iVehicle
{
	int weight = 1000;
	void show();
	void vShow();
}
interface iMaterial
{
	void mShow();
}
class Car implements iVehicle,iMaterial
{
	private int num;
	private double gas;
	public Car(int n, double g) {
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+"，汽油量為"+ gas +"的車子");
	}
	public void show() {
		System.out.println("車號為"+num);
		System.out.println("汽油量是"+gas);
	}
	public void vShow()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	public void mShow() {
		System.out.println("車子的材質是鐵");
	}
}
/**
 class Plane  implements iVehicle
{
	private int flight;
	public Plane(int f) {
		flight = f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	public void show()
	{
		System.out.println("飛機的班次是"+flight);
	}
}
/**
abstract class Vehicle
{
	protected int speed;
	public void setSpeed(int s)
	{
		speed = s;
		System.out.println("將速度設為" + speed + "了");
	}
	abstract void show();
}

class Car extends Vehicle
{
	private int num;
	private double gas;
	
	public Car (int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為" + num + "汽油量為" + gas + "的車子");
	}
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("速度是"+ speed);
	}
}
class Plane extends Vehicle
{
	private int flight;
	public Plane(int f)
	{
		flight = f;
		System.out.println("生產了" + flight + "班次的飛機");
	}
	public void show()
	{
		System.out.println("飛機的班次是"+flight);
		System.out.println("速度是"+speed);
	}
}

/**class Car
{
	/**private int num;
	private double gas;
	
	protected int num;
	protected double gas;

	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public Car(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+",汽油量為"+gas+"的車子");
	}
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+",汽油量設為"+gas);
	}

	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}

	public String toString() {
	String str = "車號" + num + "汽車量" + gas;
	return str;
	}
}
	class RacingCar extends Car
	{
	private int course;
	
	public RacingCar()
	{
		course = 0;
		System.out.println("生產了賽車");
	}
	
	//p.15 public RacingCar(int n, double g, int c) 
	 public RacingCar(int c) 
	{
		//p.15 super(n,g);
		course = c;
		System.out.println("生產了編號為"+course+"的賽車");
	}
	
	public void setCourse(int c)
	{
		course = c;
		System.out.println("將賽車編號設為"+course);
	}
	
	public void newShow()
	{
		System.out.println("賽車的車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號是"+course);
	}
	
	public void show()
	{
		System.out.println("賽車的車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號是"+course);
	}
}
**/
