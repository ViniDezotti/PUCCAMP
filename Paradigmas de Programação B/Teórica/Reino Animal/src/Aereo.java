public class Aereo extends  Mamifero {
    private String habitat;

    public void setHabitat ( String hab ) {
        habitat = hab;
    }
    
    public String getHabitat () {
        return habitat;
    }

    void imprimeA () {
        System.out.printf("\nHabitat: "+habitat);
        System.out.printf("\n\n");
    }
}
