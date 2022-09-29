import java.util.Scanner;
public class fuelCosts {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            //Varibles
            String trash="";
            int gallonsInTank = 0;
            int fuelEffciency = 0;
            double priceOfGas = 0;
            double costPerHundered = 0;
            int gasRemaining = 0;
            // ask for input
            System.out.println("How many gallons of gas do you have?");
            if(in.hasNextInt()) {
                gallonsInTank = in.nextInt();
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Run the program again and enter a valid ammount");
                System.exit(0);
            }
            System.out.println("What is your fuel efficiency?");
            if(in.hasNextInt()) {
                fuelEffciency = in.nextInt();
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Run the program again and enter a valid ammount");
                System.exit(0);
            }
            System.out.println("What is the price of gas per gallon?");
            if(in.hasNextDouble()) {
                priceOfGas = in.nextDouble();
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Run the program again and enter a valid ammount");
                System.exit(0);
            }
            // calculations and results
            costPerHundered = priceOfGas * 100;
            gasRemaining = fuelEffciency * gallonsInTank;
            System.out.println("The cost of 100 gallons of gas is " + costPerHundered);
            System.out.println("The car has " + gasRemaining + " gallons left");
        }
}
