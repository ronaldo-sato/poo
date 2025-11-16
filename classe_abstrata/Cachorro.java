package classe_abstrata;

// Subclasse de Animal
class Cachorro extends Animal {
    // Implementação obrigatória do método abstrato
    @Override
    void fazerSom() {
        System.out.println("Au au, au");
    }
}
