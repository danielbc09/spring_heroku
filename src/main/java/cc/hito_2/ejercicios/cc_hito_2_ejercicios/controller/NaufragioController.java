package cc.hito_2.ejercicios.cc_hito_2_ejercicios.controller;


import cc.hito_2.ejercicios.cc_hito_2_ejercicios.model.Naufragio;
import cc.hito_2.ejercicios.cc_hito_2_ejercicios.model.NaufragioMock;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/naufragio")
public class NaufragioController {


    private final NaufragioMock naufragioMock;

    public NaufragioController(NaufragioMock naufragioMock) {
        this.naufragioMock = naufragioMock;
    }

    @GetMapping
    public List<Naufragio> get() {
        return naufragioMock.get();
    }

    @GetMapping("{id}")
    public Naufragio get(@PathVariable Long id){
        return naufragioMock.getById(id);
    }

    @PostMapping
    public  Naufragio create(@RequestBody Naufragio naufragio)
    {
        return naufragioMock.create(naufragio);
    }

    @PutMapping("{id}")
    public Naufragio update(@PathVariable Long id, @RequestBody Naufragio naufragio){
        return naufragioMock.update(id, naufragio);
    }


    @DeleteMapping
    public Naufragio delete(@PathVariable Long id){
        return naufragioMock.delete(id);
    }
}

