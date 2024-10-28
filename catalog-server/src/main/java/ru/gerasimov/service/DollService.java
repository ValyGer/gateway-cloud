package ru.gerasimov.service;

import ru.gerasimov.entity.Doll;

import java.util.List;

public interface DollService {

    Doll createDoll(Doll doll);

    List<Doll> findAllDolls();

    Doll findDollById(int id);

}
