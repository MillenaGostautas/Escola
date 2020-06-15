
package companhia_eletrica;

import javax.swing.JOptionPane;

public class Companhia_Eletrica {

    public static void main(String[] args) {
        
        Eletricidade dados = new Eletricidade();
        
        dados.setLeitAnte (Integer.parseInt(JOptionPane.showInputDialog("Insira a sua leitura anterior: ")));
        dados.setLeitAtual (Integer.parseInt(JOptionPane.showInputDialog("Insira a sua leitura atual: ")));
        
        dados.leitura(dados.getLeitAnte(), dados.getLeituraAtual(), dados.getDifLeitura());
        
        dados.cobranca(dados.getValorParcial(), dados.getDifLeitura(), dados.getTusd(), dados.getTw());
        
        dados.verificaBandeira(dados.getDifLeitura(), dados.getValorParcial(), dados.getIcm());
        
        dados.imprimeConta(dados.getLeitAnte(), dados.getLeituraAtual(), dados.getDifLeitura(), dados.getTotal(), dados.getValorParcial(), dados.getCorBandeira());
        
        
        
    }
    
}
