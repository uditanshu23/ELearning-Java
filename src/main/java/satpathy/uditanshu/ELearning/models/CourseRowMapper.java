package satpathy.uditanshu.ELearning.models;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CourseRowMapper implements RowMapper<Course> {

	@Override
	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Course(
				rs.getInt("course_id"),
				rs.getString("course_name"),
				rs.getString("course_description")
				);
	}

}
