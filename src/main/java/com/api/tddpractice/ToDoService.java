package com.api.tddpractice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {
    private ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }
    public List<ToDo> findAll() {
        System.out.println("I am here....");
        System.out.println(toDoRepository==null);
        return toDoRepository.findAll();
    }
}
