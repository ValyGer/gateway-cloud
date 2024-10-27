package ru.gerasimov.service;

import ru.gerasimov.entity.Doll;

import java.util.List;

public interface DollService {

    List<Doll> findAllDolls();

    Doll findDollById(int id);

}
