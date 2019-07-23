package br.community.javaclean.gateways.postgresql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.community.javaclean.domains.Pokemon;

@Component
public class PokemonDatabaseGateway {

  private final PokemonRepository pokemonRepository;

  @Autowired
  public PokemonDatabaseGateway(PokemonRepository pokemonRepository) {
    this.pokemonRepository = pokemonRepository;
  }

  public br.community.javaclean.gateways.postgresql.domain.Pokemon save(Pokemon pokemon) {
    return pokemonRepository.save(parsePokemon(pokemon));
  }

  private br.community.javaclean.gateways.postgresql.domain.Pokemon parsePokemon(Pokemon pokemon) {
    return br.community.javaclean.gateways.postgresql.domain.Pokemon.builder()
        .id(pokemon.getId())
        .weight(pokemon.getWeight())
        .name(pokemon.getName())
        .height(pokemon.getHeight())
        .baseExperience(pokemon.getBaseExperience())
        .build();
  }
}
