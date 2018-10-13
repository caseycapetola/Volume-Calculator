import java.util.Scanner;

public class VolumeCalculator 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.print("Welcome to the Volume Calculator!\nPress Enter to continue: ");
		user.nextLine();
		System.out.println("VOLUME OF A RECTANGULAR PRISM: ");
		System.out.print("Please enter the length: ");
		String lengthStr = user.nextLine();
		double length = Double.parseDouble(lengthStr);
		System.out.print("\nPlease enter the width: ");
		String widthStr = user.nextLine();
		double width = Double.parseDouble(widthStr);
		System.out.print("\nPlease enter the height: ");
		String heightStr = user.nextLine();
		double height = Double.parseDouble(heightStr);
		System.out.print("\nPlease enter the unit of measurement: ");
		String unit = user.nextLine();
		double volume = length*width*height;
		System.out.print("\nThe volume of the rectangular prism is: " + volume + " " + unit + "^3");
		

	}

}
