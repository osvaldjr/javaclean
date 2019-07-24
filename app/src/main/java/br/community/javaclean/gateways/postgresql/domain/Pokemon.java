package br.community.javaclean.gateways.postgresql.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Entity
public class Pokemon {
  @Id private Integer id;
  private String name;
  private Integer baseExperience;
  private Integer weight;
  private Integer height;
}
