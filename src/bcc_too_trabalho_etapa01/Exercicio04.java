package bcc_too_trabalho_etapa01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Camila Barcellos <BCC-TOO IFSul>
 */
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.now();         
        Double valorT;
        int parcelas;
        
        System.out.println("\nBem vindo à geração de parcelas!");
        
        try {
            System.out.printf("Informe o valor da compra: R$ ");
            valorT = entrada.nextDouble();
            System.out.printf("Informe a quantidade de parcelas: ");
            parcelas = entrada.nextInt();
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "## ERRO ##\n\nPreenchimento indevido, tente novamente!");
            return;
        }
        
        Double valorP[] = new Double[parcelas];
        LocalDate dataP[] = new LocalDate[parcelas];
        dataP[0] = data;
        valorP[0] = valorT / parcelas;
        System.out.println("\nPARCELAS CORRESPONDENTES");
        System.out.println("Valor da compra: R$ "+valorT+
                "\nTotal de parcelas: "+parcelas+
                "\nValor da parcela: R$"+valorP[0]+" Data do 1º vencimento: "+dtf.format(dataP[0]));
        //primeira data de vencimento é a data do sistema, de acordo com enunciado
        
        
        for(int i=1; i<parcelas; i++) {
            dataP[i] = dataP[i-1].plusDays(30);
            valorP[i] = valorT / parcelas;
            System.out.println("Valor da parcela: R$"+valorP[i]+" Data do "+(i+1)+"º vencimento: "+dtf.format(dataP[i]));
        }
        System.out.println("\n");
    }
}
