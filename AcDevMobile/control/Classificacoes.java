package control;

public class Classificacoes {
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static void classificarIMCFeminino(double imc) {
        if (imc < 21.9) {
            System.out.println("Baixo Peso.");
        } else if (imc >= 22 && imc <= 27) {
            System.out.println("Peso Normal.");
        } else if (imc >= 27.1 && imc <= 32) {
            System.out.println("Sobrepeso.");
        } else if (imc >= 32.1 && imc <= 37) {
            System.out.println("Obesidade grau I.");
        } else if (imc >= 37.1 && imc <= 41.9) {
            System.out.println("Obesidade grau II.");
        } else if (imc >= 42) {
            System.out.println("Obesidade grau III(Obesidade Mórbida).");
        }
    }

    public static void classificarIMCFemininoAcima65(double imc) {
        if (imc < 21.9) {
            System.out.println("Baixo Peso");
        } else if (imc >= 22 && imc <= 27) {
            System.out.println("Peso normal");
        } else if (imc >= 27.1 && imc <= 32) {
            System.out.println("Sobrepeso");
        } else if (imc >= 32.1 && imc <= 37) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 37.1 && imc <= 41.9) {
            System.out.println("Obesidade grau II");
        } else {
            System.out.println("Obesidade grau III(obesidade mórbida");
        }
    }

    public static void classificarIMCMasculino(double imc) {
        if (imc < 21.9) {
            System.out.println("Baixo peso");
        } else if (imc >= 22 && imc <= 27) {
            System.out.println("Peso normal");
        } else if (imc >= 27.1 && imc <= 30) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30.1 && imc <= 35) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35.1 && imc <= 39.9) {
            System.out.println("Obesidade grau II");
        } else {
            System.out.println("Obesidade grau III (obesidade mórbida)");
        }
    }
    public static void classificarIMCMasculinoAcima65(double imc) {
        if (imc < 21.9) {
            System.out.println("Baixo peso");
        } else if (imc >= 22 && imc <= 27) {
            System.out.println("Peso normal");
        } else if (imc >= 27.1 && imc <= 30) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30.1 && imc <= 35) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35.1 && imc <= 39.9) {
            System.out.println("Obesidade grau II");
        } else {
            System.out.println("Obesidade grau III (obesidade mórbida)");
        }
    }
}
