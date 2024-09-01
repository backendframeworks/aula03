package herancaPolimorfismo;

public class Funcionario extends Pessoa{

    private String setor;
    private boolean estaTrabalhando;

    public void mudarTrabalho(){
        this.estaTrabalhando = !this.estaTrabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isEstaTrabalhando() {
        return estaTrabalhando;
    }

    public void setEstaTrabalhando(boolean estaTrabalhando) {
        this.estaTrabalhando = estaTrabalhando;
    }
}
