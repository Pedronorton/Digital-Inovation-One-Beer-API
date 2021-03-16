package com.digitalinnovationone.beer_api.demo.repository;

import com.digitalinnovationone.beer_api.demo.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BeerRepository extends JpaRepository<Beer, Long> {

    Optional<Beer> findByName(String name);
}