package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class ExamEntity {
    @Id
    private Long id ;

    private LocalDateTime startDate ;

    private LocalDateTime endDate ;

    @Column(unique = true)
    private String name ;

    private int weight ;

    @ManyToMany
    private Set<SkillEntity> skillEntities ;

    @OneToMany(mappedBy = "examEntity")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities ;

    @ManyToOne
    private EcosSessionEntity ecosSessionEntity ;
}
