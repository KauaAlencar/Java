import java.util.ArrayList;
import java.util.List;

class Moeda {
    private double valor;
    private String nome;

    public Moeda(double valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Moeda moeda = (Moeda) obj;
        return Double.compare(moeda.valor, valor) == 0 && nome.equals(moeda.nome);
    }
}

class Cofre {
    private List<Moeda> moedas;

    public Cofre() {
        moedas = new ArrayList<>();
    }

    public void adicionar(Moeda m) {
        moedas.add(m);
    }

    public double calcularTotal() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.getValor();
        }
        return total;
    }

    
    public int contaMoedas(Moeda m) {
        int contador = 0;
        for (Moeda moeda : moedas) {
            if (moeda.equals(m)) {
                contador++;
            }
        }
        return contador;
    }
}

public class CofreMoedassex1 {
    public static void main(String[] args) {
        Cofre cofre = new Cofre();

        Moeda moeda1 = new Moeda(0.05, "5centavos");
        Moeda moeda2 = new Moeda(0.10, "10centavos");
        Moeda moeda3 = new Moeda(0.25, "25centavos");
        Moeda moeda4 = new Moeda(0.50, "50centavos");
        Moeda moeda5 = new Moeda(1.00, "Real");


        cofre.adicionar(moeda1);
        cofre.adicionar(moeda1); 
        cofre.adicionar(moeda2);
        cofre.adicionar(moeda3);
        cofre.adicionar(moeda4);
        cofre.adicionar(moeda5);
        cofre.adicionar(moeda5);

        System.out.println("Total no cofre: R$" + cofre.calcularTotal());

        
        System.out.println("Quantidade de moedas de 0.5: " + cofre.contaMoedas(moeda1));
        System.out.println("Quantidade de moedas de 0.10: " + cofre.contaMoedas(moeda2));
        System.out.println("Quantidade de moedas de 0.25: " + cofre.contaMoedas(moeda3));
        System.out.println("Quantidade de moedas de 0.50: " + cofre.contaMoedas(moeda4));
        System.out.println("Quantidade de moedas de 1.00: " + cofre.contaMoedas(moeda5));
    
    }
}
