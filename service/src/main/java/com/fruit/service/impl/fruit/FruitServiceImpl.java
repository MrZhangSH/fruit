package com.fruit.service.impl.fruit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.fruit.model.fruit.Fruit;
import com.fruit.service.fruit.FruitService;

/**
 * Created by zhang on 2017-6-1.
 */
@Service("fruitService")
public class FruitServiceImpl implements FruitService {

	@Autowired
	private MongoTemplate mongoTemplate;

	public boolean addFruit(Fruit fruit) {

		try {
			mongoTemplate.insert(fruit);
		} catch (Exception e) {
			return false;
		}

		return true;
	}
}
