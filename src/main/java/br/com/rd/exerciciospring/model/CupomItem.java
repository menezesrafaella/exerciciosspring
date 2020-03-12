package br.com.rd.exerciciospring.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tb_cupom_item")

public class CupomItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_cupom_item")
    private Long idcupomitem;

    @ManyToOne
    @JoinColumn(name= "id_cupom")
    private Cupom idcupom;

    @ManyToOne
    @JoinColumn(name="id_produto")
    private Produto produto;

    @Column(name="qt_produto")
    private Long qtdproduto;

    @Column(name = "vl_produto")
    private BigDecimal vlproduto;



}
