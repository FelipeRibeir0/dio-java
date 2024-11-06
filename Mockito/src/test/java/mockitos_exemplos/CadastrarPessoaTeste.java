package mockitos_exemplos;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doThrow;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {


    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void lancarExceptionQuandoChamarAPIDosCorreios(){
        doThrow(IllegalArgumentException.class).when(apiDosCorreios).buscaDadosComBaseNoCep(anyString());
        assertThrows(IllegalArgumentException.class, () -> cadastrarPessoa.cadastrarPessoa("Felipe","39247392", LocalDate.now(),"234324"));

    }

}
