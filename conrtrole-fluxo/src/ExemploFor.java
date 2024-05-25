public class ExemploFor {
    public static void main(String[] args) {
        String Alunos[] = { "Jão", "Caique", "Pedro", "Andé", "Thainize", "Olga" };
        for (int contador = 0; contador < Alunos.length; contador++) {
            System.out.println("O aluno do indice " + contador + " é " + Alunos[contador]);
        }
    }
}
