package control;

import java.util.Scanner;
public class CalculadoraImc extends Classificacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora do Índice de Massa Corporal (IMC)");
        System.out.println("Digite o sexo (M para masculino e F para feminino):");
        String sexo = scanner.next();

        System.out.println("Digite a sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite a altura em metros:");
        double altura = scanner.nextDouble();

        System.out.println("Digite o seu peso em kg:");
        double peso = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);
        System.out.printf("Seu IMC é: %.2f\n", imc);

        System.out.println("Sua situação é:");

        if (sexo.equalsIgnoreCase("F")) {
            if (idade > 65) {
                classificarIMCFemininoAcima65(imc);
            } else {
                classificarIMCFeminino(imc);
            }
        }
        else if (sexo.equalsIgnoreCase("M")) {
            if (idade > 65) {
                classificarIMCMasculinoAcima65(imc);
            } else {
                classificarIMCMasculino(imc);
            }
        } else {
            System.out.println("Sexo invalido.");
        }

        scanner.close();

    }
}
