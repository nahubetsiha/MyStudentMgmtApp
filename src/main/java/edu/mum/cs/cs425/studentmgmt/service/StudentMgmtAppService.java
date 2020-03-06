package edu.mum.cs.cs425.studentmgmt.service;

import edu.mum.cs.cs425.studentmgmt.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.repository.IClassroomRepository;
import edu.mum.cs.cs425.studentmgmt.repository.IStudentRepository;
import edu.mum.cs.cs425.studentmgmt.repository.ITranscriptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentMgmtAppService {
    @Autowired
    private IStudentRepository studentRepository;
    @Autowired
    private ITranscriptRepository transcriptRepository;
    @Autowired
    private IClassroomRepository classroomRepository;

    public void saveStudent(Student student){
        studentRepository.save(student);
    }
    public void saveTranscript(Transcript transcript){
        transcriptRepository.save(transcript);
    }
    public void saveClassroom(Classroom classroom){
        classroomRepository.save(classroom);
    }
}
