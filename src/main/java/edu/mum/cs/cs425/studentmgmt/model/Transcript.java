package edu.mum.cs.cs425.studentmgmt.model;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "transcripts")
public class Transcript {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long transcriptId;
    @NotNull
    private String degreeTitle;
//    @OneToOne(mappedBy = "transcript")
//    private Student student;


    public Transcript() {
    }

    public Transcript(String degreeTitle){
        this.degreeTitle = degreeTitle;
    }

    public String getDegreeTitle() {
        return degreeTitle;
    }

    public void setDegreeTitle(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }

//    public Student getStudent() {
//        return student;
//    }
//
//    public void setStudent(Student student) {
//        this.student = student;
//    }
}
