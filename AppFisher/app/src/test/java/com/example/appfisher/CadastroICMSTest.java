package com.example.appfisher;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import dao.ICMSDAO;

@RunWith(JUnit4.class)
public class CadastroICMSTest {

    @Test
    public void TesteSalvarEstadoDeOrigemNoBancoDeDados(){
        CadastroICMS icms = new CadastroICMS();
        icms.setEstadoOrigem("Ceará");
        icms.setEstadoDestino("Pernambuco");
        icms.setAliquota(18.0);

        ICMSDAO dao = new ICMSDAO();

        assertTrue(dao.save(icms));
    }

}
