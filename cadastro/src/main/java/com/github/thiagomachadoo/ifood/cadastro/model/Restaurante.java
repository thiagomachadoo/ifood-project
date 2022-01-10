package com.github.thiagomachadoo.ifood.cadastro.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
@Table(name="restaurante")
public class Restaurante extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String proprietario;

    public String cnpj;

    public String nome;

    //Quando as entidades estiverem criadas será setado automaticamente
    @ManyToOne
    public Localizacao localizacao;


}
