package br.community.javaclean.gateways.postgresql;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import br.community.javaclean.confs.UnitTest;
import br.community.javaclean.domains.Pokemon;
import br.community.javaclean.gateways.postgresql.assembler.PokemonAssembler;
import io.github.glytching.junit.extension.random.Random;

class PokemonDatabaseGatewayTest extends UnitTest {

  @InjectMocks private PokemonDatabaseGateway pokemonDatabaseGateway;
  @Mock private PokemonRepository pokemonRepository;
  @Mock private PokemonAssembler pokemonAssembler;

  @Test
  public void shouldSavePokemon(
      @Random Pokemon pokemon,
      @Random br.community.javaclean.gateways.postgresql.domain.Pokemon dbPokemon) {

    when(pokemonAssembler.assemble(pokemon)).thenReturn(dbPokemon);

    pokemonDatabaseGateway.save(pokemon);

    verify(pokemonRepository, times(1)).save(eq(dbPokemon));
    verify(pokemonAssembler, times(1)).assemble(pokemon);
  }
}
