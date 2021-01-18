package novi.basis;

public class Main {
    private String name;                //class attribute
    private String abbreviation;        //class attribute
    private int foundingYear;

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public void setAbbreviation(String abbreviation) {  // staat hier String.. tussen () omdat deze methode ook een andere variabele mee kan geven?
        this.abbreviation = abbreviation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFoundingYear(int foundingYear) {
        this.foundingYear = foundingYear;
    }

    // This is the constructor
    public Main(String name, String abbreviation, int foundingYear) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.foundingYear = foundingYear;
    }
    //create an object in main ajax is het object, name en abbrecviation zijn de instance variable
    public static void main(String[] args) {  //Waarom wordt hier ook int geaccepteert omdat er alleen maar String[] staat
        Main ajax = new Main("Ajax Amsterdam", "AFCA", 1902); // Ajax Amsterdam en AFCA zijn de instance variabelen
        System.out.println("voetbalclub " + ajax.getName() + " met de afkorting " + ajax.getAbbreviation() + " is opgericht in " + ajax.getFoundingYear());
    }
}

