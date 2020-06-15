
package companhia_eletrica;

import javax.swing.JOptionPane;

public class Eletricidade {
    
    public int leitAnte;
    public int leitAtual;
    public int difLeitura;
    public double tusd = 0.3;
    public double tw = 0.29;
    public double icm = 0.25;
    public double total;
    public double valorParcial;
    public String corBandeira;
    
    public void setLeitAnte(int leitAnte) {
        this.leitAnte = leitAnte;
    }
    public int getLeitAnte() {
        return leitAnte;
    }
    public void setLeitAtual(int leitAtual) {
        this.leitAtual = leitAtual;
    }
    public int getLeituraAtual() {
        return leitAtual;
    }
    public int getDifLeitura() {
        return difLeitura;
    }
    
    public double getTusd() {
        return tusd;
    }
    public double getTw() {
        return tw;
    }
    public double getIcm() {
        return icm;
    }
    
    public double getTotal() {
        return total;
    }
    public double getValorParcial() {
        return valorParcial;
    }
    
    public String getCorBandeira() {
        return corBandeira;
    }
    
    
    public int leitura(int leitAnte, int leitAtual, int difLeitura) {
        this.difLeitura = this.leitAtual - this.leitAnte;
        return difLeitura;
    }
    
    public double cobranca(double valorParcial, int difLeitura, double tusd, double tw) {
        double tu;
        double w;
        tu = this.difLeitura * this.tusd;
        w = this.difLeitura * this.tw;
        this.valorParcial = this.difLeitura + tu + w;
        return valorParcial;
    }
    
    public double verificaBandeira (int difLeitura, double valorParcial) {
        double quasela = 0;
        double icms = 0;
            if (this.difLeitura <= 100){
                total = valorParcial;
                corBandeira = "Verde";
            }
            if (this.difLeitura > 100 && this.difLeitura <= 150) {
                quasela = valorParcial * 0.013;
                icms = quasela * 0.25;
                quasela = quasela + icms;
                total = valorParcial + quasela;
                corBandeira = "Amarela";

            }
            if (this.difLeitura > 150 && this.difLeitura <=200) {
                quasela = valorParcial * 0.041;
                icms = quasela * 0.25;
                quasela = quasela + icms;
                total = valorParcial + quasela;
                corBandeira = "Vermelha - Patamar 1";
            }
            else if (this.difLeitura > 200) {
                quasela = valorParcial * 0.062;
                icms = quasela * 0.25;
                quasela = quasela + icms;
                total = valorParcial + quasela;
                corBandeira = "Vermelha - Patamar 2";
            }
            
        return this.total;
    }
    
    public void imprimeConta (int leitAnte, int leitAtual, int difLeitura, double total, double valorParcial, String corBandeira) {
        JOptionPane.showMessageDialog(null, "ELETRICIDADE LOFI\n"
                + "Seu consumo anterior foi de " + leitAnte + " Kw\n"
                + "Seu consumo atual foi de " + leitAtual + " Kw\n"
                + "A quantidade consumida foi de " + difLeitura + " Kw\n"
                + "Sua bandeira: " + corBandeira + "\n"
                + "Valor Parcial: R$" + valorParcial + "\n"
                + "Valor Total: R$" + total + "\n");
    }
    
    
    
    
}
