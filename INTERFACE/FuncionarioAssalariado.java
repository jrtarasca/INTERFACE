package INTERFACE;

public class FuncionarioAssalariado extends Funcionario {

    public FuncionarioAssalariado(String nome, int idade, String cargo) {
        super(nome, idade, cargo);
    }

    @Override
    public float calcularBonus() {
        return 5000.0f; // Bônus fixo de R$ 5.000,00
    }
}
