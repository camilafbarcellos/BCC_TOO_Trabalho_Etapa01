package bcc_too_trabalho_etapa01;

import javax.swing.JOptionPane;

/**
 *
 * @author Camila Barcellos <BCC-TOO IFSul>
 */
public class Exercicio01 {
    public static void main(String[] args) {        
        String nome;
        Double sal_bruto, sal_liquido, inss;
        
        try {
            nome = JOptionPane.showInputDialog("Bem vindo ao cálculo de INSS!\n\nInsira o seu nome");
            sal_bruto = Double.parseDouble(JOptionPane.showInputDialog("Insira o seu salário bruto (R$)"));
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "## ERRO ##\n\nPreenchimento indevido, tente novamente!");
            return;
        }       
        
        JOptionPane.showMessageDialog(null, "TABELA DE DESCONTO DO INSS\n"+
                "\nDe R$ 0,00 até R$ 1.100,00 = 7,5%"+
                "\nDe R$ 1.100,00 até R$ 2.203,48 = 9%"+
                "\nDe R$ 2.203,48 até R$ 3.305,22 = 12%"+
                "\nDe R$ 3.305,22 até R$ 6.433,57 = 14%"+
                "\nAcima de R$ 6.433,57 = 14% sobre o teto");
        
        if(sal_bruto>=0.0 && sal_bruto<1100) {
           inss = sal_bruto * 0.075;
            sal_liquido = sal_bruto - inss;
            JOptionPane.showMessageDialog(null, "RESULTADO DO CÁLCULO DE INSS\n"+
                "\nNome: "+nome+
                "\nSalário bruto: R$ "+sal_bruto+
                "\nINSS: R$ "+inss+
                "\nSalário líqudio: R$ "+sal_liquido); 
        } else if(sal_bruto>=1100 && sal_bruto<2203.48) {
            inss = sal_bruto * 0.09;
            sal_liquido = sal_bruto - inss;
            JOptionPane.showMessageDialog(null, "RESULTADO DO CÁLCULO DE INSS\n"+
                "\nNome: "+nome+
                "\nSalário bruto: R$ "+sal_bruto+
                "\nINSS: R$ "+inss+
                "\nSalário líqudio: R$ "+sal_liquido);
        } else if(sal_bruto>=2203.48 && sal_bruto<3305.22) {
            inss = sal_bruto * 0.12;
            sal_liquido = sal_bruto - inss;
            JOptionPane.showMessageDialog(null, "RESULTADO DO CÁLCULO DE INSS\n"+
                "\nNome: "+nome+
                "\nSalário bruto: R$ "+sal_bruto+
                "\nINSS: R$ "+inss+
                "\nSalário líqudio: R$ "+sal_liquido);
        } else if(sal_bruto>=3305.22 && sal_bruto<6433.57) {
            inss = sal_bruto * 0.14;
            sal_liquido = sal_bruto - inss;
            JOptionPane.showMessageDialog(null, "RESULTADO DO CÁLCULO DE INSS\n"+
                "\nNome: "+nome+
                "\nSalário bruto: R$ "+sal_bruto+
                "\nINSS: R$ "+inss+
                "\nSalário líqudio: R$ "+sal_liquido);
        } else {
          inss = 6433.57 * 0.14; //14% do teto do INSS
          sal_liquido = sal_bruto - inss;
          JOptionPane.showMessageDialog(null, "RESULTADO DO CÁLCULO DE INSS\n"+
                "\nNome: "+nome+
                "\nSalário bruto: R$ "+sal_bruto+
                "\nINSS: R$ "+inss+
                "\nSalário líqudio: R$ "+sal_liquido);  
        } 
                
    }
    
}
