package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveO2 {

    public static void main(String[] args) {
        
        String startInntekt = showInputDialog("Hva tjener du?");
        int inntekt = Integer.parseInt(startInntekt);
        float totalSkatt = 0;
        
      
        if (inntekt <= 208050) {
            showMessageDialog(null, "Du betaler ingen skatt");
        } else {
           
            if (inntekt > 208050) {
                float bruttoSkatt1 = Math.min(inntekt, 292850) - 208050;
                totalSkatt += bruttoSkatt1 * 0.017f;
            }

            
            if (inntekt > 292850) {
                float bruttoSkatt2 = Math.min(inntekt, 670000) - 292850;
                totalSkatt += bruttoSkatt2 * 0.04f;
            }

          
            if (inntekt > 670000) {
                float bruttoSkatt3 = Math.min(inntekt, 937900) - 670000;
                totalSkatt += bruttoSkatt3 * 0.136f;
            }

            
            if (inntekt > 937900) {
                float bruttoSkatt4 = Math.min(inntekt, 1350000) - 937900;
                totalSkatt += bruttoSkatt4 * 0.166f;
            }

            
            if (inntekt > 1350000) {
                float bruttoSkatt5 = inntekt - 1350000;
                totalSkatt += bruttoSkatt5 * 0.176f;
            }

            
            System.out.println("Du betaler " + totalSkatt + " i skatt");
        }
    }
}
