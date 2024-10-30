package INTERFACE;

public class Main {

    public static void main(String[] args) {
        FuncionarioAssalariado funcionarioAssalariado = new FuncionarioAssalariado("José", 18, "E");
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista("João", 65, "Dev Sênior", 70000.0f);

        System.out.println("Bônus do Funcionario Assalariado: R$ " + funcionarioAssalariado.calcularBonus());
        System.out.println("Bônus do Funcionario Horista: R$ " + funcionarioHorista.calcularBonus());
    }
}
