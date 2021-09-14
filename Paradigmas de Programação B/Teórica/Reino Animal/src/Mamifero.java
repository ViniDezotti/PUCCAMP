public class Mamifero extends Cordado{
    
    private String caracteristicaPrimaria;
    private String caracteristicaSecundaria;
        
    public void setCaracteristicaPrimaria ( String carctP ) {
        caracteristicaPrimaria = carctP;
    }
    
    public String getCaracteristicaPrimaria () {
        return caracteristicaPrimaria;
    }

    public void setCaracteristicaSecundaria ( String carctS ) {
        caracteristicaSecundaria = carctS;
    }
    
    public String getCaracteristicaSecundaria () {
        return caracteristicaSecundaria;
    }

    void imrpimeM () {
        System.out.printf("\nCaracterística Primária: "+caracteristicaPrimaria);
        System.out.printf("\nCaracterística Secundária: "+caracteristicaSecundaria);
    }
}
