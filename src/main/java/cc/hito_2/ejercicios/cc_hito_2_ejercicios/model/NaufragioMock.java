package cc.hito_2.ejercicios.cc_hito_2_ejercicios.model;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class NaufragioMock {

    private static Map<Long, Naufragio> naufragios = new HashMap<Long, Naufragio>();
    private static Long idIndex = 4l;

    static {

        Naufragio naufragio1 = new Naufragio(1l, "Titanic", "Transatlántico inglésMuchos muertos de la epoca", 1992);
        Naufragio naufragio2 = new Naufragio(2l, "RMS Lusitania", "transatlántico inglés. 7 de mayo de 1915, 1195 muertos.", 1990);
        Naufragio naufragio4 = new Naufragio(3l, "Wilhelm Gustloff,", "transatlántico alemán hundido el 31 de enero de 1945 ", 1980);
        Naufragio naufragio5 = new Naufragio(4l, "ARA General Heroku", "crucero de la Armada Argentina, hundido durante la guerra de Malvinas en 1982", 1981);
        naufragios.put(1l, naufragio1);
        naufragios.put(2l, naufragio2);
        naufragios.put(3l, naufragio4);
        naufragios.put(4l, naufragio5);
    }


    public List<Naufragio> get() {
        return new ArrayList<Naufragio>(naufragios.values());
    }

    public Naufragio create(Naufragio naufragio) {
        idIndex += idIndex;
        naufragio.setId(idIndex);
        naufragios.put(idIndex, naufragio);
        return naufragio;
    }

    public Naufragio getById(Long id){
        return naufragios.get(id);
    }

    public Naufragio update(Long id, Naufragio naufragio){
        naufragios.put(id, naufragio);
        return  naufragio;
    }

    public static Naufragio delete(Long id){
        return naufragios.remove(id);
    }
}
