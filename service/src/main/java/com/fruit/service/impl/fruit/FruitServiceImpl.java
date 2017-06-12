package com.fruit.service.impl.fruit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.fruit.model.fruit.Fruit;
import com.fruit.repositories.fruit.FruitRepository;
import com.fruit.service.fruit.FruitService;

/**
 * Created by zhang on 2017-6-1.
 */
@Service("fruitService")
public class FruitServiceImpl implements FruitService {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Autowired
	private FruitRepository fruitRepository;

	public boolean addFruit(Fruit fruit) {

		try {
			mongoTemplate.insert(fruit);
		} catch (Exception e) {
			return false;
		}

		return true;
	}

	public void insertFruit(Fruit fruit) {
		fruitRepository.insert(fruit);
	}

	public List<Fruit> findAllFruit() {
		return fruitRepository.findAll();
	}

	public List<Fruit> findByCategoryCode(String categoryCode) {
		return fruitRepository.findByCategoryCode(categoryCode);
	}

	public Fruit findFruitByName(String fruitName) {
		return fruitRepository.findByFruitName(fruitName);
	}

	public List<Fruit> findByNameLike(String fruitName) {
		return fruitRepository.findByFruitNameLike(fruitName);
	}

}
