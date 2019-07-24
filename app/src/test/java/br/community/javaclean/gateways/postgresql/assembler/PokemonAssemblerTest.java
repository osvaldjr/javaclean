package br.community.javaclean.gateways.postgresql.assembler;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import br.community.javaclean.confs.UnitTest;
import br.community.javaclean.domains.Pokemon;
import io.github.glytching.junit.extension.random.Random;

class PokemonAssemblerTest extends UnitTest {
  @InjectMocks private PokemonAssembler pokemonAssembler;

  @Test
  public void shouldAssemblePokemon(@Random Pokemon pokemon) {
    br.community.javaclean.gateways.postgresql.domain.Pokemon assembled =
        pokemonAssembler.assemble(pokemon);
    assertThat(assembled, notNullValue());
    assertThat(assembled.getId(), equalTo(pokemon.getId()));
    assertThat(assembled.getBaseExperience(), equalTo(pokemon.getBaseExperience()));
    assertThat(assembled.getHeight(), equalTo(pokemon.getHeight()));
    assertThat(assembled.getWeight(), equalTo(pokemon.getWeight()));
    assertThat(assembled.getName(), equalTo(pokemon.getName()));
  }
}
