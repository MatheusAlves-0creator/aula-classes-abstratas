public class Main {
    public static void main(String[] args) {
        // Uso de referências do tipo Funcionario (Polimorfismo)
        Funcionario f1 = new Gerente("Marcos", 8000.0);
        Funcionario f2 = new Desenvolvedor("Ana", 5000.0);

        f1.mostrarDados();
        System.out.println("Bônus: R$ " + f1.calcularBonus());

        System.out.println();

        f2.mostrarDados();
        System.out.println("Bônus: R$ " + f2.calcularBonus());
    }
}