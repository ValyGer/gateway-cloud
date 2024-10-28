package ru.gerasimov.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "doll")
public class Doll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doll_id")
    private Integer dollId;
    @Column(name = "doll_name")
    private String dollName;
}
