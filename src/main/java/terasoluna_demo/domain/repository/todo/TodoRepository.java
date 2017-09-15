package terasoluna_demo.domain.repository.todo;

import java.util.Collection;

import terasoluna_demo.domain.model.Todo;

public interface TodoRepository {

    Todo findOne(String todoId);

    Collection<Todo> findAll();

    void create(Todo todo);

    boolean update(Todo todo);

    void delete(Todo todo);

    long countByFinished(boolean finished);

}