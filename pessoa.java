// Exemplo de uma classe Pessoa com métodos getters e setters para atributos

// Como é uma classe pública, pode ser acessada por outras classes

public class Pessoa {
    // Atributos privados
    private String nome;
    private String cpf;
    private String[] telefones;

    // Então precisamos ter métodos getters e setters para acessar e alterar o
    // valor dessas propriedades

    // Métodos Getters

    public String getNome(){  // Para o nome
        return nome;
    }

    public String getCPF(){  // Para o cpf
        return cpf;
    }

    public String getTelefones(){  // Para os telefones
        return telefones;
    }

    // Métodos Setters

    public void setNome(String nomePessoa){  // Para o nome
        this.nome = nomePessoa;
    }

    public void setCPF(String numeroCPF){  // Para o cpf
        this.cpf = numeroCPF;
    }

    public void setTelefones(String[] telefones){  // Para os telefones
        this.telefones = telefones;
    }
}
