/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.ejemplosic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class CuentaTest {

    public CuentaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void ingresoEnNuevaCuenta() {
        System.out.println("En ingresoEnNuevaCuenta");
        Cuenta c = new Cuenta();
        c.ingresar(100.0d);
        assertTrue(c.saldo() == 100.0d);
    }
    @Test
    public void ingresoEnCuentaConSaldo() {
        System.out.println("En ingresoEnCuentaConSaldo");
        Cuenta c = new Cuenta(100.0d);
        c.ingresar(100.0d);
        assertTrue(c.saldo() == 200.0d);        
    }
}
