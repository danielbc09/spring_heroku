package cc.hito_2.ejercicios.cc_hito_2_ejercicios.controller;

import cc.hito_2.ejercicios.cc_hito_2_ejercicios.model.Naufragio;
import cc.hito_2.ejercicios.cc_hito_2_ejercicios.model.NaufragioMock;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import java.util.Arrays;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class NaufragioControllerTest {

    @Mock
    private NaufragioMock naufragioMock;


    @InjectMocks
    NaufragioController naufragioController;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(naufragioController)
                .build();
    }

    @Test
    public void getNaufragio() throws Exception {

        Naufragio naufragio1 = new Naufragio();
        naufragio1.setId(1l);
        naufragio1.setNombre("Naufragio1 Test");
        naufragio1.setAnoDescubrimiento(1999);
        naufragio1.setDescripcion("Naufragio de prueba 1");

        Naufragio naufragio2 = new Naufragio();
        naufragio1.setId(2l);
        naufragio1.setNombre("Naufragio2 Test");
        naufragio1.setAnoDescubrimiento(1999);
        naufragio1.setDescripcion("Naufragio de prueba 2");


        when(naufragioMock.get()).thenReturn(Arrays.asList(naufragio1, naufragio2));

        mockMvc.perform(get("/api/v1/naufragio/"))
                .andExpect(status().isOk());
    }

    @Test
    public void getById() {
    }

    @Test
    public void create() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }
}