package com.fruit.repositories.fruit;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fruit.model.fruit.Fruit;

@Repository
public interface FruitRepository extends MongoRepository<Fruit, BigInteger> {

	List<Fruit> findByCategoryCode(String categoryCode);

	List<Fruit> findByFruitNameLike(String fruitName);

	Fruit findByFruitName(String fruitName);
}
