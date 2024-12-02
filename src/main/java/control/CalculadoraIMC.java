package control;

import java.util.ArrayList;

public class CalculadoraIMC {
    private final double[][] PERCENTIL_MENINOS = {
            {14.7, 18.2, 19.2}, // Idade 2 anos
            {14.0, 17.0, 17.8}, // Idade 4 anos
            {13.8, 17.0, 18.5}, // Idade 6 anos
            {13.8, 17.9, 20.0}, // Idade 8 anos
            {14.2, 19.2, 22.0}, // Idade 10 anos
            {15.0, 21.0, 24.0}  // Idade 12 anos
    };
    private final double[][] PERCENTIL_MENINAS = {
            {14.4, 18.0, 19.0},
            {13.8, 16.8, 18.1},
            {13.5, 17.1, 18.8},
            {13.5, 18.2, 20.5},
            {14.0, 20.0, 23.0},
            {14.9, 21.8, 25.0}
    };

    public String calcularImc(double peso, double altura, int idade, String sexo) {

        double imc = peso / (altura * altura);

/////////////////////////////////////////CATEGORIA ADULTO///////////////////////////////////////////////
        if (idade >= 20 && idade <= 65) {
            if (imc < 16.00) return "Baixo peso muito grave";
            if (imc >= 16.00 && imc < 17.0) return "Baixo peso grave";
            if (imc >= 17.00 && imc < 18.5) return "Baixo peso";
            if (imc >= 18.50 && imc < 25.0) return "Peso normal";
            if (imc >= 25.00 && imc < 30.0) return "Sobrepeso";
            if (imc >= 30.00 && imc < 35.0) return "Obesidade grau I";
            if (imc >= 35.00 && imc < 40.0) return "Obesidade grau II";
            if (imc > 40.00) return "Obesidade grau III (mórbida)";
        }

/////////////////////////////////////////CATEGORIA IDOSOS///////////////////////////////////////////////
        else if (idade > 65) {
            if (sexo.equalsIgnoreCase("feminino")) {
                if (imc < 21.90) return "Baixo peso";
                if (imc >= 21.90 && imc < 27.00) return "Peso normal";
                if (imc >= 27.0 && imc < 32.00) return "Sobrepeso";
                if (imc >= 32.0 && imc < 37.00) return "Obesidade grau I";
                if (imc >= 37.0 && imc < 42.0) return "Obesidade grau II";
                if (imc > 42.00) return "Obesidade grau III (mórbida)";

            } else if (sexo.equalsIgnoreCase("masculino")) {
                if (imc < 21.90) return "Baixo peso";
                if (imc >= 21.90 && imc < 27.00) return "Peso normal";
                if (imc >= 27.0 && imc < 30.00) return "Sobrepeso";
                if (imc >= 30.0 && imc < 35.00) return "Obesidade grau I";
                if (imc >= 35.0 && imc < 40.0) return "Obesidade grau II";
                if (imc >= 40.00) return "Obesidade grau III (mórbida)";
            }
        }


/////////////////////////////////////////CATEGORIA CRIANCAS///////////////////////////////////////////////
        else if (idade % 2 == 0 && idade > 0 && idade <= 12 ) {
            if (sexo.equalsIgnoreCase("masculino")) {
                double[] testes = PERCENTIL_MENINOS[(idade / 2) - 1];
                if (imc < testes[0]) return "Baixo peso";
                if (imc >= testes[0] && imc < testes[1]) return "Peso normal";
                if (imc >= testes[1] && imc < testes[2]) return "Sobrepeso";
                if (imc >= testes[2]) return "Obeso";
            }
            if (sexo.equalsIgnoreCase("feminino")) {
                double[] testes = PERCENTIL_MENINAS[(idade / 2) - 1];
                if (imc < testes[0]) return "Baixo peso";
                if (imc >= testes[0] && imc < testes[1]) return "Peso normal";
                if (imc >= testes[1] && imc < testes[2]) return "Sobrepeso";
                if (imc >= testes[2]) return "Obeso";
            }
        }

        return "Dados inválidos";
    }
}


