package edu.icet.service.impl;

import edu.icet.dto.Exam;
import edu.icet.entity.ExamEntity;
import edu.icet.repository.ExamRepository;
import edu.icet.service.ExamService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
@RequiredArgsConstructor
public class ExamServiceImpl implements ExamService {

    private final ExamRepository repository;
    private final ModelMapper mapper;
    @Override
    public String createExam(Exam exam) {

        repository.save(mapper.map(exam, ExamEntity.class));

        return "exam created";
    }

    @Override
    public Exam getExamByCourseId(Integer courseId) {
        return null;
    }

    @Override
    public List<Exam> getAll() {
        return null;
    }

    @Override
    public void updateExam(Exam exam) {

    }

    @Override
    public void deleteExamById(Integer id) {

    }

    @Override
    public void deleteExamByCourseId(Integer courseId) {

    }
}
