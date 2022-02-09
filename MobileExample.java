abstract class Mobile
{
abstract void start();
abstract void stop();
abstract void makecall();

}

class Samsung extends Mobile
{
public void start()
{
	System.out.println("phone is starting...");
}

public void stop()
{
}

public void makecall()
{
}
}

class MobileExample
{
public static void main(String[] args)
{
Samsung obj = new Samsung();
obj.start();
}
}