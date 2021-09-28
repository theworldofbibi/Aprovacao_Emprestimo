package com.mycompany.projetoaprovacaoemprestimo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LiberarEmprestimoTest {
    
    LiberarEmprestimo liberar;
    
    public LiberarEmprestimoTest() {
        liberar = new LiberarEmprestimo();
    }

    @Test
    public void testSaldoInvalido() {
        System.out.println("Saldo inválido");
        
        assertEquals("Saldo Inválido", liberar.classificarEmprestimo(700));
    }
    
    @Test
    public void testSaldoValido() {
        System.out.println("Saldo válido");
        
        assertEquals("Saldo Válido", liberar.classificarEmprestimo(1100));
    }

}
