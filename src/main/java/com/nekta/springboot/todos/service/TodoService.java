package com.nekta.springboot.todos.service;


import com.nekta.springboot.todos.request.TodoRequest;
import com.nekta.springboot.todos.response.TodoResponse;

public interface TodoService {
    TodoResponse createTodo(TodoRequest todoRequest);
}
