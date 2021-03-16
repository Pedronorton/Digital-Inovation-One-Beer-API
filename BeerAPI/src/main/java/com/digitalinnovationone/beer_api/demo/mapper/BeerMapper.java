package com.digitalinnovationone.beer_api.demo.mapper;


import com.digitalinnovationone.beer_api.demo.dto.BeerDTO;
import com.digitalinnovationone.beer_api.demo.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
