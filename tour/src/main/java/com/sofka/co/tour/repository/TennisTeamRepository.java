package com.sofka.co.tour.repository;

import com.sofka.co.tour.collections.TennisTeam;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TennisTeamRepository extends ReactiveMongoRepository<TennisTeam,String> {

}