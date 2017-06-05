package com.fruit.service.fruit;

import java.util.List;

import com.fruit.model.fruit.Fruit;

/**
 * Created by zhang on 2017-6-1.
 */
public interface FruitService {

	boolean addFruit(Fruit fruit);

	List<Fruit> findAllFruit();

	Fruit findFruitByName(String fruitName);
}
