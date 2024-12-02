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

//////////////////////////////////////CRIANCAS//////////////////////////////////////////
//////////////////////////////////////MENINOS//////////////////////////////////////////
    @Test
    public void criancaMeninoBaixoPesoIdade2() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(10.4, 0.85, 2, "masculino")) ;
        // IMC = 14.6
    }

    @Test
    public void criancaMeninoPesoNormalIdade2() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(13.07, 0.85, 2, "masculino")) ;
        // IMC = 18.2
    }

    @Test
    public void criancaMeninoSobrepesoIdade2() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(13.79, 0.85, 2, "masculino")) ;
        // IMC = 19.2
    }

    @Test
    public void criancaMeninoObesoIdade2() {
        Assert.assertEquals("Obeso", calcImc.calcularImc(13.9, 0.85, 2, "masculino")) ;
        // IMC = 19.3
    }

    @Test
    public void criancaMeninoBaixoPesoIdade4() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(13.9, 1.0, 4, "masculino")) ;
        // IMC = 13.9
    }

    @Test
    public void criancaMeninoPesoNormalIdade4() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(17.0, 1.0, 4, "masculino")) ;
        // IMC = 17.0
    }

    @Test
    public void criancaMeninoSobrepesoIdade4() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(17.79, 1.0, 4, "masculino")) ;
        // IMC = 17.79
    }

    @Test
    public void criancaMeninoObesoIdade4() {
        Assert.assertEquals("Obeso", calcImc.calcularImc(18.0, 1.0, 4, "masculino")) ;
        // IMC = 18.0
    }

    @Test
    public void criancaMeninoBaixoPesoIdade6() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(16.5, 1.10, 6, "masculino")) ;
        // IMC = 13.7
    }

    @Test
    public void criancaMeninoPesoNormalIdade6() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(20.57, 1.10, 6, "masculino")) ;
        // IMC = 17.0
    }

    @Test
    public void criancaMeninoSobrepesoIdade6() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(22.38, 1.10, 6, "masculino")) ;
        // IMC = 18.5
    }

    @Test
    public void criancaMeninoObesoIdade6() {
        Assert.assertEquals("Obeso", calcImc.calcularImc(22.5, 1.10, 6, "masculino")) ;
        // IMC = 18.6
    }

    @Test
    public void criancaMeninoBaixoPesoIdade8() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(21.56, 1.25, 8, "masculino")) ;
        // IMC = 13.8
    }

    @Test
    public void criancaMeninoPesoNormalIdade8() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(27.81, 1.25, 8, "masculino")) ;
        // IMC = 17.8
    }

    @Test
    public void criancaMeninoSobrepesoIdade8() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(30, 1.25, 8, "masculino")) ;
        // IMC = 19.2
    }

    @Test
    public void criancaMeninoObesoIdade8() {
        Assert.assertEquals("Obeso", calcImc.calcularImc(31.25, 1.25, 8, "masculino")) ;
        // IMC = 20
    }

    @Test
    public void criancaMeninoBaixoPesoIdade10() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(25.87, 1.35, 10, "masculino")) ;
        // IMC = 14.2
    }

    @Test
    public void criancaMeninoPesoNormalIdade10() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(34.8, 1.35, 10, "masculino")) ;
        // IMC = 19.1
    }

    @Test
    public void criancaMeninoSobrepesoIdade10() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(39.91, 1.35, 10, "masculino")) ;
        // IMC = 21.9
    }

    @Test
    public void criancaMeninoObesoIdade10() {
        Assert.assertEquals("Obeso", calcImc.calcularImc(40.1, 1.35, 10, "masculino")) ;
        // IMC = 22
    }

    @Test
    public void criancaMeninoBaixoPesoIdade12() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(31.32, 1.45, 12, "masculino")) ;
        // IMC < 15
    }

    @Test
    public void criancaMeninoPesoNormalIdade12() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(44.15, 1.45, 12, "masculino")) ;
        // IMC = 21
    }

    @Test
    public void criancaMeninoSobrepesoIdade12() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(50.4, 1.45, 12, "masculino")) ;
        // IMC = 24
    }

    @Test
    public void criancaMeninoObesoIdade12() {
        Assert.assertEquals("Obeso", calcImc.calcularImc(50.46, 1.45, 12, "masculino")) ;
        // IMC > 24.0
    }

//////////////////////////////////////MENINAS//////////////////////////////////////////
    @Test
    public void criancaMeninaBaixoPesoIdade2() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(14.3, 0.85, 2, "feminino")) ;
        // IMC = 14.3
    }

    @Test
    public void criancaMeninaPesoNormalIdade2() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(17.9, 0.85, 2, "feminino")) ;
        // IMC = 17.9
    }

    @Test
    public void criancaMeninaSobrepesoIdade2() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(18.9, 0.85, 2, "feminino")) ;
        // IMC = 18.9
    }

    @Test
    public void criancaMeninaObesoIdade2() {
        Assert.assertEquals("Obeso", calcImc.calcularImc(19.2, 0.85, 2, "feminino")) ;
        // IMC = 19.2
    }

    @Test
    public void criancaMeninaBaixoPesoIdade4() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(13.7, 1.05, 4, "feminino")) ;
        // IMC = 13.7
    }

    @Test
    public void criancaMeninaPesoNormalIdade4() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(16.7, 1.05, 4, "feminino")) ;
        // IMC = 16.7
    }

    @Test
    public void criancaMeninaSobrepesoIdade4() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(18.0, 1.05, 4, "feminino")) ;
        // IMC = 18.0
    }

    @Test
    public void criancaMeninaObesoIdade4() {
        Assert.assertEquals("Obeso", calcImc.calcularImc(18.3, 1.05, 4, "feminino")) ;
        // IMC = 18.3
    }

    @Test
    public void criancaMeninaBaixoPesoIdade6() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(16.33, 1.10, 6, "feminino")) ;
        // IMC < 13.5
    }

    @Test
    public void criancaMeninaPesoNormalIdade6() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(20.69, 1.10, 6, "feminino")) ;
        // IMC = 17.1
    }

    @Test
    public void criancaMeninaSobrepesoIdade6() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(22.7, 1.10, 6, "feminino")) ;
        // IMC = 18.8
    }

    @Test
    public void criancaMeninaObesoIdade6() {
        Assert.assertEquals("Obeso", calcImc.calcularImc(22.74, 1.10, 6, "feminino")) ;
        // IMC > 18.8
    }

    @Test
    public void criancaMeninaBaixoPesoIdade8() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(19.43, 1.20, 8, "feminino")) ;
        // IMC < 13.5
    }

    @Test
    public void criancaMeninaPesoNormalIdade8() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(26.2, 1.20, 8, "feminino")) ;
        // IMC = 18.2
    }

    @Test
    public void criancaMeninaSobrepesoIdade8() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(29.51, 1.20, 8, "feminino")) ;
        // IMC = 20.5
    }

    @Test
    public void criancaMeninaObesoIdade8() {
        Assert.assertEquals("Obeso", calcImc.calcularImc(29.53, 1.20, 8, "feminino")) ;
        // IMC > 20.5
    }

    @Test
    public void criancaMeninaBaixoPesoIdade10() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(23.66, 1.30, 10, "feminino")) ;
        // IMC = 14
    }

    @Test
    public void criancaMeninaPesoNormalIdade10() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(33.8, 1.30, 10, "feminino")) ;
        // IMC = 20
    }

    @Test
    public void criancaMeninaSobrepesoIdade10() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(38.86, 1.30, 10, "feminino")) ;
        // IMC = 23
    }

    @Test
    public void criancaMeninaObesoIdade10() {
        Assert.assertEquals("Obeso", calcImc.calcularImc(38.88, 1.30, 10, "feminino")) ;
        // IMC > 23
    }

    @Test
    public void criancaMeninaBaixoPesoIdade12() {
        Assert.assertEquals("Baixo peso", calcImc.calcularImc(31.32, 1.45, 12, "feminino")) ;
        // IMC < 14.9
    }

    @Test
    public void criancaMeninaPesoNormalIdade12() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(45.83, 1.45, 12, "feminino")) ;
        // IMC = 21.8
    }

    @Test
    public void criancaMeninaSobrepesoIdade12() {
        Assert.assertEquals("Sobrepeso", calcImc.calcularImc(52.56, 1.45, 12, "feminino")) ;
        // IMC = 25
    }

    @Test
    public void criancaMeninaObesoIdade12() {
        Assert.assertEquals("Obeso", calcImc.calcularImc(52.57, 1.45, 12, "feminino")) ;
        // IMC > 25
    }
}
