package org.zerock.mapper.lecture.sample;

import java.util.List;

import org.zerock.domain.lecture.sample.CoffeeDto;

public interface CoffeeMapper {

	List<CoffeeDto> getCoffeeList();

	int update(CoffeeDto coffee);

}
