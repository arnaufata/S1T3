package n1exercici3.models;

import java.util.Scanner;

public class User {
    private String nomUsuari;

    public User(){
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix el teu nom d'usuari: ");
        this.nomUsuari = teclat.nextLine();
    }

    public String getNomUsuari(){
        return nomUsuari;
    }
}
