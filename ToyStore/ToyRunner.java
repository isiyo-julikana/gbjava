public class ToyRunner
{
	public static void main(String[]args)
	{
		AFigure objAF = new AFigure("Superman");
		Car objCAR = new Car("Racecar");
		
		System.out.println(objAF);
		System.out.println("Type: " + objAF.getType());
		System.out.println(objCAR);
		System.out.println("Type: " + objCAR.getType());
	}
	
}