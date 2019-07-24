package br.community.javaclean.gateways.postgresql.assembler;

import org.springframework.stereotype.Component;

import br.community.javaclean.domains.Pokemon;

@Component
public class PokemonAssembler {

  public br.community.javaclean.gateways.postgresql.domain.Pokemon assemble(Pokemon pokemon) {
    return br.community.javaclean.gateways.postgresql.domain.Pokemon.builder()
        .id(pokemon.getId())
        .weight(pokemon.getWeight())
        .name(pokemon.getName())
        .height(pokemon.getHeight())
        .baseExperience(pokemon.getBaseExperience())
        .build();
  }
}
