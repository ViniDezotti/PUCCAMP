public class Conta {
    
    int numConta;
    String nomeCorrentista;
    float saldo;
    float limite;
    
    //private String nomeCorrentista;

    public void setNumConta( int num ) {
        numConta = num;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNomeCorrentista( String nome ) {
        nomeCorrentista = nome;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setSaldo ( float num ) {
        saldo = num;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setLimite ( float num ) {
        limite = num;
    }

    public float getLimite() {
        return limite;
    }

    void imprimeVariaveis() {
        System.out.printf("\nO número da conta é "+numConta);
        System.out.printf("\nO número do correntista é "+nomeCorrentista);
        System.out.printf("\nO saldo da conta é  R$"+saldo);
        System.out.printf("\nO limite da conta é R$"+limite);
        System.out.printf("\n\n");
    }
}
