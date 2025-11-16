package classe_abstrata;

// Outra subclasse de Animal
class Gato extends Animal {
    // Implementação obrigatória do método abstrato
    @Override
    void fazerSom() {
        System.out.println("Miau, ..., miau");
    }
}