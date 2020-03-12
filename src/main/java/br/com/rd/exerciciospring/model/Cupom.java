package br.com.rd.exerciciospring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cupom")

public class Cupom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cupom")
    private Long idcupom;

    @Column(name = "id_cliente")
    private Long idcliente;

    @Column(name = "dt_venda")
    private String dtavenda;

    @Column(name="vl_venda")
    private BigDecimal vlvenda;


}
