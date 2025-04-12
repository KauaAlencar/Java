import java.util.Scanner;
import java.util.Random;

public class OperacoesVetores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] vetor = null;
        int opcao;

        do {
            System.out.println("\nMENU DE OPÇÕES:");
            System.out.println("1 - Inicializar vetor com números aleatórios");
            System.out.println("2 - Imprimir vetor");
            System.out.println("3 - Verificar se um número está no vetor");
            System.out.println("4 - Buscar o maior número do vetor");
            System.out.println("5 - Calcular média dos números pares");
            System.out.println("6 - Calcular percentual de números ímpares");
            System.out.println("7 - Calcular média centralizada");
            System.out.println("8 - Verificar se há dois números que a soma é igual a um valor");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o tamanho do vetor (N): ");
                    int n = sc.nextInt();
                    System.out.print("Informe o valor máximo (M): ");
                    int m = sc.nextInt();
                    vetor = new int[n];
                    for (int i = 0; i < n; i++) {
                        vetor[i] = rand.nextInt(m + 1);
                    }
                    System.out.println("Vetor inicializado com sucesso!");
                    break;

                case 2:
                    if (vetor == null) {
                        System.out.println("Vetor não inicializado.");
                    } else {
                        imprimirVetor(vetor);
                    }
                    break;

                case 3:
                    if (vetor == null) {
                        System.out.println("Vetor não inicializado.");
                    } else {
                        System.out.print("Digite o valor para ser procurado: ");
                        int valor = sc.nextInt();
                        int indice = buscarValor(vetor, valor);
                        if (indice == -1) {
                            System.out.println("Valor não encontrado.");
                        } else {
                            System.out.println("Valor encontrado no índice: " + indice);
                        }
                    }
                    break;

                case 4:
                    if (vetor == null) {
                        System.out.println("Vetor não inicializado.");
                    } else {
                        System.out.println("Maior valor do vetor: " + maiorValor(vetor));
                    }
                    break;

                case 5:
                    if (vetor == null) {
                        System.out.println("Vetor não inicializado.");
                    } else {
                        System.out.println("Média dos pares: " + mediaPares(vetor));
                    }
                    break;

                case 6:
                    if (vetor == null) {
                        System.out.println("Vetor não inicializado.");
                    } else {
                        System.out.println("Percentual de ímpares: " + percentualImpares(vetor) + "%");
                    }
                    break;

                case 7:
                    if (vetor == null) {
                        System.out.println("Vetor não inicializado.");
                    } else {
                        System.out.println("Média centralizada: " + mediaCentralizada(vetor));
                    }
                    break;

                case 8:
                    if (vetor == null) {
                        System.out.println("Vetor não inicializado.");
                    } else {
                        System.out.print("Digite o valor alvo: ");
                        int alvo = sc.nextInt();
                        boolean existe = somaDoisNumeros(vetor, alvo);
                        System.out.println(existe ? "Dois números encontrados com soma igual ao valor." : "Nenhum par encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }

    public static void imprimirVetor(int[] vetor) {
        for (int i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int buscarValor(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public static int maiorValor(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static double mediaPares(int[] vetor) {
        int soma = 0, cont = 0;
        for (int num : vetor) {
            if (num % 2 == 0) {
                soma += num;
                cont++;
            }
        }
        return cont > 0 ? (double) soma / cont : 0;
    }

    public static double percentualImpares(int[] vetor) {
        int cont = 0;
        for (int num : vetor) {
            if (num % 2 != 0) {
                cont++;
            }
        }
        return ((double) cont / vetor.length) * 100;
    }

    public static double mediaCentralizada(int[] vetor) {
        int menor = vetor[0], maior = vetor[0];
        for (int num : vetor) {
            if (num < menor) menor = num;
            if (num > maior) maior = num;
        }

        boolean ignorouMenor = false, ignorouMaior = false;
        int soma = 0, cont = 0;

        for (int num : vetor) {
            if (num == menor && !ignorouMenor) {
                ignorouMenor = true;
                continue;
            }
            if (num == maior && !ignorouMaior) {
                ignorouMaior = true;
                continue;
            }
            soma += num;
            cont++;
        }

        return cont > 0 ? (double) soma / cont : 0;
    }

    public static boolean somaDoisNumeros(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] + vetor[j] == valor) {
                    return true;
                }
            }
        }
        return false;
    }
}
