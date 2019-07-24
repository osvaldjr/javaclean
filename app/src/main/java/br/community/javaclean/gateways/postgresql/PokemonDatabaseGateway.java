package br.community.javaclean.gateways.postgresql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.community.javaclean.domains.Pokemon;
import br.community.javaclean.gateways.postgresql.assembler.PokemonAssembler;

@Component
public class PokemonDatabaseGateway {

  private final PokemonRepository pokemonRepository;
  private final PokemonAssembler pokemonAssembler;

  @Autowired
  public PokemonDatabaseGateway(
      PokemonRepository pokemonRepository, PokemonAssembler pokemonAssembler) {
    this.pokemonRepository = pokemonRepository;
    this.pokemonAssembler = pokemonAssembler;
  }

  public void save(Pokemon pokemon) {
    pokemonRepository.save(pokemonAssembler.assemble(pokemon));
  }
}
