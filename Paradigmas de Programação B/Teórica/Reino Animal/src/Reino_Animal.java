public class Reino_Animal {

    public static void main (String[] args) {
        Cordado animal1 = new Cordado();
        Mamifero animal2 = new Mamifero();
        Terrestre animal3 = new Terrestre();
        Marinho animal4 = new Marinho();
        Aereo animal5 = new Aereo();

        //Características Cordado
        System.out.printf("\nAnimal  01\n");
        animal1.setCaracteristicaPrincipal("Possui coluna vertebral");
        animal1.imprimeC();
        System.out.printf("\n\n");

        //Características Mamífero
        System.out.printf("\nAnimal  02\n");
        animal2.setCaracteristicaPrincipal("Possui coluna vertebral");
        animal2.setCaracteristicaPrimaria("Produz leite para amamentação");
        animal2.setCaracteristicaSecundaria("Presença de pelos pelo corpo");
        animal2.imprimeC();
        animal2.imrpimeM();
        System.out.printf("\n\n");

        //Características Mamífero Terrestre
        System.out.printf("\nAnimal  03\n");
        animal3.setCaracteristicaPrincipal("Possui coluna vertebral");
        animal3.setCaracteristicaPrimaria("Produz leite para amamentação");
        animal3.setCaracteristicaSecundaria("Presença de pelos pelo corpo");
        animal3.setHabitat("Savana Africana");
        animal3.imprimeC();
        animal3.imrpimeM();
        animal3.imprimeT();

        //Características Mamífero Marinho
        System.out.printf("\nAnimal  04\n");
        animal4.setCaracteristicaPrincipal("Possui coluna vertebral");
        animal4.setCaracteristicaPrimaria("Produz leite para amamentação");
        animal4.setCaracteristicaSecundaria("Presença de pelos pelo corpo");
        animal4.setHabitat("Oceano Atlântico");
        animal4.imprimeC();
        animal4.imrpimeM();
        animal4.imprimeMr();

        //Características Mamífero Aereo
        System.out.printf("\nAnimal  05\n");
        animal5.setCaracteristicaPrincipal("Possui coluna vertebral");
        animal5.setCaracteristicaPrimaria("Produz leite para amamentação");
        animal5.setCaracteristicaSecundaria("Presença de pelos pelo corpo");
        animal5.setHabitat("Cerrado");
        animal5.imprimeC();
        animal5.imrpimeM();
        animal5.imprimeA();
    }

}
