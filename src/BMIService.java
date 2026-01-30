

public class BMIService {

    // Método que calcula o número do IMC
    public double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Método que traduz o número para texto (Categoria)
    public String obterClassificacao(double imc) {
        if (imc < 18.5) {
            return "Abaixo do Peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Peso Normal (Ideal)";
        } else if (imc >= 24.9 && imc < 29.9) {
            return "Levemente Acima do Peso";
        } else if (imc >= 29.9 && imc < 34.9) {
            return "Obesidade Grau I";
        } else if (imc >= 34.9 && imc < 39.9) {
            return "Obesidade Grau II (Severa)";
        } else {
            return "Obesidade Grau III (Mórbida)";
        }
    }
}