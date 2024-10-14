package mockitos_exemplos;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {


    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro(){
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("SP","São Paulo","Vila Panrampampã","Casa 2","Rua 30");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("234324")).thenReturn(dadosLocalizacao);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Felipe","39247392", LocalDate.now(),"234324");

        assertEquals("Felipe", pessoa.getNome());
        assertEquals("39247392", pessoa.getDocumento());
        assertEquals("SP", pessoa.getEndereco().getUf());
        assertEquals("São Paulo", pessoa.getEndereco().getCidade());

    }

}
