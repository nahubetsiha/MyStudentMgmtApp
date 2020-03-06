package edu.mum.cs.cs425.studentmgmt;

import edu.mum.cs.cs425.studentmgmt.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.service.StudentMgmtAppService;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class StudentmgmtApplication implements CommandLineRunner {

    @Autowired
    private StudentMgmtAppService studentMgmtAppService;

    public static void main(String[] args) {
        SpringApplication.run(StudentmgmtApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Transcript annaTranscript = new Transcript("Computer science");
        Classroom swe = new Classroom("McLaughlin building", "M105");
        Student anna = new Student("000-61-0001", "Anna", "", "Smith", 3.45, LocalDate.of(2019,5,24), annaTranscript, swe);

//        anna.setTranscript(annaTranscript);
//        annaTranscript.setStudent(anna);
//        anna.setClassroom(swe);
//        swe.addStudent(anna);
//
        studentMgmtAppService.saveTranscript(annaTranscript);
        studentMgmtAppService.saveClassroom(swe);
        studentMgmtAppService.saveStudent(anna);

    }
}
