package com.example.testdocker.mapper;

import com.example.testdocker.domain.Student;
import com.example.testdocker.dto.request.StudentRequest;
import com.example.testdocker.dto.response.StudentResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    Student toEntity(StudentRequest request);

    StudentResponse toResponse(Student student);
}
