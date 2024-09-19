package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveO3 {

    public static void main(String[] args) {

        String start = showInputDialog("skriv inn et heltall");
        int n = Integer.parseInt(start);
      
        int ferdig = 1;    

        
        for (int i = n; i > 0; i--) {
            ferdig = ferdig * i;
        }

        System.out.println("Fakultet av " + n + " er " + ferdig);
    }
}
