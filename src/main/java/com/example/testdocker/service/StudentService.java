package com.example.testdocker.service;

import com.example.testdocker.dto.request.StudentRequest;
import com.example.testdocker.dto.response.StudentResponse;

import java.util.List;

public interface StudentService {

    StudentResponse create(StudentRequest request);

    StudentResponse findById(Long id);

    List<StudentResponse> findAll();
}
