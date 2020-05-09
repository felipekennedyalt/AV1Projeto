package com.example.appfisher;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import dao.VendasDAO;

import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class CadastroVendasTest {

    @Test
    public void TesteSalvarValorBancoDeDados(){
        CadastroVendas vendas = new CadastroVendas();
        vendas.setValorVenda(100.00);

        VendasDAO dao = new VendasDAO();

        assertTrue(dao.save(vendas));
    }

    @Test
    public void DeveriaSalvarIMCSMock(){
        CadastroVendas vendas = new CadastroVendas();
        vendas.setValorVenda(100.00);

        VendasDAO daoFalso = Mockito.mock(VendasDAO.class);
        Mockito.when(daoFalso.save(vendas)).thenReturn(true);

    }
}
