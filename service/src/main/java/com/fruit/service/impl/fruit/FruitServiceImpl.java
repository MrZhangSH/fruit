package com.fruit.service.impl.fruit;

import com.fruit.service.fruit.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Created by zhang on 2017-6-1.
 */
public class FruitServiceImpl implements FruitService{

    @Autowired
    private MongoTemplate mongoTemplate;
}
