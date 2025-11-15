// Método Main

// Uma classe, um programa ou sistema precisa ter um método main (método
// principal), para a execução das funcionalidades. Então para que uma
// classe possa ser executada, ou seja, para poder instanciar um objeto,
//  definir atributos, usar construtor e métodos, isso precisa ser feito no 
// método main que por padrão segue a sintaxe:

// public static void main (String[] args){
//     // corpo
//     System.out.println("Hello!");
// }

public class Conta {
    private String numero;
    private float saldo;
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void creditar(float valor){
        saldo = saldo + valor;
    }

    public void debitar(float valor){
        saldo = saldo - valor;
    }

    public Conta(String numero, float saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    // Método Main

    public static void main(String[] args) {
        // Instanciando um 1o objeto
        Conta obj1 = new Conta("1234", 500);
        obj1.creditar(50);
        System.out.println("Numero da conta:" + obj1.numero);
        System.out.println("Saldo:" + obj1.saldo);

        // OBS: Como aqui o acesso aos atributos está sendo feito na main
        // dentro da própria classe, como eles são privados, podemos acessá-los
        // diretamente pela propriedade, por exemplo para o número da conta, 
        // acessamos obj1.numero. Caso fosse uma outra classe acessando essas 
        // propriedades, elas teriam que acessá-los por método getter, já que 
        // esses atributos são privados (só podem ser acessados pela própria
        // classe)

        System.out.println("----------");

        // Instanciando um 2o objeto
        Conta obj2 = new Conta("2345", 200);
        obj2.debitar(30);
        System.out.println("Numero da conta:" + obj2.numero);
        System.out.println("Saldo:" + obj2.saldo);
    }

}
