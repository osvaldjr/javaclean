package br.community.javaclean.gateways.postgresql;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import br.community.javaclean.gateways.postgresql.domain.Pokemon;

@Component
public interface PokemonRepository extends CrudRepository<Pokemon, Integer> {}
