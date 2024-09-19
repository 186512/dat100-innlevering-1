package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveO1 {

    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            int totalPoengsum = -1; 
            

            while (totalPoengsum < 0 || totalPoengsum > 100) {
                String poeng = showInputDialog("Hvor mye poeng fikk du? (0 - 100)");

                
                try {
                    totalPoengsum = Integer.parseInt(poeng);
                } catch (NumberFormatException e) {
                    
                    showMessageDialog(null, "Ikke en gyldig poengsum, prøv igjen.");
                    continue; 
                }

               
                if (totalPoengsum < 0 || totalPoengsum > 100) {
                    showMessageDialog(null, "Ikke en gyldig poengsum, prøv igjen.");
                }
            }

            
            if (totalPoengsum >= 90) {
                showMessageDialog(null, "Du fikk karakter A");
            } else if (totalPoengsum >= 80) {
                showMessageDialog(null, "Du fikk karakter B");
            } else if (totalPoengsum >= 60) {
                showMessageDialog(null, "Du fikk karakter C");
            } else if (totalPoengsum >= 50) {
                showMessageDialog(null, "Du fikk karakter D");
            } else if (totalPoengsum >= 40) {
                showMessageDialog(null, "Du fikk karakter E");
            } else {
                showMessageDialog(null, "Du fikk karakter F");
            }
        }
    }
}
