import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        String firstUnit = "None";
        String secondUnit = "None";        
        double amountUnit;
        double finalConversion;

        System.out.println("Welcome to my conversion program");
        while (!"Exit".equals(firstUnit) | !"Exit".equals(secondUnit)){
            System.out.println("Please enter your first unit:(lb, kg, m, in, Exit to finish using program)");
            firstUnit = scnr.nextLine();
                        if ("Exit".equals(firstUnit)){
                System.out.println("Thank you for using my program.");
                System.exit(0);
            }
            System.out.println("Please enter amount: ");
            amountUnit = scnr.nextDouble();
            
            System.out.println("Please enter your second unit:(lb, kg, m, in, Exit to finish using program)");
            scnr.nextLine();
            secondUnit = scnr.nextLine();
            
            if ("Exit".equals(secondUnit)) {
                System.out.println("Thank you for using my program.");
                System.exit(0);
            }

            if ("lb".equals(firstUnit) & "kg".equals(secondUnit)){
                finalConversion = amountUnit / 2.2;
                System.out.println("There are " + finalConversion + " kg in " + amountUnit + " lbs");
            }

            else if ("kg".equals(firstUnit) & "lb".equals(secondUnit)) {
                finalConversion = amountUnit * 2.2;
                System.out.println("There are " + finalConversion + " lbs in " + amountUnit + " kg");
            }

            else if ("m".equals(firstUnit) &  "in".equals(secondUnit)){
                finalConversion = amountUnit / .0254;
                System.out.println("There are " + finalConversion + " inches in " + amountUnit + " meters");
            }

            else if ("m".equals(firstUnit) &  "in".equals(secondUnit)){
                finalConversion = amountUnit * .0254;
                System.out.println("There are " + finalConversion + " meters in " + amountUnit + " inches");
            }

            else {
                System.out.println("Sorry, we don't support that conversion, please try again.");
            }

    }
}
}
