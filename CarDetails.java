class Engine
{
	String type;
	int cc;
	boolean state;
	void EngineType(String T,int c)
		{
		type=T;
		cc=c;
		System.out.println("engine type is "+T);
		System.out.println("cc of engine is "+cc);
		}
}

class Tyre
{
	String type;
	double pressure;
	String mff;
	void TyreMff(String c)
		{
		mff=c;
		System.out.println("tyre manufacturer is "+mff);	
		}	
	 void GetPressure(double a)
		{
		pressure=a;
		System.out.println("tyre type is "+pressure);
		}
}
class Car
{
	Engine E=new Engine();
	Tyre T=new Tyre();
	void EngineTyreDetails(Engine e,Tyre t)
		{
		E=e;
		T=t;
		E.EngineType("Diesel Engine",347);
		T.TyreMff("MRF");
		T.GetPressure(21);
		}
}
public class CarDetails
{
	public static void main(String args[])
		{
		Car c=new Car();
		Engine E=new Engine();
		Tyre T=new Tyre();
		c.EngineTyreDetails(E,T);
		}
}