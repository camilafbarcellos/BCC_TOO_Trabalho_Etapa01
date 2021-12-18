package bcc_too_trabalho_etapa01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Camila Barcellos <BCC-TOO IFSul>
 */
public class Exercicio03 {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data;            
            
        try {
            String entrada = JOptionPane.showInputDialog("Bem vindo à geração de datas para pagamentos!\n\nInforme a data inicial (dd/mm/aaaa): ");
            data = LocalDate.parse(entrada, dtf);
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "## ERRO ##\n\nPreenchimento indevido, tente novamente!");
            return;
        }
        
        JOptionPane.showMessageDialog(null, "DATAS RESULTANTES\n"+
                "\nData informada: "+dtf.format(data)+
                "\nData de pagamento: "+dtf.format((data = data.plusDays(7)))+
                "\nData de pagamento: "+dtf.format((data = data.plusDays(7)))+
                "\nData de pagamento: "+dtf.format((data = data.plusDays(7)))+
                "\nData de pagamento: "+dtf.format((data = data.plusDays(7)))+
                "\nData de pagamento: "+dtf.format((data = data.plusDays(7))));
    }
}
