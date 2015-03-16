package adapt.dao;

import java.util.List;

import adapt.dto.Employee;
import adapt.dto.Episode;
import adapt.dto.Task;

public interface TaskDao {

	List<Task> getTasks(Employee employee, String taskType, Long from, Long to);

	List<Task> getTasksByEpisode(Episode episode);

	List<Task> searchTasks(String query);

	Task getTaskById(Integer id);

	void updateTask(Task task);

	void deleteTask();

}
