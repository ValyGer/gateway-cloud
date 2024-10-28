package ru.gerasimov.service;

import ru.gerasimov.entity.Doll;

import java.util.List;

public interface DollService {

    Doll createDoll(Doll doll);

    void deletedoll(int dollId);

    List<Doll> findAllDolls();

    Doll findDollById(int id);

}
