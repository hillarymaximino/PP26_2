public class Cliente_202411250017 {

    public static void main(String[] args) {

        Calculadora_202411250017 minhaCalc = new Calculadora_202411250017();
        System.out.println("--- Testando a Calculadora ---");

        double resultadoSoma = minhaCalc.somar(10, 5);
        System.out.println("Soma (10 + 5): " + resultadoSoma);

        double resultadoSub = minhaCalc.subtrair(20, 8);
        System.out.println("Subtração (20 - 8): " + resultadoSub);

        double resultadoMult = minhaCalc.multiplicar(4, 5);
        System.out.println("Multiplicação (4 * 5): " + resultadoMult);

        double resultadoDiv = minhaCalc.dividir(50, 2);
        System.out.println("Divisão (50 / 2): " + resultadoDiv);
    }
}