package org.hjh.ReactEx.controller;

import lombok.AllArgsConstructor;

import java.util.List;

import org.hjh.ReactEx.domain.CocktailVo;
import org.hjh.ReactEx.mapper.CocktailMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@AllArgsConstructor
@RequestMapping("/cock")
public class RestController {

	private CocktailMapper mapper;
	
	@GetMapping({"","/"})
	public List<CocktailVo> findAll() {

		return mapper.getList();
	}
}
