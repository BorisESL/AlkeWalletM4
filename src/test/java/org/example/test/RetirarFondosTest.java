package org.example.test;

import org.example.model.Cliente;
import org.example.service.RetirarFondos;
import org.junit.Test;

import static org.junit.Assert.*;

public class RetirarFondosTest {

    @Test
    public void realizarOperacion() {

        //crear un cliente con su saldo inicial
        Cliente cliente = new Cliente("Juan","12335637-9", "123456", 10000);
        //crear la instancia retirar fondos
        RetirarFondos retirarFondos = new RetirarFondos();

        //ahora hacemos la funcionalidad de hacer un retiro y su ferificación
        cliente.retirar(5000);

        assertEquals(5000, cliente.getSaldo(), 0.01); //Agregue el 0.01 como margen de error, para comparar numeros flotantes

    }
}