package sobreescrita;

import java.util.Date;

// Subclasse Funcionario (herda a classe Pessoa)
public class Funcionario extends Pessoa {
    // Atributos especializados
    public double salario;
    public Date dataAdmissao;
    public String cargo;
    // Construtor
    public Funcionario(String nome, String cpf, Date dataNascimento){
        // Utilizando o comportamento da superclasse (classe mãe)
        super(nome, cpf, dataNascimento);
    }
}
