package pl.patryk.demo.service;

import org.springframework.data.repository.CrudRepository;
import pl.patryk.demo.model.Champions;


public interface ChampionsRepo extends CrudRepository<Champions,Integer> {
}
