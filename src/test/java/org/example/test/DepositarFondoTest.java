package org.example.test;

import org.example.model.Cliente;
import org.example.service.DepositarFondo;
import org.junit.Test;

import static org.junit.Assert.*;

public class DepositarFondoTest {

    @Test
    public void realizarOperacion() {

        Cliente cliente = new Cliente("Novack", "152349835", "098765", 15000);

        DepositarFondo depositarFondo = new DepositarFondo();
        cliente.depositarDinero(5000);
        assertEquals(10000, cliente.getSaldo(), 0.01);
    }
}