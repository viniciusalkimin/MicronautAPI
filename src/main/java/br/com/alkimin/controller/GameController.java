package br.com.alkimin.controller;

import br.com.alkimin.controller.entities.Game;
import br.com.alkimin.controller.repository.GameRepository;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.ArrayList;
import java.util.List;

@Controller(value = "/game")
public class GameController {

    @Inject
    GameRepository repository;

    @Get
    public List<Game> getAll(){
        return repository.findAll();
    }

    @Post
    public Game newGame(Game game) {
        return repository.save(game);
    }

    @Put
    public Game updateGame(Game game) {
        return repository.update(game);
    }

    @Delete(value = "/{id}")
    public void deleById(Long id) {
        repository.deleteById(id);
    }

}
