package satpathy.uditanshu.ELearning.respositories;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import satpathy.uditanshu.ELearning.models.Course;
import satpathy.uditanshu.ELearning.models.CourseRowMapper;

@Repository
public class JdbcCourseRepository implements CourseRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Course findById(int id) {
		String sql = "SELECT * FROM courses WHERE id = ?;";
		try {
			Course course = jdbcTemplate.queryForObject(sql, new CourseRowMapper(), new Object[] {id});
			
			return course;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Course> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int create(Course course) {
		// TODO Auto-generated method stub
		return 0;
	}

}
