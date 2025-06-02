package com.nekta.springboot.todos.util;

import com.nekta.springboot.todos.entity.User;

public interface FindAuthenticatedUser {
    User getAuthenticatedUser();
}
