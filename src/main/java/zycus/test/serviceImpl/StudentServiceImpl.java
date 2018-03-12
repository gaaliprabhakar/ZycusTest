package zycus.test.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import zycus.test.model.Student;
import zycus.test.model.StudentListInput;
import zycus.test.service.StudentService;

/**
 * Default implementation of {@link StudentService} to handle student related
 * operations.
 * 
 * @author Prabhakar
 *
 */
@Service
public class StudentServiceImpl implements StudentService {

	@Override
	public List<Student> filterStudent(String startRollNo, String ednRollNo, StudentListInput inputs) {
		return inputs.getStudents().getStudent().stream().filter(s -> s.getRollNo().compareTo(startRollNo) >= 0)
				.filter(s -> s.getRollNo().compareTo(ednRollNo) <= 0).collect(Collectors.toList());
	}
}
