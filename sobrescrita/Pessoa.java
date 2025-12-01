package sobrescrita;

import java.util.Date;

// Classe mãe (superclasse): mais genérica (será a base para as 
// classes Aluno, Professor e Funcionario)
public class Pessoa {
    public String nome;
    public String cpf;
    public Date dataNascimento;

    // Construtor
    public Pessoa(String nome, String cpf, Date dataNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
}
