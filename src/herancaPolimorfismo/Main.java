package herancaPolimorfismo;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

// Como Aluno, Professor e Funcionário são Pessoa, eles herdam os atributos e métodos,
// e portanto têm nome, idade e sexo.
        p1.setNome("Fulano");
        p2.setNome("Cicrano");
        p3.setNome("Beltrato");
        p4.setNome("Atronilda");

        p1.setSexo("M");
        p4.setSexo("F");

        p2.setCurso("TI");
        p3.setSalario(20000.00);
        p4.setSetor("Financeiro");

//  As chamadas abaixo não compilam pq os métodos pertecem exclusivamente a cada uma das classes filhas
//        p1.receberAumento(1000.00);
//        p2.setSalario(5000.00);
//        p4.cancelarMatricula();
    }
}
