import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        // Cria uma variável _scannerObj, que é uma instância da classe Scanner;
        // `System.in` é passado como parâmetro para receber dados de entrada(inputs) pelo cmd que executou este arquivo, mais em: https://jenkov.com/tutorials/java-io/system-in-out-error.html#system-in
        Scanner _scannerObj = new Scanner(System.in);

        System.out.println("Exercício 8");
        System.out.println("Bem vindo ao estacionamento 8.");
        System.out.println("Por favor, digite o número de automóveis que deseja estacionar aqui: ");

        // Pelo o que eu entendi essa linha é tipo: Guarde em um espaço da memória que vai ser apelidado de `numeroAutomoveis`, o dado do tipo `int` que é o retorno do método .nextInt().
        // nextInt() é tipo: Pegue a próxima entrada(input) do usuário e retorne ela como um valor do tipo inteiro(`int`)
        int numeroAutomoveis = _scannerObj.nextInt();

        System.out.println("Por favor, digite o número total de rodas que os " + numeroAutomoveis + " automóveis possuem: ");
        int totalRodas = _scannerObj.nextInt();

        int quantidadeMotos = 0;
        int quantidadeCarros = 0;

        quantidadeMotos = ((4 * numeroAutomoveis) - totalRodas) / 2;
        quantidadeCarros = numeroAutomoveis - quantidadeMotos;

        if (quantidadeMotos > 0) {
            if (quantidadeMotos == 1) {
                System.out.println("Você irá estacionar " + quantidadeMotos + " moto");
            } else {
                System.out.println("Você irá estacionar " + quantidadeMotos + " motos");
            }
        }
        if (quantidadeCarros > 0) {
            if (quantidadeCarros == 1) {
                System.out.println("Você irá estacionar " + quantidadeCarros + " carro");
            } else {
                System.out.println("Você irá estacionar " + quantidadeCarros + " carros");
            }
        }

        System.out.println("Tudo liberado, você já pode estacionar. Volte sempre!");
        _scannerObj.close();
    }
}

///  Paulo Vítor Amorim de Oliveira RA: 323114192