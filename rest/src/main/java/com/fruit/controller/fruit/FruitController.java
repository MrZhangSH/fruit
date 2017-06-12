package com.fruit.controller.fruit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fruit.model.fruit.Fruit;
import com.fruit.service.fruit.FruitService;
import com.fruit.util.common.RespUtil;
import com.fruit.vo.common.Response;

@RestController
@RequestMapping("/fruit")
public class FruitController {

	@Autowired
	private FruitService fruitService;

	@RequestMapping(value = "/addFruit", method = RequestMethod.POST)
	public Response addFruit(@RequestBody Fruit fruit) {
		if (fruitService.addFruit(fruit)) {
			return RespUtil.getSuccessResponse(Response.class);
		}
		return RespUtil.getErrorResponse(Response.class);

	}

	@RequestMapping(value = "/insertFruit", method = RequestMethod.POST)
	public Response insertFruit(@RequestBody Fruit fruit) {
		fruitService.insertFruit(fruit);
		return RespUtil.getResponse("0");

	}

	@RequestMapping(value = "/getAllFruit", method = RequestMethod.GET)
	public List<Fruit> getAllFruit() {
		return fruitService.findAllFruit();
	}

	@RequestMapping(value = "/getFruitByCategoryCode", method = RequestMethod.GET)
	public List<Fruit> getFruitByCategoryCode(
			@RequestParam("categoryCode") String categoryCode) {
		return fruitService.findByCategoryCode(categoryCode);
	}

	@RequestMapping(value = "/getFruitByNameLike", method = RequestMethod.GET)
	public List<Fruit> getFruitByNameLike(
			@RequestParam("fruitName") String fruitName) {
		return fruitService.findByNameLike(fruitName);
	}

	@RequestMapping(value = "/getFruitByName", method = RequestMethod.GET)
	public Fruit getFruitByName(@RequestParam("fruitName") String fruitName) {
		Fruit fruit = fruitService.findFruitByName(fruitName);
		return fruit;
	}
}
