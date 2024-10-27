package ru.gerasimov.repo;

import ru.gerasimov.entity.Doll;

import java.util.List;

public interface DollRepository {

    List<Doll> getAllDolls();

    Doll getDollById(int id);
}
