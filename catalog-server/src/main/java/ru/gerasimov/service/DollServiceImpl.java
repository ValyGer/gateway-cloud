package ru.gerasimov.service;

import jakarta.transaction.Transactional;
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
    @Transactional
    public Doll createDoll(Doll doll) {
        return dollRepository.save(doll);
    }

    @Override
    @Transactional
    public List<Doll> findAllDolls() {
        return dollRepository.findAll();
    }

    @Override
    @Transactional
    public Doll findDollById(int id) {
        return dollRepository.findById(id).get();
    }
}
