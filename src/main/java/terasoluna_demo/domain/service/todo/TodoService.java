package terasoluna_demo.domain.service.todo;

import java.util.Collection;

import terasoluna_demo.domain.model.Todo;

public interface TodoService {
	Collection<Todo> findAll();

	Todo create(Todo todo);

	Todo finish(String todoId);

	void delete(String todoId);
}