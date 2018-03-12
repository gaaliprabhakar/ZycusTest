package zycus.test.service;

import java.util.List;

import zycus.test.model.Student;
import zycus.test.model.StudentListInput;

/**
 * Student Service to provide operations related to student
 * 
 * @author Prabhakar
 *
 */
public interface StudentService {
	/**
	 * Filters given students with start and end rollNo (Both are included)
	 * 
	 * @param startRollNo
	 * @param endRollNo
	 * @param studentsInput
	 * @return
	 */
	public List<Student> filterStudent(String startRollNo, String endRollNo, StudentListInput studentsInput);
}
