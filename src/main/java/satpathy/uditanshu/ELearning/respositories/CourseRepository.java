package satpathy.uditanshu.ELearning.respositories;

import java.util.List;

import satpathy.uditanshu.ELearning.models.Course;

public interface CourseRepository {

	Course findById(int id);
	
	List<Course> listAll();
	
	int create(Course course);
}
