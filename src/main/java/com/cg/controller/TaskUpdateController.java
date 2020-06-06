package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bean.Task;
import com.cg.dao.TaskUpdateServiceProxy;

import io.swagger.annotations.Api;

@RestController
@CrossOrigin
public class TaskUpdateController {

	@Autowired
	TaskUpdateServiceProxy proxy;

	@PostMapping("addTask")
	public Task addTask(@RequestBody Task t) {
		return proxy.addTask(t);
	}

	@PutMapping("updateTask")
	public Task updateTask(@RequestBody Task t) {
		return proxy.updateTask(t);
	}
	
	@DeleteMapping("deleteTask")
	public void deleteTask(@RequestParam int Id) {
		 proxy.deleteTask(Id);
	}
}
