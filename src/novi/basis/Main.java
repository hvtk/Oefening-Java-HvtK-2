package novi.basis;

public class Main {
    private String name;                //class attribute
    private String abbreviation;        //class attribute

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {  // staat hier String.. tussen () omdat deze methode ook een andere variabele mee kan geven?
        this.abbreviation = abbreviation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Main(String name, String abbreviation) {
        this.name = name;
        this.abbreviation = abbreviation;
    }

    public static void main(String[] args) {
       // Main ajax = new Main("Ajax Amsterdam", "AFCA");   //create an object in main ajax is het object, name en abbrecviation zijn de instance variable
        Main ajax = new Main("Ajax Amsterdam", "AFCA");
        System.out.println("voetbalclub " + ajax.getName() + " met de afkorting " + ajax.getAbbreviation());
    }
}
