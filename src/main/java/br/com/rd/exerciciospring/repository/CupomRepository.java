package br.com.rd.exerciciospring.repository;

import br.com.rd.exerciciospring.model.Cupom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CupomRepository  extends JpaRepository<Cupom, Long> {
    List<Cupom> findByIdcliente(Long idcliente);
    List<Cupom> findByDtavenda(String dtavenda);
    List<Cupom> findByIdclienteAndDtavenda(Long idcliente, String dtavenda);

}
