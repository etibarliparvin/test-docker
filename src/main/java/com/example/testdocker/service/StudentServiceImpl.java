package com.example.testdocker.service;

import com.example.testdocker.dto.request.StudentRequest;
import com.example.testdocker.dto.response.StudentResponse;
import com.example.testdocker.mapper.StudentMapper;
import com.example.testdocker.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;
    public final StudentMapper mapper;

    @Override
    public StudentResponse create(StudentRequest request) {
        return mapper.toResponse(repository.save(mapper.toEntity(request)));
    }

    @Override
    public StudentResponse findById(Long id) {
        return mapper.toResponse(repository.findById(id).get());
    }

    @Override
    public List<StudentResponse> findAll() {
        return repository.findAll().stream().map(mapper::toResponse).collect(Collectors.toList());
    }
}
