import cs1.Keyboard;
import java.util.Scanner;

public class KingsIsland
{
	public static void main(String[] args)
	{
		int peopleNumber = 0;
		double parkingCost = 0, foodCost = 0, totalCost, costPerPerson;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of people: ");
		peopleNumber = input.nextInt();
		System.out.print("Enter the cost of parking: ");
		parkingCost = input.nextDouble();
		System.out.print("Enter the amount spent on food: ");
		foodCost = input.nextDouble();

		totalCost = (peopleNumber * 32.99) + parkingCost + foodCost;
		costPerPerson = totalCost / peopleNumber;

		System.out.println(" ");
		System.out.println("King's Island Cost Report");
		System.out.println("Total Cost: $" + totalCost);
		System.out.println("Cost per person: $" + costPerPerson);

	}
}