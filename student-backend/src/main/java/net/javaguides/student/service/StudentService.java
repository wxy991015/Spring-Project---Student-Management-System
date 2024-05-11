package net.javaguides.student.service;

import lombok.AllArgsConstructor;
import net.javaguides.student.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    StudentDto createStudent(StudentDto studentDto);
    StudentDto getStudentById(Long studentId);
    List<StudentDto> getAllStudents();
    StudentDto updateStudent(Long studentId, StudentDto studentDto);
    void deleteStudent(Long studentId);
}
