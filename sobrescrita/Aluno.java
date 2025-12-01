package sobrescrita;

import java.util.Date;

// Subclasse Aluno (herda a classe Pessoa)
public class Aluno extends Pessoa {
    // Atributos especializados
    public String matricula;
    // Construtor
    public Aluno(String nome, String cpf, Date dataNascimento){
        // Utilizando o comportamento da superclasse (classe mãe)
        // super faz referência a superclasse (construtor da classe mãe)
        super(nome, cpf, dataNascimento);
    }
}
