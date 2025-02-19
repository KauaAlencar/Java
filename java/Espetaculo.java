import java.util.Scanner;
public class Espetaculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual o custo de produção:");
        float custoProducao = entrada.nextFloat();

        System.out.print("Valor do ingresso:");
        float precoIngresso = entrada.nextFloat();

        int qtdConvites = (int) Math.ceil(custoProducao / precoIngresso); // ceil pega o valor quebrado e arredonda para o maior, pois não faz sentido vender meio ingresso
        int qtdConvites23 = (int) Math.ceil(custoProducao * 1.23 / precoIngresso);
        
        System.out.printf("Quantidade de Convites = %d\n" , qtdConvites);
        System.out.printf("Lucro de 23%%: %d\n", qtdConvites23);

        entrada.close();
    }
}
