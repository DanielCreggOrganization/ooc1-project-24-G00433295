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
            System.out.println("(2) Delete a GamingConsole.");
            System.out.println("(3) Show total number of GamingConsoles.");
            System.out.println("(4) Search for GamingConsole by Id.");
            System.out.println("(5) View all console options.");
            System.out.println("(6) View basket.");
            System.out.println("(7) Quit.");
            System.out.println("Select an option from 1 to 7 and press Enter>");

            // Store user Menu option selection
            userSelection = userInput.nextInt();

            // If user selects option 1
            if (userSelection == 1) {
                // Ask user to enter GamingConsole details
                System.out.println("Enter GamingConsole Id:");
                int gamingconsoleId = userInput.nextInt();
                System.out.println("Enter GamingConsole console from console options:");
                String console = userInput.next();
                System.out.println("Enter GamingConsole Price:");
                float priceEur = userInput.nextFloat();
                System.out.println("Does GamingConsole support VR? (true/false):");
                boolean supportsVR = userInput.nextBoolean();

                // Create GamingConsole object
                 GamingConsole myGamingConsole = new GamingConsole(gamingconsoleId, console, priceEur, supportsVR);
                 GamingconsoleManagerObject.addGamingConsole(myGamingConsole);
            } // end if

            // If user selects option 2
            else if (userSelection == 2) {
                System.out.println("Enter the ID of the GamingConsole you want to delete:");
                int consoleIdToDelete = userInput.nextInt();

                boolean isDeleted = GamingconsoleManagerObject.deleteGamingConsole(consoleIdToDelete);

                if (isDeleted) {
                    System.out.println("GamingConsole with ID " + consoleIdToDelete + " has been deleted.");
                } else {
                    System.out.println("No GamingConsole found with ID " + consoleIdToDelete);
                }
            }

           // If user selects option 3 (Show total number of GamingConsoles)
           else if (userSelection == 3) {
            // Display total number of GamingConsole objects
            System.out.println("Total Number of GamingConsoles: " + GamingconsoleManagerObject.totalGamingConsoles());
    }

             // If user selects option 4 (Search for GamingConsole by Id)
             else if (userSelection == 4) {
                System.out.println("Enter the ID of the GamingConsole you want to search for:");
                int consoleIdToSearch = userInput.nextInt();

                // Call the search method in GamingConsoleManager
                GamingConsole foundConsole = GamingconsoleManagerObject.searchGamingConsoleById(consoleIdToSearch);

                // If a console is found, display its details, else inform the user it's not found
                if (foundConsole != null) {
                    System.out.println("GamingConsole found:");
                    System.out.println("ID: " + foundConsole.getGamingconsoleId());
                    System.out.println("Console: " + foundConsole.getConsole());
                    System.out.println("Price: " + foundConsole.getPrice());
                    System.out.println("Supports VR: " + foundConsole.getIssupportsVR());
                } else {
                    System.out.println("No GamingConsole found with ID " + consoleIdToSearch);
                }
            }

             // If user selects option 5 (View all console options)
            else if (userSelection == 5) {
                System.out.println("Available console options:");
                System.out.println("1. Xbox");
                System.out.println("2. PlayStation");
                System.out.println("3. Nintendo Switch");
            }



         // If user selects option 7 (Quit)
         else if (userSelection == 7) { // quit
            System.out.println("GamingConsole Manager Closing - Goodbye!");
            // Close the User Input Scanner
            userInput.close();
            break; // Exit the loop
        }
        // If user selects option 7 (View all GamingConsoles)
        else if (userSelection == 6) {
            System.out.println("Displaying all GamingConsoles:");

            // Call the method to display all GamingConsoles
            GamingconsoleManagerObject.viewAllGamingConsoles();
        }
        // If the user selects an invalid option
        else {
            System.out.println("Invalid option. Please select a number between 1 and 7.");
            }
        }
    }
}
