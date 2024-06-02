
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        String[] canditados = { "FELIPE", "MARCIA", "JULIA", "PAULO", "GUSTAVO" };

        for (String candidato : canditados) {
            entrandoEmcontato(candidato);
        }
    }

    static void entrandoEmcontato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " Tentativa");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ", número maximo de tantativas"
                    + tentativasRealizadas);
        }
    }

    // metodo auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] canditados = { "FELIPE", "MARCIA", "JULIA", "PAULO", "GUSTAVO" };

        System.out.println("Imprimir lista de candidatos informando o índice do elemento");

        for (int candidato = 0; candidato < canditados.length; candidato++) {
            System.out.println("O candidato de nº" + (candidato + 1) + " é o " + canditados[candidato]);
        }

        System.out.println("Forma abreviada de interaçãod do for");

        for (String candidatoString : canditados) {
            System.out.println("O candidato selecionado foi " + candidatoString);
        }

    }

    static void selecaoCandidatos() {
        String[] canditados = { "FELIPE", "MARCIA", "JULIA", "PAULO", "GUSTAVO", "MONICA", "FABRICIO", "MIRELA",
                "DANIELA", "JORGE" };

        int canditadosSelecionados = 0;
        int canditadoAtual = 0;
        double salariobase = 2000.0;

        while (canditadosSelecionados < 5 && canditadoAtual < canditados.length) {
            String candidato = canditados[canditadoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O Candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);

            if (salariobase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                canditadosSelecionados++;
            }
            canditadoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salariobase = 2000.0;

        if (salariobase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salariobase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}