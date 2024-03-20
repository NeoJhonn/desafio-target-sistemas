// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Soma
        soma();

        // Fibonacci
        pertenceASequenciaFibonacci(7);

        // Inverte String
        inverteString("Jhonny Azevedo");


    }

    public static void soma() {
        int i = 13;

        int soma = 0;

        int k = 0;

        while (k < i) {
            k++;

            soma += k;
        }

        System.out.println("Resultado soma= "+soma);
    }

    public static void pertenceASequenciaFibonacci(int numero) {
        int a = 0;
        int b = 1;
        boolean pertence = false;

        if ( numero == a || numero == b) {
            pertence = true;
        }

        for (int i=b; i <= numero; i++) {
            int temp = a + b;

            if (numero == temp) {
                pertence =true;
            }

            a = b;
            b = temp;
        }

        if (pertence) {
            System.out.println("O número informado pertence a sequência Fibonacci");
        } else {
            System.out.println("O número informado não pertence a sequência Fibonacci");
        }
    }

    public static void inverteString(String palavra) {
        String palavraInvertida = "";


        for (int i=palavra.toCharArray().length; i > 0; i--) {
            palavraInvertida += palavra.toCharArray()[i - 1];
        }

        System.out.println("Palavra invertida= "+ palavraInvertida);
    }

}