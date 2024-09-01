package excecao;

public class Financiamento {

    private double valor;
    private double entrada;
    private int parcelas;

    public Financiamento(double valor, double entrada, int parcelas) {

        if(entrada < valor*0.2){
            throw new RuntimeException("Valor da entrada invalido");
        } else if (parcelas > 6){
            throw new RuntimeException("Quantidade de parcelas invalido");
        }

        this.valor = valor;
        this.entrada = entrada;
        this.parcelas = parcelas;
    }

    public double calculaParcela(){
        return (valor - entrada)/parcelas;
    }
}
