
package estacionamento_poo;

import javax.swing.JOptionPane;

public class Estacionamentinho {
    
    public String placa;
    public String modelo;
    public double hora_entrada;
    public double min_entrada;
    public double hora_saida;
    public double min_saida;
    protected double preco;
    public double tempo;
    
    public double getTempo(){
        return tempo;
    }
    
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo (String modelo) {
        this.modelo = modelo;
    }
    
    public double getHora_entrada() {
        return hora_entrada;
    }
    public void setHora_entrada(double hora_entrada) {
        this.hora_entrada = hora_entrada;
    }
    public double getMin_entrada() {
        return min_entrada;
    }
    public void setMin_entrada(double min_entrada) {
        this.min_entrada = min_entrada;
    }
    
    public double getHora_saida() {
        return hora_saida;
    }
    public void setHora_saida(double hora_saida) {
        this.hora_saida = hora_saida;
    }
    public double getMin_saida() {
        return min_saida;
    }
    public void setMin_saida(double min_saida) {
        this.min_saida = min_saida;
    }
    
    protected double getPreco() {
        return preco;
    }
    protected void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double calcula_tempo(double hora_entrada, double min_entrada, double hora_saida, double min_saida) {
        double conv_ent = hora_entrada + min_entrada / 60;
        double conv_saida = hora_saida + min_saida / 60;
        
        this.tempo = Math.ceil(conv_saida - conv_ent);
        
        JOptionPane.showMessageDialog(null, "Aqui ó: " + tempo);
        
        return tempo;
    }
    
    public void gera_nota(double tempo, double preco) {
        
        double resultado = preco * tempo;
               
        JOptionPane.showMessageDialog(null, "ESTACIONAMENTO LO-FI\n"
                + "DADOS DO VEÍCULO:\n"
                + "Placa: " + this.placa + "\n"
                + "Modelo: " + this.modelo + "\n"
                + "HORÁRIOS:\n"
                + "Hora de entrada: " + hora_entrada + "h e " + min_entrada + "m\n"
                + "Hora de saída: " + hora_saida + "h e " + min_saida + "m\n"
                + "Horas cobradas ao total: " + this.tempo + "\n"
                + "Valor total a pagar: " + resultado);
        
    }
    
}
