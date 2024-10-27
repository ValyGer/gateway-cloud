package ru.gerasimov.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gerasimov.entity.Doll;
import ru.gerasimov.repo.DollRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DollServiceImpl implements DollService {

    private final DollRepository dollRepository;

    @Override
    public List<Doll> findAllDolls() {
        return dollRepository.getAllDolls();
    }

    @Override
    public Doll findDollById(int id) {
        return dollRepository.getDollById(id);
    }
}
