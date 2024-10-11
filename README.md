# Java-POO-Study
Este repositório contém exercícios complementares de Programação Orientada a Objetos (POO) do curso de Análise e Desenvolvimento de Sistemas (ADS).

## Exercício 1 - Escrita por Antônio Dias (Professor)
Crie uma classe `Estudante` com atributos para `nome`, `matrícula` e `três notas`. Implemente métodos para calcular a média das notas e determinar se o aluno foi aprovado ou reprovado, considerando que a média para ser aprovado é 70. Crie objetos Estudante e imprima informações dos objetos.

- A classe `Estudante` deve possuir o construtor `Estudante(String nome, int matricula, double n1, double n2, double n3)`
- A classe `Estudante` deve possuir o método `double getMedia()` que retorna o cálculo da média das notas do estudante
- A classe `Estudante` deve possuir um método `void setNotas(double n1, double n2, double n3)` para definir as três notas de uma vez
- A classe `Estudante` deve possuir métodos `double getNota1()`, `double getNota2()` e `double getNota3()`
- **Crie uma exceção NotaInvalidaException, que deve ser lançada quando uma nota negativa é passada para os métodos que recebem nota** (Não consegui implementar)
- Crie um caso de teste para testar o método `double getMedia()`
- Crie um caso de teste para testar os métodos `void setNotas(double n1, double n2, double n3)`, `double getNota1()`, `double getNota2()` e `double getNota3()`

## Estrutura do Repositório

- `Estudante.java`: Define a classe `Estudante` com seus atributos e métodos.
- `LICENSE`: Arquivo de licença (MIT License).
- `Main.java`: Contém a classe principal que executa o programa.
- `README.md`: Este arquivo com informações sobre o projeto.

## Como Executar

Para executar o programa, utilize os seguintes comandos no terminal:

```bash
javac Main.java Estudante.java
java Main
