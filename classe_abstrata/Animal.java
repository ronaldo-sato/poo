package classe_abstrata;

// Classe abstrata base
abstract class Animal {
    // Método concreto (com implementação)
    void dormir() {
        System.out.println("Dormindo...");
    }

    // Método abstrato (sem implementação)
    abstract void fazerSom();
}
