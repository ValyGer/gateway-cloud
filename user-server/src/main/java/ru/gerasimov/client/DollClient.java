package ru.gerasimov.client;

import ru.gerasimov.model.Doll;

import java.util.List;

public interface DollClient {

    Doll createDoll(Doll doll);

    List<Doll> getAllDolls();

    Doll getDollById(int id);

    void deleteDoll(int dollId);
}
