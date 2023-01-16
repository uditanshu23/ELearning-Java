package satpathy.uditanshu.ELearning.respositories;

import java.util.List;

import satpathy.uditanshu.ELearning.models.User;

public interface UserRepository {

	User findById(int id);
	
	List<User> listAll();
	
	int create (User user);
}
