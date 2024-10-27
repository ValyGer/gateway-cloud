package ru.gerasimov.repo;

import org.springframework.stereotype.Repository;
import ru.gerasimov.entity.Doll;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DollRepositoryImpl implements DollRepository {

    List<Doll> dolls = List.of(new Doll("Barby"), new Doll("Ken"));

    @Override
    public List<Doll> getAllDolls() {
        return dolls;
    }

    @Override
    public Doll getDollById(int id) {
        return dolls.get(id);
    }
}
