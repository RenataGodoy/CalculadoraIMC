package control;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraIMCTeste {
    CalculadoraIMC calcImc;

    @Before
    public void setup() {
        calcImc = new CalculadoraIMC();
    }
//////////////////////////////////////ADULTO//////////////////////////////////////////////////////////////////////////////
    // Baixo peso muito grave - abaixo de 16 - check
    @Test
    public void testeAdultoBaixoPesoMuitoGraveInferior() {
        Assert.assertEquals("Baixo peso muito grave", calcImc.calcularImc(49, 1.751, 25, "feminino"));
        // RESULTADO ESPERADO 15.98
    }

    // Baixo peso grave - 16 - 16,99 - check
    @Test
    public void testeAdultoBaixoPesoGraveInferior() {
        Assert.assertEquals("Baixo peso grave", calcImc.calcularImc(49, 1.751, 30, "feminino"));
        // RESULTADO ESPERADO 15.98
    }
    @Test
    public void testeAdultoBaixoPesoGraveSuperior() {
        Assert.assertEquals("Baixo peso grave", calcImc.calcularImc(52, 1.75, 28, "masculino"));
        // RESULTADO ESPERADO 16,98
    }

    // Baixo peso - 17 - 18,49 - check
    @Test
    public void testeAdultoBaixoPesoInferior() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(54, 1.78, 35, "feminino"));
        // RESULTADO ESPERADO 17.04
    }
    @Test
    public void testeAdultoBaixoPesoSuperior() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(48, 1.62, 50, "masculino"));
        // RESULTADO ESPERADO 18.29
    }

    // Peso normal - 18,50 - 24,99  - check
    @Test
    public void testeAdultoPesoNormalInferior() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(55, 1.72, 40, "feminino"));
        // RESULTADO ESPERADO 18.59
    }
    @Test
    public void testeAdultoPesoNormalSuperior() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(74, 1.73, 29, "masculino"));
        // RESULTADO ESPERADO 24.73
    }

    // Sobrepeso - 25 - 29,99  - check
    @Test
    public void testeAdultoSobrepesoInferior() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(79, 1.777, 45, "feminino"));
        // RESULTADO ESPERADO 25.02
    }
    @Test
    public void testeAdultoSobrepesoSuperior() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(86, 1.701, 37, "masculino"));
        // RESULTADO ESPERADO 29.72
    }

    // Obesidade grau I - 30 - 34,99  - check
    @Test
    public void testeAdultoObesidadeGrauIInferior() {
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(87, 1.70, 45, "feminino"));
        // RESULTADO ESPERADO 30.10
    }
    @Test
    public void testeAdultoObesidadeGrauISuperior() {
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(89, 1.60, 39, "masculino"));
        // RESULTADO ESPERADO 34.77
    }

    // Obesidade grau II - maior q 40
    @Test
    public void testeAdultoObesidadeGrauII() {
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(103, 1.6, 45, "feminino"));
        // RESULTADO ESPERADO 40.23

    }






//////////////////////////////////////IDOSOS MULHERES 65+//////////////////////////////////////////
    // Baixo peso - abaixo de 21,9
    @Test
    public void testeIdosaBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(42, 1.65, 70, "feminino"));
        // RESULTADO ESPERADO 21.8
    }

    // Peso normal - 22 a 27
    @Test
    public void testeIdosaPesoNormalInferior() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(56, 1.65, 70, "feminino"));
        // RESULTADO ESPERADO 22.2
    }
    @Test
    public void testeIdosaPesoNormalSuperior() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(72, 1.60, 75, "feminino"));
        // RESULTADO ESPERADO 26.8
    }

    // Sobrepeso - 27,1 a 32
    @Test
    public void testeIdosaSobrepesoInferior() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(80, 1.60, 75, "feminino"));
        // RESULTADO ESPERADO 27.1
    }
    @Test
    public void testeIdosaSobrepesoSuperior() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(88, 1.62, 80, "feminino"));
        // RESULTADO ESPERADO 32.0
    }

    // Obesidade grau I - 32,1 a 37
    @Test
    public void testeIdosaObesidadeGrauIInferior() {
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(90, 1.60, 75, "feminino"));
        // RESULTADO ESPERADO 32.3
    }
    @Test
    public void testeIdosaObesidadeGrauISuperior() {
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(100, 1.55, 80, "feminino"));
        // RESULTADO ESPERADO 37.0
    }

    // Obesidade grau II - 37,1 a 41,9
    @Test
    public void testeIdosaObesidadeGrauIIInferior() {
        Assert.assertEquals("Obesidade grau II", calcImc.calcularImc(110, 1.55, 85, "feminino"));
        // RESULTADO ESPERADO 39.6
    }
    @Test
    public void testeIdosaObesidadeGrauIISuperior() {
        Assert.assertEquals("Obesidade grau II", calcImc.calcularImc(110, 1.55, 85, "feminino"));
        // RESULTADO ESPERADO 39.6
    }

    // Obesidade grau III - acima de 42
    @Test
    public void testeIdosaObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III", calcImc.calcularImc(120, 1.55, 85, "feminino"));
        // RESULTADO ESPERADO 49.8
    }

//////////////////////////////////////IDOSOS HOMENS 65+//////////////////////////////////////////

    // Baixo peso - abaixo de 21,9  - check
    @Test
    public void testeIdosoBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(67, 1.75, 70, "masculino"));
        // RESULTADO ESPERADO 21.88
    }

    // Peso normal - 22 a 27  - check
    @Test
    public void testeIdosoPesoNormalInferior() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(70, 1.75, 70, "masculino"));
        // RESULTADO ESPERADO 22.86
    }
    @Test
    public void testeIdosoPesoNormalSuperior() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(78, 1.70, 75, "masculino"));
        // RESULTADO ESPERADO 26.99
    }

    // Sobrepeso - 27,1 a 30  - check
    @Test
    public void testeIdosoSobrepesoInferior() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(85, 1.75, 75, "masculino"));
        // RESULTADO ESPERADO 27.76
    }
    @Test
    public void testeIdosoSobrepesoSuperior() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(95, 1.79, 85, "masculino"));
        // RESULTADO ESPERADO 30.3
    }

    // Obesidade grau I - 30,1 a 35  - check
    @Test
    public void testeIdosoObesidadeGrauIInferior() {
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(89, 1.71, 85, "masculino"));
        // RESULTADO ESPERADO 30.44
    }
    @Test
    public void testeIdosoObesidadeGrauISuperior() {
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(91, 1.61, 90, "masculino"));
        // RESULTADO ESPERADO 35.11
    }

    // Obesidade grau II - 35,1 a 39,9  - check
    @Test
    public void testeIdosoObesidadeGrauIIInferior() {
        Assert.assertEquals("Obesidade grau II", calcImc.calcularImc(111, 1.775, 90, "masculino"));
        // RESULTADO ESPERADO 35.23
    }
    @Test
    public void testeIdosoObesidadeGrauIISuperior() {
        Assert.assertEquals("Obesidade grau II", calcImc.calcularImc(115, 1.70, 90, "masculino"));
        // RESULTADO ESPERADO 39.79
    }

    // Obesidade grau III - acima de 40 - check
    @Test
    public void testeIdosoObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III", calcImc.calcularImc(120, 1.70, 90, "masculino"));
        // RESULTADO ESPERADO 41.52
    }




// THIAGO
//    @Test
//    public void testeAdultoBaixoPesoMuitoGrave() {
//        Assert.assertEquals("Baixo peso muito grave", calcImc.calcularImc(48.0, 1.735, 20, "masculino"));
//    }
//
//    @Test
//    public void testeAdultoBaixoPesoGraveInferior() {
//        Assert.assertEquals("Baixo peso grave", calcImc.calcularImc(48.0, 1.73, 20, "feminino"));
//    }
//
//    @Test
//    public void testeAdultoBaixoPesoGraveSuperior() {
//        Assert.assertEquals("Baixo peso grave", calcImc.calcularImc(50.0, 1.72, 65, "masculino"));
//    }
//
//    @Test
//    public void testeMenina4anosObesidade() {
//        Assert.assertEquals("Obesidade", calcImc.calcularImc(50.0, 1.639, 4, "feminino"));
//    }
}
