class Cars
{
	String company;
	String Model;
	String Colours;
	String Variant;
	String Max_power;
	String Engine_displacement;
	String Wheel_type;
	String Max_torque;
	String Features;
	String Fuel_type;
	String Fuel_tank_capacity;
	String Mileage;
		
}

class Bikes
{
	String Company_name;
	String Model;
	String Colours;
	String Max_power;
	String Engine_displacement;
	String Wheel_type;
	String Max_torque;
	String Features;
	String Fuel_tank_capacity;
	String Mileage;	
}

class Trucks
{
	String Company_name;
	String Model;
	String Engine_displacement;
	String Max_load_capacity;
	String Fuel_tank_capacity;
}

class Bus
{
	String Company_name;
	String Model;
	String Engine_displacement;
	String Max_load_capacity;
	String No_of_seating_capacity;
	String Fuel_tank_capacity;
}

class D4
{
	public static void main(String args[])
	{
		Cars obj = new Cars();
		obj.company = "maruti";

		System.out.println(obj.company);

}
}