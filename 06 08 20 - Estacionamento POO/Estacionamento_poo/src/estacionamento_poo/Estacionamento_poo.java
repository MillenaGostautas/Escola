
package estacionamento_poo;

import javax.swing.JOptionPane;

public class Estacionamento_poo {

    public static void main(String[] args) {
        
        Estacionamentinho dados = new Estacionamentinho();
        
        dados.setPlaca(JOptionPane.showInputDialog("Digite a placa do veículo: "));
        dados.setModelo(JOptionPane.showInputDialog("Digite o modelo do veículo: "));
        
        dados.setHora_entrada(Double.parseDouble(JOptionPane.showInputDialog("Insira apenas a hora em que você chegou: ")));
        dados.setMin_entrada(Double.parseDouble(JOptionPane.showInputDialog("Insira apenas o minuto em que você chegou: ")));
        
        dados.setHora_saida(Double.parseDouble(JOptionPane.showInputDialog("Insira apenas a hora em que você saiu: ")));
        dados.setMin_saida(Double.parseDouble(JOptionPane.showInputDialog("Insira apenas o minuto em que você chegou: ")));
        
        dados.setPreco((Double.parseDouble(JOptionPane.showInputDialog("Digite o preço cobrado por hora: "))));
        
        dados.calcula_tempo(dados.getHora_entrada(), dados.getMin_entrada(), dados.getHora_saida(), dados.getMin_saida());
        
        dados.gera_nota(dados.getTempo(), dados.getPreco());
        
        
                
        
    }
    
}
