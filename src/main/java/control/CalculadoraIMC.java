package control;

public class CalculadoraIMC {

    public String calcularImc(double peso, double altura, int idade, String sexo) {

        double imc = peso / (altura * altura);

/////////////////////////////////////////CATEGORIA ADULTO///////////////////////////////////////////////
        if (idade >= 20 && idade <= 65) {
            if (imc < 16.00) return "Baixo peso muito grave";
            if (imc >= 16.00 && imc <= 16.99) return "Baixo peso grave";
            if (imc >= 17.00 && imc <= 18.49) return "Baixo peso";
            if (imc >= 18.50 && imc <= 24.99) return "Peso normal";
            if (imc >= 25.00 && imc <= 29.99) return "Sobrepeso";
            if (imc >= 30.00 && imc <= 34.99) return "Obesidade grau I";
            if (imc >= 35.00 && imc <= 39.99) return "Obesidade grau II";
            if (imc > 40.00) return "Obesidade grau III (mórbida)";
        }

/////////////////////////////////////////CATEGORIA IDOSOS///////////////////////////////////////////////
        if (idade > 65) {
            if (sexo.equalsIgnoreCase("feminino")) {
                if (imc < 21.90) return "Baixo peso";
                if (imc >= 21.90 && imc <= 27.00) return "Peso normal";
                if (imc >= 27.10 && imc <= 32.00) return "Sobrepeso";
                if (imc >= 32.10 && imc <= 37.00) return "Obesidade grau I";
                if (imc >= 37.10 && imc <= 41.90) return "Obesidade grau II";
                if (imc > 42.00) return "Obesidade grau III (mórbida)";

            } else if (sexo.equalsIgnoreCase("masculino")) {
                if (imc < 21.90) return "Baixo peso";
                if (imc >= 21.90 && imc <= 27.00) return "Peso normal";
                if (imc >= 27.10 && imc <= 30.00) return "Sobrepeso";
                if (imc >= 30.10 && imc <= 35.00) return "Obesidade grau I";
                if (imc >= 35.10 && imc <= 39.90) return "Obesidade grau II";
                if (imc > 40.00) return "Obesidade grau III (mórbida)";
            }
        }

        return "Dados inválidos";
    }
}
