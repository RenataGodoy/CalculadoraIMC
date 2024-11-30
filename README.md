# Calculadora IMC - JUnit

Este projeto é uma implementação de uma **Calculadora de IMC** (Índice de Massa Corporal) em **Java**, e testes automatizados utilizando **JUnit 4** com suporte a diferentes faixas etárias: **adultos**, **idosos** e **crianças**. O cálculo é realizado com base nas categorias de IMC recomendadas pela **Organização Mundial da Saúde (OMS)**.

## Tecnologias Utilizadas

- **Java 21**: Linguagem de programação principal.
- **JUnit 4**: Framework utilizado para os testes unitários.
- **Maven**: Gerenciador de dependências.
- **IDE**: IntelliJ IDEA.

- ## Testes

- A base de testes é composta por **82 testes** divididos entre 14 de **adultos**,  20 de **idosos** e  48 de **crianças**.
- A cobertura de testes inclui as diferentes faixas de IMC e valida se a classificação é feita corretamente conforme os parâmetros fornecidos no site https://www.mdsaude.com/obesidade/calcule-o-seu-peso-ideal-e-imc/

## Funcionalidades

- Cálculo de IMC baseado nas faixas específicas
- Classificação do IMC em categorias:
  - **Baixo Peso**
  - **Peso Normal**
  - **Sobrepeso**
  - **Obesidade (graus I, II, III)**
- Testes automatizados de todos os casos de uso para adultos, idosos e crianças.


