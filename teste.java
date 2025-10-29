// Primeiro programa em Java

// barra-barra são comentários e são ignorados pelo compilador 

// Todo programa em Java tem um método chamado main e todo programa Java
// executa uma thread por padrão (iremos tratar sobre threads em aula posterior,
// mas foi um conceito apresentado em Sistemas Operacionais quando se falou em 
// ramificação de fluxo e processos). 

// Por padrão o nome da classe é o mesmo que o nome do programa

// A declaração da classe se dá primeiramente por meio de um modificador de 
// acesso, que determina quem tem acesso a executar algumas instâncias dessa
// classe, que são chamadas de objetos. 

// Definição de uma classe no contexto de orientação à objeto: ela vai 
// especificar um pacote de instruções (tipos de dados, operações que podem ser
// feitas, quem pode fazer essas operações, como essas operações são acessadas, 
// qual a hierarquia de acesso para determinadas operações que fazem parte 
// daquela classe,...)
public class Teste
{
    // Método main: podemos fazer qualquer interação com o uruário, desenvolver
    // funções, chamar essas funções ou da própria linguagem Java, para expor 
    // saídas dos mais variados formatos, fazer acesso a outras classes,...
    public static void main (String[] args)
    // De modo geral, classes que recebem argumentos de entrada do usuário tem 
    // um método estático.
    {
        // A entrada é tratada como string, ainda que tenham os conversores, 
        // Java possui um grande conjunto de classes para tratar entrada do 
        // usuário e uma delas é a scanner 
        System.out.println ("Olá Java!");
    }
}