package com.example.appfisher;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import dao.ICMSDAO;

@RunWith(JUnit4.class)
public class CadastroICMSTest {

    @Test
    public void TesteSalvarEstadoNoBancoDeDados(){
        CadastroICMS icms = new CadastroICMS();
        icms.setEstado("Ceará");

        icms.setAliquota(18.0);

        ICMSDAO dao = new ICMSDAO();

        assertTrue(dao.save(icms));
    }

    @Test
    public void DeveriaSalvarIMCSMock(){
        CadastroICMS icms = new CadastroICMS();
        icms.setEstado("Ceará");
        icms.setAliquota(18.0);

        ICMSDAO daoFalso = Mockito.mock(ICMSDAO.class);
        Mockito.when(daoFalso.save(icms)).thenReturn(true);

    }
}
