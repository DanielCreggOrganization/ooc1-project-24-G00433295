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

}
