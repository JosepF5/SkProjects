package com.sofka.co.tour.repository;

import com.sofka.co.tour.collections.Biker;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikerRepository extends ReactiveMongoRepository<Biker,String> {

}
