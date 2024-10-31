import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;


class CalculadoraTest {

    @Test
    void escogerValor() {
    }

    @Test
    void escogerValorEntradaValida() {
        ByteArrayInputStream in = new
                ByteArrayInputStream("6\n".getBytes()); //ByteArrayInputStream sirve para simular lo que escribiremos en la consola.
        System.setIn(in); //setIn cambia la entrada de consola para que use los datos que queremos probar.
        Assertions.assertEquals(6, Calculadora.escogerValor()); //Assertions ayuda a verificar que el resultado de un metodo sea el que se espera.
    }

    @Test
    void escogerValorEntradaInvalida() {
        ByteArrayInputStream in = new
                ByteArrayInputStream("6\n".getBytes());
        System.setIn(in);
        Assertions.assertEquals(6, Calculadora.escogerValor());
    }

    @Test
    void sumar() {
        Assertions.assertEquals(12, Calculadora.sumar(7,5));
    }

    @Test
    void restar() {
        Assertions.assertEquals(2, Calculadora.restar(7,5));
    }

    @Test
    void multiplicar() {
        Assertions.assertEquals(35, Calculadora.multiplicar(7,5));
    }

    @Test
    public void testDividirConValoresValidos() {
        Assertions.assertEquals("2.0", Calculadora.dividir(10,5));
    }

    @Test
    public void testDividirEntreCero() {
        Assertions.assertEquals("Error: División por cero", Calculadora.dividir(10,0));
    }

    @Test
    void dividir() {
    }

}