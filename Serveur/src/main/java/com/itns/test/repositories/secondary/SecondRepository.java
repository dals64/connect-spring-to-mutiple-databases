package com.itns.test.repositories.secondary;

import com.itns.test.models.Second;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SecondRepository extends MongoRepository<Second, String> {
}
