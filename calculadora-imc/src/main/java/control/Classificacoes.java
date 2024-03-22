package control;

public class Classificacoes {
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Classificação para mulheres abaixo de 65 anos
    public static void classificarIMCFeminino(double imc) {
        if (imc < 21.9) {
            System.out.println("Baixo Peso.");
        } else if (imc >= 22 && imc < 27) {
            System.out.println("Peso Normal.");
        } else if (imc >= 27 && imc < 32) {
            System.out.println("Sobrepeso.");
        } else if (imc >= 32 && imc < 37) {
            System.out.println("Obesidade grau I.");
        } else if (imc >= 37 && imc < 41.9) {
            System.out.println("Obesidade grau II.");
        } else {
            System.out.println("Obesidade grau III (Obesidade Mórbida).");
        }
    }

    // Classificação para mulheres acima de 65 anos
    public static void classificarIMCFemininoAcima65(double imc) {
        if (imc < 21.9) {
            System.out.println("Baixo Peso.");
        } else if (imc >= 22 && imc < 27) {
            System.out.println("Peso Normal.");
        } else if (imc >= 27 && imc < 32) {
            System.out.println("Sobrepeso.");
        } else if (imc >= 32 && imc < 37) {
            System.out.println("Obesidade grau I.");
        } else if (imc >= 37 && imc < 41.9) {
            System.out.println("Obesidade grau II.");
        } else {
            System.out.println("Obesidade grau III (Obesidade Mórbida).");
        }
    }

    // Classificação para homens abaixo de 65 anos
    public static void classificarIMCMasculino(double imc) {
        if (imc < 21.9) {
            System.out.println("Baixo Peso.");
        } else if (imc >= 22 && imc < 27) {
            System.out.println("Peso Normal.");
        } else if (imc >= 27 && imc < 30) {
            System.out.println("Sobrepeso.");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade grau I.");
        } else if (imc >= 35 && imc < 39.9) {
            System.out.println("Obesidade grau II.");
        } else {
            System.out.println("Obesidade grau III (Obesidade Mórbida).");
        }
    }

    // Classificação para homens acima de 65 anos
    public static void classificarIMCMasculinoAcima65(double imc) {
        if (imc < 21.9) {
            System.out.println("Baixo Peso.");
        } else if (imc >= 22 && imc < 27) {
            System.out.println("Peso Normal.");
        } else if (imc >= 27 && imc < 30) {
            System.out.println("Sobrepeso.");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade grau I.");
        } else if (imc >= 35 && imc < 39.9) {
            System.out.println("Obesidade grau II.");
        } else {
            System.out.println("Obesidade grau III (Obesidade Mórbida).");
        }
    }

    // Classificação para crianças
    public static void classificarIMCCrianca(String sexo, int idade, double imc) {
        if (sexo.equalsIgnoreCase("M")) {
            if (idade == 2) {
                if (imc < 14.8) {
                    System.out.println("Baixo Peso.");
                } else if (imc >= 14.8 && imc < 18.2) {
                    System.out.println("Peso Normal.");
                } else if (imc >= 18.2 && imc < 19.2) {
                    System.out.println("Sobrepeso.");
                } else {
                    System.out.println("Obesidade.");
                }
            } else if (idade == 4) {
                if (imc < 14) {
                    System.out.println("Baixo Peso.");
                } else if (imc >= 14 && imc < 16.8) {
                    System.out.println("Peso Normal.");
                } else if (imc >= 16.8 && imc < 17.8) {
                    System.out.println("Sobrepeso.");
                } else {
                    System.out.println("Obesidade.");
                }
            } else if (idade == 6) {
                if (imc < 13.8) {
                    System.out.println("Baixo Peso.");
                } else if (imc >= 13.8 && imc < 17) {
                    System.out.println("Peso Normal.");
                } else if (imc >= 17 && imc < 18.4) {
                    System.out.println("Sobrepeso.");
                } else {
                    System.out.println("Obesidade.");
                }
            } else if (idade == 8) {
                if (imc < 13.8) {
                    System.out.println("Baixo Peso.");
                } else if (imc >= 13.8 && imc < 17.8) {
                    System.out.println("Peso Normal.");
                } else if (imc >= 17.8 && imc < 20) {
                    System.out.println("Sobrepeso.");
                } else {
                    System.out.println("Obesidade.");
                }
            } else if (idade == 10) {
                if (imc < 14.2) {
                    System.out.println("Baixo Peso.");
                } else if (imc >= 14.2 && imc < 19.4) {
                    System.out.println("Peso Normal.");
                } else if (imc >= 19.4 && imc < 22) {
                    System.out.println("Sobrepeso.");
                } else {
                    System.out.println("Obesidade.");
                }
            } else if (idade == 11 || idade == 12) {
                if (imc < 15) {
                    System.out.println("Baixo Peso.");
                } else if (imc >= 15 && imc < 21) {
                    System.out.println("Peso Normal.");
                } else if (imc >= 21 && imc < 24.2) {
                    System.out.println("Sobrepeso.");
                } else {
                    System.out.println("Obesidade.");
                }
            } else {
                System.out.println("Idade inválida para cálculo.");
            }
        } else if (sexo.equalsIgnoreCase("F")) {
            if (idade == 1 || idade == 2) {
                if (imc < 14.4) {
                    System.out.println("Baixo Peso.");
                } else if (imc >= 14.4 && imc < 18) {
                    System.out.println("Peso Normal.");
                } else if (imc >= 18 && imc < 19) {
                    System.out.println("Sobrepeso.");
                } else {
                    System.out.println("Obesidade.");
                }
            } else if (idade == 3 || idade == 4) {
                if (imc < 13.6) {
                    System.out.println("Baixo Peso.");
                } else if (imc >= 13.6 && imc < 16.8) {
                    System.out.println("Peso Normal.");
                } else if (imc >= 16.8 && imc < 18) {
                    System.out.println("Sobrepeso.");
                } else {
                    System.out.println("Obesidade.");
                }
            } else if (idade == 5 || idade == 6) {
                if (imc < 13.4) {
                    System.out.println("Baixo Peso.");
                } else if (imc >= 13.4 && imc < 17) {
                    System.out.println("Peso Normal.");
                } else if (imc >= 17 && imc < 18.6) {
                    System.out.println("Sobrepeso.");
                } else {
                    System.out.println("Obesidade.");
                }
            } else if (idade == 7 || idade == 8) {
                if (imc < 13.4) {
                    System.out.println("Baixo Peso.");
                } else if (imc >= 13.4 && imc < 18.4) {
                    System.out.println("Peso Normal.");
                } else if (imc >= 18.4 && imc < 20.8) {
                    System.out.println("Sobrepeso.");
                } else {
                    System.out.println("Obesidade.");
                }
            } else if (idade == 9 || idade == 10) {
                if (imc < 14) {
                    System.out.println("Baixo Peso.");
                } else if (imc >= 14 && imc < 20) {
                    System.out.println("Peso Normal.");
                } else if (imc >= 20 && imc < 23) {
                    System.out.println("Sobrepeso.");
                } else {
                    System.out.println("Obesidade.");
                }
            } else if (idade == 11 || idade == 12) {
                if (imc < 14.8) {
                    System.out.println("Baixo Peso.");
                } else if (imc >= 14.8 && imc < 21.6) {
                    System.out.println("Peso Normal.");
                } else if (imc >= 21.6 && imc < 25.2) {
                    System.out.println("Sobrepeso.");
                } else {
                    System.out.println("Obesidade.");
                }
            } else {
                System.out.println("Idade inválida para cálculo.");
            }
        } else {
            System.out.println("Sexo inválido.");
        }
    }
}