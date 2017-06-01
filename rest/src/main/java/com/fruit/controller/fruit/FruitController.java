package com.fruit.controller.fruit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fruit.model.fruit.Fruit;
import com.fruit.service.fruit.FruitService;
import com.fruit.util.common.CommonUtil;
import com.fruit.vo.common.Response;

@RestController
@RequestMapping("/fruit")
public class FruitController {

	@Autowired
	private FruitService fruitService;

	@RequestMapping(value = "/addFruit", method = RequestMethod.POST)
	public Response addFruit(@RequestBody Fruit fruit) {
		if (fruitService.addFruit(fruit)) {
			return CommonUtil.getResponse("0");
		}
		return CommonUtil.getResponse("1");

	}

}
