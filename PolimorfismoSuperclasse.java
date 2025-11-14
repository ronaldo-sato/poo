
// POLIMORFISMO

// Caracteriza-se por sobreescrever/reescrever um método da classe mãe, 
// declarando um método com a mesma assinatura. 

// A vantagem disso, é que os objetos vão ter a capacidade de responder a uma 
// mesma mensagem (chamada de métodos) de modos diferentes.

// Por isso, a reescrita é também chamada de sobreposição.

// Por exemplo no mundo real, carro, bibicleta, ônibus se movem. Sendo mover um 
// método dessas classes, esse método poderá ser especializado em cada 
// classe para mover o respectivo tipo, já que se movem de formas diferentes 
// (então será o mesmo método mas com assinaturas diferentes, já que a ação
// será a mesma mas o modo será distinto). 

// Em relação à execução do programa quanto à sobreposição de métodos, a JVM 
// (Java Virtual Machine) procura a implementação mais especializada seguindo a
// hierarquia de baixo para cima, ou seja, da classe mais específica (filha) 
// para a classe mais genérica (mãe). Então, se o método estiver sobreescrito 
// na classe filha, estando implementado tanto na classe filha como na classe 
// mãe, primeiro o método é buscado primeiro na filha e depois na mãe. 

// Se o método não for definido na classe filha, a JVM procura pela 
// implementação da classe mãe. Então, ao chamar um método na classe filha que 
// não foi definido nela, naturalmente estará sendo usado o método da classe 
// mãe, mas primeiro a JVM procura por esse método (com mesmo nome embora com 
// assinatura diferente) na classe filha, e não encontrando a JVM assume que o 
// método usado é o da classe mãe, ainda que esse método esteja sendo usado 
// dentro de uma classe mais especializada.

// Quando um método é sobreescrito na classe filha, ele passa a ter o 
// comportamento padrão dessa classe, embora seja possível acessar o método da
// superclasse.

// Portanto, a sobreescrita de métodos ocorre quando um método da classe mãe é 
// redefinido na classe filha, assim, os métodos tem a mesma assinatura e o 
// mesmo tipo de retorno.

// Mas, se no caso for necessário utilizar o comportamento definido pela classe mãe
// será preciso chamar a implementação da classe mãe utilizando a palavra "super", 
// sobrepondo então o método da classe filha (overriding).

public class PolimorfismoSuperclasse {
    public void metodoImprime(){
        System.out.println("Imprimindo na Superclasse");
    }
}

public class PolimorfismoSubclasse extends PolimorfismoSuperclasse {
    
    // Polimorfismo: Sobreescrevendo o método da Superclasse
    public void metodoImprime(){
        // super faz referência a superclasse
        super.metodoImprime();  // então chamando o método herdado
        System.out.println("Imprimindo na Subclasse");
    }

    public static void main(String[] args) {
        PolimorfismoSubclasse c = new PolimorfismoSubclasse();
        c.metodoImprime();
    }

}
