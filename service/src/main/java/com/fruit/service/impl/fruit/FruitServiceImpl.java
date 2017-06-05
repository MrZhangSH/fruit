package com.fruit.service.impl.fruit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
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

	public List<Fruit> findAllFruit() {
		Query query = new Query();
		query.with(new Sort(Direction.DESC, "name"));
		List<Fruit> fruits = mongoTemplate.find(query, Fruit.class);
		return fruits;
	}

	public Fruit findFruitByName(String fruitName) {
		Query query = new Query(Criteria.where("name").is(fruitName));
		return mongoTemplate.findOne(query, Fruit.class);
	}
}
