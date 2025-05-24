import java.util.ArrayList;
import java.util.List;

//superclaaasse

class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calculaProventos() {
        return salario;
    }

    public String getNome() {
        return nome;
    }
}

//fazer a subclasse de funcionario para o comissionado

class FuncionarioComissionado extends Funcionario {
    private double percentual;
    private double totalVenda;

    public FuncionarioComissionado(String nome, double salario, double percentual, double totalVenda) {
        super(nome, salario);
        this.percentual = percentual;
        this.totalVenda = totalVenda;
    }

    @Override
    public double calculaProventos() {
        return salario + (percentual * totalVenda);
    }
}

//outra subclasse para funcionario para medir produtividade

class FuncionarioProdutividade extends Funcionario {
    private double valor;
    private double producao;

    public FuncionarioProdutividade(String nome, double salario, double valor, double producao) {
        super(nome, salario);
        this.valor = valor;
        this.producao = producao;
    }

    @Override
    public double calculaProventos() {
        return salario + (valor * producao);
    }
}

//folha 
class FolhaPagamento {
    private List<Funcionario> funcionarios;

    public FolhaPagamento() {
        funcionarios = new ArrayList<>();
    }

    public void adicionaFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void listaFuncionarios() {
        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome() + " | Proventos: R$" + f.calculaProventos());
        }
    }
}
