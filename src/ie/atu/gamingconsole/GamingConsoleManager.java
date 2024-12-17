package ie.atu.gamingconsole;

public class GamingConsoleManager {

    //create array to store gamingconsole objects
    private GamingConsole[] Gamingconsoles;

    //constructor
    public GamingConsoleManager() {
        // initializw array to store 10 GamingConsole objects
        Gamingconsoles = new GamingConsole[100];
    }

    // Method to add a Gamingconsole object to the array
    public void addGamingConsole(GamingConsole gamingconsole) {
        //Loop through array to find first empty slot
        for (int i = 0; i < Gamingconsoles.length; i++) {
            //check if slot is empty
            if (Gamingconsoles[i] == null) {
                //add gamingconsole object to array
                Gamingconsoles[i] = gamingconsole;
                //exit loop
                break;
            }
        }
    }
    // Method to find the total number of Gamingconsole objects in the array
    public int totalGamingConsoles() {
        // Initialize counter
        int total = 0;
        // Loop through array
        for (int i = 0; i < Gamingconsoles.length; i++) {
            // Check if slot is not empty
            if (Gamingconsoles[i] != null) {
                // Increment counter
                total++;
            }
        }
        // Return total number of Gamingconsole objects
        return total;
    }
    // Method to delete a GamingConsole object by its ID
    public boolean deleteGamingConsole(int gamingConsoleId) {
        // Loop through the array to find the GamingConsole with the given ID
        for (int i = 0; i < Gamingconsoles.length; i++) {
            // If the GamingConsole is found with the matching ID
            if (Gamingconsoles[i] != null && Gamingconsoles[i].getGamingconsoleId() == gamingConsoleId) {
                // Shift elements to the left to fill the gap
                for (int j = i; j < Gamingconsoles.length - 1; j++) {
                    Gamingconsoles[j] = Gamingconsoles[j + 1]; // Shift elements left
                }
                // Nullify the last slot since it's now a duplicate after shifting
                Gamingconsoles[Gamingconsoles.length - 1] = null;
                return true; // Return true to indicate successful deletion
            }
        }
        return false; // Return false if no GamingConsole with the given ID was found
    }

        // Method to search for a GamingConsole by its ID
    public GamingConsole searchGamingConsoleById(int gamingConsoleId) {
        // Loop through array to find the GamingConsole with the given ID
        for (int i = 0; i < Gamingconsoles.length; i++) {
            if (Gamingconsoles[i] != null && Gamingconsoles[i].getGamingconsoleId() == gamingConsoleId) {
                return Gamingconsoles[i]; // Return GamingConsole if found
            }
        }
        return null; // Return null if no GamingConsole with the given ID is found
    }

    // Method to view all GamingConsoles
    public void viewAllGamingConsoles() {
        // Check if the array has any non-null objects
        boolean hasConsoles = false;

        // Loop through all gaming consoles and display them
        for (GamingConsole console : Gamingconsoles) {
            if (console != null) {
                // Display console details
                System.out.println("ID: " + console.getGamingconsoleId());
                System.out.println("Console: " + console.getConsole());
                System.out.println("Price: " + console.getPrice());
                System.out.println("Supports VR: " + console.getIssupportsVR());
                System.out.println("------------");
                hasConsoles = true;
            }
        }

        // If no consoles were found, display a message
        if (!hasConsoles) {
            System.out.println("No GamingConsoles available.");
        }
    }
}
