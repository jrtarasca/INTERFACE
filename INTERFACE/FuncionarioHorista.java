package INTERFACE;

public class FuncionarioHorista extends Funcionario {

    private float salarioAnual;

    public FuncionarioHorista(String nome, int idade, String cargo, float salarioAnual) {
        super(nome, idade, cargo);
        this.salarioAnual = salarioAnual;
    }

    public float getSalarioAnual() {
        return salarioAnual;
    }

    public void setSalarioAnual(float salarioAnual) {
        this.salarioAnual = salarioAnual;
    }

    @Override
    public float calcularBonus() {
        return salarioAnual * 0.10f; // Bônus de 10% do salário anual
    }
}