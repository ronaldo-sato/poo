package sobrescrita;

import java.util.Date;

// Subclasse Professor (herda a classe Pessoa)
public class Professor extends Pessoa {
    // Atributos especializados
    public double salario;
    public String disciplina;
    // Construtor
    public Professor(String nome, String cpf, Date dataNascimento){
        // Utilizando o comportamento da superclasse (classe mãe)
        // super faz referência a superclasse (construtor da classe mãe)
        super(nome, cpf, dataNascimento);
    }
}
