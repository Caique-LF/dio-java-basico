public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMin = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // short numeroCurto2 = numeroNormal;

        // int: Representa números inteiros.
        // double: Representa números decimais.
        // boolean: Representa valores booleanos (verdadeiro ou falso).
        // char: Representa caracteres individuais.
        // byte, short, long, float: Outros tipos numéricos com diferentes tamanhos e
        // faixas de valores.

        String name = "Caique";
        String lastName = "Fernandes";

        String fullName = name.concat(" " + lastName);

        System.out.println(fullName);

    }
}
