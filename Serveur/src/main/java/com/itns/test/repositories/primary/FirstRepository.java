package com.itns.test.repositories.primary;

import com.itns.test.models.First;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FirstRepository extends MongoRepository<First, String> {
}
