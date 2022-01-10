package com.github.thiagomachadoo.ifood.cadastro.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "restaurante")
public class Restaurante extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String proprietario;

    public String cnpj;

    public String nome;

    //Quando as entidades estiverem criadas será setado automaticamente
    @CreationTimestamp
    public Date dataCriacao;

    //Ou também alterado
    @UpdateTimestamp
    public Date dataAtualizacao;

    @ManyToOne
    public Localizacao localizacao;

}
