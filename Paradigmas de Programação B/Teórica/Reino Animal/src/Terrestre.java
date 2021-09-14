public class Terrestre extends  Mamifero{
    private String habitat;

    public void setHabitat ( String hab ) {
        habitat = hab;
    }
    
    public String getHabitat () {
        return habitat;
    }

    void imprimeT () {
        System.out.printf("\nHabitat: "+habitat);
        System.out.printf("\n\n");
    }
}
