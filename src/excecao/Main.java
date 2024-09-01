package excecao;

/*
Aplicação que simula um financiamento bancário. Dado o valor total, o valor da entrada e
o número de parcelas, pede-se para calcular o valor da parcela. Porém, há algumas regras
de negógio: (1) A entrada tem que ser pelo menos 20% do valor total; (2) O número de parcelas
tem que ser maior do que 6.
 */

public class Main {
    public static void main(String[] args) {
        double valor = 1000;
        double entrada= 100;
        int parcelas = 10;

        try{
            Financiamento financiamento = new Financiamento(valor, entrada, parcelas);
            System.out.println("O valor da parcela é: " + financiamento.calculaParcela());
        } catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("codigo continua...");

    }
}
