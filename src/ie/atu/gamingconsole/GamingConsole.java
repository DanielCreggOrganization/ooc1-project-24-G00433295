package ie.atu.gamingconsole;

public class GamingConsole extends Computer {

        // Instance Variables
        private int gamingconsoleId; // Unique ID
        private String console;
        private float priceEur;
        private boolean supportsVR;
    
        // Constructor
        public GamingConsole(int GamingconsoleId , String console , float price , boolean supportsVR){
            this.gamingconsoleId = GamingconsoleId;
            this.console = console;
            this.priceEur = price;
            this.supportsVR = supportsVR;
        }
    
        //Getter and Setter Methods
        public int getGamingconsoleId(){
            return this.gamingconsoleId;
        }
    
    
        public void setGamingConsoleId(int GamingConsoleId){
            this.gamingconsoleId = GamingConsoleId;
        }
    
        public String getConsole(){
            return this.console;
        }
    
        public void setConsole(String console){
            this.console = console;
        }
         
        public float getPrice(){
            return this.priceEur;
        }
    
        public void setPrice(float price){
            this.priceEur = price;
        }
    
        public boolean getIssupportsVR(){
            return this.supportsVR;
        }
    
        public void setIssupportsVR(boolean isVegan){
            this.supportsVR = isVegan;
        }

        @Override
        public String showCpu (){
            return "Intel";
        }
    }

    