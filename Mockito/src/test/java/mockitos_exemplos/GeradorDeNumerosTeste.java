package mockitos_exemplos;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class GeradorDeNumerosTeste {

    @Test
    void testaGeracaoComTamanhoDefinido(){
         try (MockedStatic<GeradorDeNumeros> mockedStatic = Mockito.mockStatic(GeradorDeNumeros.class)) {
                int tamanhoLista = 5;
                List<Integer> numerosEsperados = List.of(1, 2, 3, 4, 5);

                mockedStatic.when(() -> GeradorDeNumeros.geraNumerosAleatorios(tamanhoLista)).thenReturn(numerosEsperados);

                List<Integer> numerosGerados = GeradorDeNumeros.geraNumerosAleatorios(tamanhoLista);
                assertEquals(numerosEsperados, numerosGerados, "A lista gerada deve corresponder à lista esperada");

                mockedStatic.verify(() -> GeradorDeNumeros.geraNumerosAleatorios(tamanhoLista));
         }
    }
}
