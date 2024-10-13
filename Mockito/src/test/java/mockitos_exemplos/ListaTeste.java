package mockitos_exemplos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import org.mockito.Mockito;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ListaTeste {

    @Mock
    private List<String> letras;

    @Test
    void adicionarItemNaLista(){
    Mockito.when(letras.getFirst()).thenReturn("a");

        Assertions.assertEquals("a", letras.getFirst());
    }
}
