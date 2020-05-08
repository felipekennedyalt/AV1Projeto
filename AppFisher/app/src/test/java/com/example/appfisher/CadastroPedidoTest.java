package com.example.appfisher;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import dao.PedidoDAO;

import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class CadastroPedidoTest {

    @Test
    public void TesteSalvarValorNoBancoDeDados(){
        CadastroPedido pedido = new CadastroPedido();
        pedido.setValorPedido(100.00);

        PedidoDAO dao = new PedidoDAO();

        assertTrue(dao.save(pedido));
    }

    @Test
    public void DeveriaSalvarPedidoMock(){
        CadastroPedido pedido = new CadastroPedido();
        pedido.setValorPedido(100.00);

        PedidoDAO daoFalso = Mockito.mock(PedidoDAO.class);
        Mockito.when(daoFalso.save(pedido)).thenReturn(true);

    }
}
