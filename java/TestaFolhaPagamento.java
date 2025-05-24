public class TestaFolhaPagamento {
    public static void main(String[] args) {
        FolhaPagamento folha = new FolhaPagamento();

        Funcionario f1 = new Funcionario("Kauã", 1500.00);
        FuncionarioComissionado f2 = new FuncionarioComissionado("Renata", 1200.00, 0.10, 5000.00);
        FuncionarioProdutividade f3 = new FuncionarioProdutividade("Maluu", 1000.00, 20.00, 50);

        folha.adicionaFuncionario(f1);
        folha.adicionaFuncionario(f2);
        folha.adicionaFuncionario(f3);

        folha.listaFuncionarios();
    }
}
