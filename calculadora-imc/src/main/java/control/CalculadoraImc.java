package control;

import java.util.Scanner;

public class CalculadoraImc extends Classificacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
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

            if (idade <= 12) {
                classificarIMCCrianca(sexo, idade, imc);
            } else if (idade > 65) {
                if (sexo.equalsIgnoreCase("F")) {
                    classificarIMCFemininoAcima65(imc);
                } else if (sexo.equalsIgnoreCase("M")) {
                    classificarIMCMasculinoAcima65(imc);
                } else {
                    System.out.println("Sexo inválido.");
                }
            } else {
                if (sexo.equalsIgnoreCase("F")) {
                    classificarIMCFeminino(imc);
                } else if (sexo.equalsIgnoreCase("M")) {
                    classificarIMCMasculino(imc);
                } else {
                    System.out.println("Sexo inválido.");
                }
            }
        }
        scanner.close();
    }
}