package br.com.rd.exerciciospring.controller;

import br.com.rd.exerciciospring.model.Cupom;
import br.com.rd.exerciciospring.repository.CupomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CupomController {
    @Autowired
    private CupomRepository cupomRepository;
    @GetMapping("/cupom")
    public ResponseEntity<List<Cupom>> buscarPorId(@PathParam("idcliente") Long idcliente,
                                               @PathParam("dtavenda") String dtavenda) {
        List<Cupom> cupom = new ArrayList<>();

        if (idcliente != null && dtavenda != null)
            cupom = cupomRepository.findByIdclienteAndDtavenda(idcliente, dtavenda);
        else if(idcliente != null)
            cupom.add(cupomRepository.findById(idcliente).get());
        else if(dtavenda != null)
            cupom = cupomRepository.findByDtavenda(dtavenda);

        if (cupom != null && cupom.size() > 0)
            return ResponseEntity.ok().body(cupom);
        else
            return ResponseEntity.badRequest().build();

    }

    }

