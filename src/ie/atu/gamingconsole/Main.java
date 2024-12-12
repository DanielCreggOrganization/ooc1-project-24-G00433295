package ie.atu.gamingconsole;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // Create Gamingconsole object
        GamingConsoleManager GamingconsoleManagerObject = new GamingConsoleManager();

        // instantiate Scanner class so we can start reading user input
        Scanner userInput = new Scanner(System.in);
        int userSelection = 0; // Used to store user Menu option selection

        // Create infinite while loop to display Menu after every command
        while (true) {
            // Display Menu to Console
            System.out.println("");
            System.out.println("###################################");
            System.out.println("#     GamingColsole Manager v0.9  #");
            System.out.println("###################################");
            System.out.println("(1) Add a GamingConsole.");
            System.out.println("(2) Delete a GamingConsole");
            System.out.println("(3) Show total number of GamingConsoles.");
            System.out.println("(4) Search for GamingConsole by Id");
            System.out.println("(5) Quit.");
            System.out.println("Select an option from 1 to 5 and press Enter>");

            // Store user Menu option selection
            userSelection = userInput.nextInt();

            // If user selects option 1
            if (userSelection == 1) {
                // Ask user to enter GamingConsole details
                System.out.println("Enter GamingConsole Id:");
                int gamingconsoleId = userInput.nextInt();
                System.out.println("Enter GamingConsole console:");
                String console = userInput.next();
                System.out.println("Enter GamingConsole Price:");
                float priceEur = userInput.nextFloat();
                System.out.println("Does GamingConsole support VR? (true/false):");
                boolean supportsVR = userInput.nextBoolean();

                // Create GamingConsole object
                 GamingConsole myGamingConsole = new GamingConsole(gamingconsoleId, console, priceEur, supportsVR);
                 GamingconsoleManagerObject.addGamingConsole(myGamingConsole);
            } // end if

            // If user selects option 3
            if (userSelection == 3) {
                // Display total number of GamingConsole objects
                System.out.println("Total Number of GamingConsoles: " + GamingconsoleManagerObject.totalGamingConsoles());

                if (userSelection == 5) {// Quit

                    System.out.println("GamingConsole Manager Closing - Goodbye!");
                    // Close the User Input Scanner
                    userInput.close();
                    break;
                     // Break out of display menu Infinite loop

                }
            }
        }
    }
}
