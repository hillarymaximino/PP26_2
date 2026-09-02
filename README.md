      PROJETO CALCULADORA BÁSICA - ORIENTAÇÃO A OBJETOS

1. IDENTIFICAÇÃO DO ALUNO(A)
--------------------------------------------------------------------
Aluno(a): Hillary Maximino Andrade
Matrícula SUAP: 202411250017
Curso: Engenharia de Computação (IFPB)
Disciplina: Padrões de Projeto / Orientação a Objetos

2. AMBIENTE DE DESENVOLVIMENTO
--------------------------------------------------------------------
Para garantir a compatibilidade e execução correta do projeto, as 
seguintes ferramentas e versões foram utilizadas:

- Versão do compilador Java: Oracle OpenJDK 26.0.2.1
- IDE e respectiva versão: IntelliJ IDEA Community Edition
- Sistema Operacional e versão: Windows 11
- Tipo da Biblioteca criada para Calculadora_202411250017: .jar

3. DESCRIÇÃO DA ARQUITETURA E MÉTODOS
--------------------------------------------------------------------
O sistema foi desenvolvido utilizando o paradigma de Orientação a 
Objetos, sendo dividido em duas classes concretas principais:

A) Classe Cliente_202411250017:
Responsável por instanciar a calculadora e disparar a sequência de 
chamadas (testes) para as operações matemáticas. Contém o método 
"public static void main(String[] args)", servindo como o ponto de 
partida (entry-point) da aplicação.

B) Classe Calculadora_202411250017 (Biblioteca):
Fornece as operações matemáticas públicas. Abaixo está a descrição 
detalhada de cada método implementado:

* somar(double a, double b)
  - Descrição: Recebe dois números reais (double) como parâmetros.
  - Retorno: Retorna a soma aritmética de 'a' e 'b'.

* subtrair(double a, double b)
  - Descrição: Recebe dois números reais (double) como parâmetros.
  - Retorno: Retorna a diferença aritmética, subtraindo 'b' de 'a'.

* multiplicar(double a, double b)
  - Descrição: Recebe dois números reais (double) como parâmetros.
  - Retorno: Retorna o produto da multiplicação entre 'a' e 'b'.

* dividir(double a, double b)
  - Descrição: Recebe dois números reais (double) como parâmetros e
    realiza a divisão do primeiro pelo segundo. 
  - Tratamento de Exceção Lógica: O método possui uma estrutura 
    condicional (if) para verificar se o divisor ('b') é igual a 0. 
    Caso seja, ele imprime uma mensagem de erro no terminal shell 
    para evitar a interrupção abrupta do sistema e retorna 0.0. 
    Caso contrário, retorna o quociente de 'a' por 'b'.
====================================================================
