package com.mycompany.projetoaprovacaoemprestimo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LiberarEmprestimoTest {
    
    LiberarEmprestimo liberar;
    
    public LiberarEmprestimoTest() {
        liberar = new LiberarEmprestimo();
    }

////    @Test
//    public void testSaldoMedio() {
//        System.out.println("Saldo médio");
//        
//        assertEquals("Saldo médio inválido", liberar.classificarEmprestimo(700));
//        assertEquals("Saldo médio válido", liberar.classificarEmprestimo(1100));
//       
//    }
    
//    @Test
//    public void testHistoricoBom() {
//        System.out.println("Histórico bom?");
//        
//        assertEquals(1, liberar.classificarEmprestimo(1));
//    }
    
//    @Test
//    public void testConcessaoEsp() {
//        System.out.println("Concessão especial de crédito");
//        
//        assertEquals("Não possui concessão especial", liberar.classificarEmprestimo(1100));
//        assertEquals("Possui concessão especial", liberar.classificarEmprestimo(1500));
//    }
    
}