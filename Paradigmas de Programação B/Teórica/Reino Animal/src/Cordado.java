public class Cordado {

    private String caracteristicaPrincipal;

    public void setCaracteristicaPrincipal ( String carct ) {
        caracteristicaPrincipal = carct;
    }

    public String getCaracteristicaPrincipal () {
        return caracteristicaPrincipal;
    }
    
    void imprimeC () {
        System.out.printf("\nCaracterística Principal: "+caracteristicaPrincipal);
    }
}
