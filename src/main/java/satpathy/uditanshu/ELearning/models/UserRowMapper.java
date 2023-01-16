package satpathy.uditanshu.ELearning.models;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new User(
				rs.getInt("user_id"),
				rs.getString("user_name"),
				rs.getString("user_role")
				);
	}

}
