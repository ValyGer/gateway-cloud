package ru.gerasimov.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gerasimov.entity.Doll;

public interface DollRepository extends JpaRepository<Doll, Integer> {
}
