package br.community.javaclean.gateways.postgresql.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Pokemon {

  @Id Integer id;
  String name;
  Integer baseExperience;
  Integer weight;
  Integer height;
}
