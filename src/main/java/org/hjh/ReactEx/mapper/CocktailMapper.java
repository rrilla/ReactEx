package org.hjh.ReactEx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.hjh.ReactEx.domain.CocktailVo;

public interface CocktailMapper {
	
	@Select("select no, name, ename, img_name, base, ingredient, technique, glass, garnish, recipe, tmi from cocktail")
	public List<CocktailVo> getList();
}
