public class operadores {
    public static void main(String[] args) throws Exception {

        // int numero = 20;

        // System.out.println(-numero);

        int numero = 5;
        // Como no JS é possivel fazer a mesma incrementação(soma),
        // diversas formas.

        // numero = numero + 2; é o mesmo que numero+=2

        // incremento ou decremento podem vir antes ou depois
        numero++;
        ++numero;
        --numero;
        numero--;

        // inversão de um valor do tipo bolean;
        boolean variavel = true;
        variavel = !variavel;
        // System.out.println(variavel);

        // operador Ternario
        // <Condicional> ? <caso condição seja true> : <caso condição seja false>
        int a = 5;
        int b = 6;

        String resultado = a == b ? "verdadeiro" : "Falso";
        // System.out.println(resultado);

        // Relacionais
        // como no js temo >, < , >=, <=, ==,
        // Para numeros é interessante usarmos os operadores relacionais
        // Quando se trata de objetos é melhor usarmos equals()

        String nameOne = "Caique";
        String nameTwo = new String("Caique");

        // System.out.println(nameOne.equals(nameTwo)); // Vai comparar o conteudo dos
        // objetos.

        // Lógicos
        // como no js temos && (E), e ||(OU);

        boolean condOne = true;
        boolean condTwo = false;

        if (condTwo && condOne) {
            System.out.println("As duas concições são verdadeiras");
        }

        if (condTwo || condOne) {
            System.out.println("Uma das concições é verdadeira");
        }
    }

};
