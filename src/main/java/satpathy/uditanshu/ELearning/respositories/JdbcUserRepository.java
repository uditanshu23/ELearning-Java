package satpathy.uditanshu.ELearning.respositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import satpathy.uditanshu.ELearning.models.User;
import satpathy.uditanshu.ELearning.models.UserRowMapper;

@Repository
public class JdbcUserRepository implements UserRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public User findById(int id) {
		String sql = "SELECT *FROM users WHERE id = ?;";
		try {
			User user = jdbcTemplate.queryForObject(sql, new UserRowMapper(), new Object[] {id});
			return user;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<User> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int create(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}


