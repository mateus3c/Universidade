import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estacao est = new Estacao();
        Logger log = new Logger();
        int anexo = 0;
        double[] valReceitaBruta = new double[12];
        boolean loop1;
        boolean loop2;
        boolean loop3;
        boolean loop4;

        // Seleção do tipo de empresa
        loop1 = true;
        while (loop1) {
            log.registrarLog("TRACE - Iniciou loop1");
            try {
                loop2 = true;
                while (loop2) {
                    log.registrarLog("TRACE - Iniciou loop2");
                    System.out.println("\nSelecione o tipo de empresa:");
                    System.out.println("\t[1] Empresas de comércio.");
                    System.out.println("\t[2] Fábricas e indústrias");
                    System.out.println("\t[3] Empresas que oferecem serviços de instalação, reparos e manutenção, além de agências de viagens, escritórios de contabilidade, academias, laboratórios, empresas de medicina e odontologia.");
                    System.out.println("\t[4] Empresas que fornecem serviço de limpeza, vigilância, obras, construção de imóveis e serviços advocatícios.");
                    System.out.println("\t[5] Empresas que prestam serviço de auditoria, jornalismo, tecnologia, publicidade, engenharia e outros.");
                    anexo = sc.nextInt();
                    if (anexo < 1 || anexo > 5) {
                        System.out.println("\nENTRADA INVÁLIDA. POR FAVOR, DIGITE UMA DAS OPÇÕES DISPONIVEIS (1, 2, 3, 4, 5)\n\n");
                        log.registrarLog("ERROR - Opção INVÁLIDA escolhida: " + anexo);
                    } else {
                        loop2 = false;
                        log.registrarLog("TRACE - Perfil da empresa selecionado: " + anexo);
                        log.registrarLog("TRACE - Completou loop2");
                    }
                }
                // Confirmação da seleção
                loop3 = true;
                while (loop3) {
                    log.registrarLog("TRACE - Iniciou loop3");
                    System.out.println("Perfil de empresa selecionado: Anexo " + anexo);
                    System.out.println("Você confirma a seleção? (s/n)");
                    String confirmacao = sc.next().toLowerCase();
                    if (confirmacao.equals("s")) {
                        loop1 = false;
                        loop3 = false;
                        log.registrarLog("TRACE - Entrada 'confirmacao': " + confirmacao);
                        log.registrarLog("TRACE - Completou loop1");
                        log.registrarLog("TRACE - Completou loop3");
                    } else if (confirmacao.equals("n")) {
                        loop3 = false;
                        log.registrarLog("TRACE - Entrada 'confirmacao': " + confirmacao);
                        log.registrarLog("TRACE - Completou loop3");
                    } else {
                        System.out.println("\nENTRADA INVÁLIDA. POR FAVOR, DIGITE UMA DAS OPÇÕES DISPONIVEIS (s, n)\n\n");
                        log.registrarLog("ERROR - Entrada INVÁLIDA para 'confirmacao': " + confirmacao);
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("\nENTRADA INVÁLIDA. POR FAVOR, DIGITE UMA DAS OPÇÕES DISPONIVEIS (1, 2, 3, 4, 5)\n\n");
                sc.next(); // Limpar buffer do scanner para evitar loop infinito.
                log.registrarLog("ERROR - InputMismatchException: " + e.getMessage());
            }
        }
        // Receita bruta
        System.out.println("Informe os valores mensais da receita bruta:");
        for (int i = 0; i < 12; i++) {
            loop4 = true;
            while (loop4) {
                log.registrarLog("TRACE - Iniciou loop4");
                try {
                    System.out.print("Mês " + (i + 1) + ": ");
                    valReceitaBruta[i] = sc.nextDouble();
                    log.registrarLog("TRACE - Entrada 'valReceitaBruta' (" + (i + 1) + "): " + valReceitaBruta[i]);
                    log.registrarLog("TRACE - Completou loop4");
                    loop4 = false;
                } catch (InputMismatchException e) {
                    System.out.println("\nENTRADA INVÁLIDA. POR FAVOR, DIGITE UM NÚMERO VÁLIDO.\n\n");
                    sc.next(); // Limpar buffer do scanner para evitar loop infinito.
                    log.registrarLog("ERROR - InputMismatchException: " + e.getMessage());
                    log.registrarLog("ERROR - Entrada INVÁLIDA para 'valReceitaBruta' (" + (i + 1) + "): " + valReceitaBruta[i]);
                }
            }
        }

        // Calcular receita bruta total
        double receitaBrutaTotal = est.defReceitaBrutaTotal(valReceitaBruta);
        System.out.printf("\nReceita Bruta Total: R$ %.2f%%\n", receitaBrutaTotal);

        // Calcular alíquota efetiva
        double aliquotaEfetiva = est.defAliquotaEfetiva(anexo, receitaBrutaTotal);
        System.out.printf("\nAlíquota Efetiva: %.2f%%\n", aliquotaEfetiva * 100);

        // Calcular valor a deduzir
        double valorADeduzir = est.defValorADeduzir(anexo, receitaBrutaTotal);
        System.out.printf("\nValor a Deduzir: R$ %.2f%%\n", valorADeduzir);

        // Calcular simples nacional
        double simplesNacional = est.defSimplesNacional(receitaBrutaTotal, aliquotaEfetiva, valorADeduzir);
        System.out.printf("\nSimples Nacional: %.2f%%\n", simplesNacional * 100);

        sc.close();
    }
}
