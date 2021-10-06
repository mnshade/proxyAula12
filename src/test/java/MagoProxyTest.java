import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class AtletaProxyTest {
    @BeforeEach
    void setUp(){
        BD.addMago(new Mago(1,"Olzoxon", "Trevas",800.1f));
        BD.addMago(new Mago(2,"Nubis", "Água",670.5f));
    }
    @Test
    void deveRetornarDadosdoMago(){
        MagoProxy mago = new MagoProxy(2);
        assertEquals(Arrays.asList("Nubis", "Água"), mago.obterDadosdoMago());
    }

    @Test
    void deveRetornarPoderMagico(){
        MestreDosMagos mestreDosMagos = new MestreDosMagos("Olzoxon", true);
        MagoProxy magoProxy = new MagoProxy(1);
        assertEquals(Arrays.asList(800.1f), magoProxy.obterPoderMagico(mestreDosMagos));
    }
    @Test
    void deveRetornarExcecaoMestreDosMagosNaoAutorizado() {
        try {
            MestreDosMagos mestreDosMagos = new MestreDosMagos("Skaldr", false);
            MagoProxy magoProxy = new MagoProxy(1);
            magoProxy.obterPoderMagico(mestreDosMagos);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Têm certeza que é um mago? Se liga na origem do seu nome.", e.getMessage());
        }
    }
}
