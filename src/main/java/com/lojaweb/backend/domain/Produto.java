package com.lojaweb.backend.domain;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import lombok.Data;

@Entity(name="Produto")
@Table(name="Produto")
@Data
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   
    private String descricaoCurta;

   
    private String descricaoDetalhada;

   
    @ManyToOne
    @JoinColumn(name="idCategoria")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name="idMarca")
    private Marca marca;

    private Float valorCusto;

    private Float valorVenda;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;
}
