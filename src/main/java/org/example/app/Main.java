package org.example.app;

import org.example.service.Banco;
import org.example.ul.Menu;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Menu menu = new Menu(banco);

        System.out.println("Bienvenido a Alke Wallet\n");

        menu.mostrarMenu();
    }
}
