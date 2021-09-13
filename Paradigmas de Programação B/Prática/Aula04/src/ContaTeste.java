public class ContaTeste {
    
    public static void main(String[] agrs) {

        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Conta conta3 = new Conta();

        conta1.setNumConta(1);
        conta1.setNomeCorrentista("Adriano");
        conta1.setSaldo(111);
        conta1.setLimite(1111);

        conta2.setNumConta(2);
        conta2.setNomeCorrentista("Bernardo");
        conta2.setSaldo(222);
        conta2.setLimite(2222);

        conta3.setNumConta(3);
        conta3.setNomeCorrentista("Carlos");
        conta3.setSaldo(333);
        conta3.setLimite(3333);

        conta1.imprimeVariaveis();
        conta2.imprimeVariaveis();
        conta3.imprimeVariaveis();

    }

}
