package ru.gerasimov.client;

import ru.gerasimov.model.Doll;

import java.util.List;

public interface DollClient {

    List<Doll> getAllDolls();

    Doll getDollById(int id);

}
