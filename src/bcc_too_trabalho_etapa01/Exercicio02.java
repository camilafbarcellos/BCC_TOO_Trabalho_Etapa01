package bcc_too_trabalho_etapa01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Camila Barcellos <BCC-TOO IFSul>
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Double diaria;
        String entrada;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");    
        sdf.setLenient(false);
        Calendar dataLoc = Calendar.getInstance(), dataDev = Calendar.getInstance();
        
        try {
            diaria = Double.parseDouble(JOptionPane.showInputDialog("Bem vindo ao cálculo de diária!\n\nInsira a diária (R$)"));
            entrada = JOptionPane.showInputDialog("Informe a data de locação (dd/mm/aaaa): ");
            dataLoc.setTime(sdf.parse(entrada));
            entrada = JOptionPane.showInputDialog("Informe a data de devolução (dd/mm/aaaa): ");
            dataDev.setTime(sdf.parse(entrada));
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "## ERRO ##\n\nPreenchimento indevido, tente novamente!");
            return;
        }
        
        long miliSegundosPorDia = 24 * 60 * 60 * 1000;
        long difC = dataDev.getTimeInMillis() - dataLoc.getTimeInMillis();
        long quantDias = difC / miliSegundosPorDia;
        
        Double valor = quantDias * diaria;
        JOptionPane.showMessageDialog(null, "RESULTADO DO CÁLCULO DA DIÁRIA\n"+
                "\nValor da diária: R$ "+diaria+
                "\nData de locação: "+sdf.format(dataLoc.getTime())+
                "\nData de devolução: "+sdf.format(dataDev.getTime())+
                "\nDias de locação: "+quantDias+
                "\nValor total da locação: R$ "+valor);
    }
}
