package zycus.test.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import zycus.test.model.Student;
import zycus.test.model.StudentListInput;
import zycus.test.service.StudentService;

/**
 * Controller responsible for filtering the given students with the start and
 * end roll numbers
 * 
 * @author Prabhakar
 *
 */
@RestController
public class StudentController {
	private static final Logger LOG = LoggerFactory.getLogger(StudentController.class);
	@Autowired
	private StudentService service;

	/**
	 * Filters input list of students with start and end roll numbers (Both
	 * included)
	 * 
	 * @param startRollNo
	 *            Required. Starting RollNo.
	 * @param endRollNo
	 *            Required. End RollNo
	 * @param studentsInput
	 *            Required. List of students to filter
	 * @return
	 */
	@RequestMapping(value = "/rest/parseList", method = RequestMethod.POST)
	public List<Student> filterStudent(@RequestParam String startRollNo, @RequestParam String endRollNo,
			@RequestBody StudentListInput studentsInput) {
		LOG.info("Filtering students %s - %s", startRollNo, endRollNo);
		return service.filterStudent(startRollNo, endRollNo, studentsInput);
	}

}
