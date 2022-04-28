package br.com.alkimin.controller.entities;

import io.micronaut.core.annotation.Generated;
import io.micronaut.core.annotation.Introspected;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;


@Entity
@Introspected
public class Game {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String plataform;

    public Game(){

    }

    public Game(Long id, String name, String plataform) {
        this.id = id;
        this.name = name;
        this.plataform = plataform;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlataform() {
        return plataform;
    }

    public void setPlataform(String plataform) {
        this.plataform = plataform;
    }
}
