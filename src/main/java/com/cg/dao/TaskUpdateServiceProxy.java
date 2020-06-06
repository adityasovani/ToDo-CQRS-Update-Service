package com.cg.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.bean.Task;

@FeignClient(name = "ToDoList-service", url = "https://todo-cqrs-update-service.herokuapp.com/")
public interface TaskUpdateServiceProxy {

	@PostMapping("addTask")
	public Task addTask(@RequestBody Task t);

	@PutMapping("updateTask")
	public Task updateTask(@RequestBody Task t);

	@DeleteMapping("deleteTask/{taskId}")
	public void deleteTask(@PathVariable int taskId);

}
