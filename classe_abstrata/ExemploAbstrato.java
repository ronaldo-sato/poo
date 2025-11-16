package classe_abstrata;

// Classe para testar o exemplo
public class ExemploAbstrato {
    public static void main(String[] args) {
        // Não é possível instanciar a classe abstrata Animal diretamente
        // Animal meuAnimal = new Animal(); // Isso geraria um erro

        // Instanciando objetos das subclasses
        Cachorro meuCachorro = new Cachorro();
        Gato meuGato = new Gato();

        // Chamando métodos das subclasses
        meuCachorro.fazerSom();  // Saída: Latido
        meuCachorro.dormir();    // Saída: Dormindo...
        meuGato.fazerSom();      // Saída: Miau
        meuGato.dormir();        // Saída: Dormindo...
    }
}
