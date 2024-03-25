package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class CandidateEvaluationGridEntity {
    @Id
    private Long sheetNumber ;

    private double grade ;

    private LocalDateTime submissionDate ;


    @ManyToOne
    private CandidateEntity candidateEntity ;

    @ManyToOne
    private ExamEntity examEntity ;
}
