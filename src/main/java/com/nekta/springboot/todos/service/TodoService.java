package com.nekta.springboot.todos.service;


import com.nekta.springboot.todos.request.TodoRequest;
import com.nekta.springboot.todos.response.TodoResponse;

import java.util.List;

public interface TodoService {
    List<TodoResponse> getAllTodos();

    TodoResponse createTodo(TodoRequest todoRequest);

    TodoResponse toggleTodoCompletion(long id);

    void deleteTodo(long id);
}
