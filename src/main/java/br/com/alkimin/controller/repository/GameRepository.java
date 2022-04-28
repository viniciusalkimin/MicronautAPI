package br.com.alkimin.controller.repository;

import br.com.alkimin.controller.entities.Game;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}
