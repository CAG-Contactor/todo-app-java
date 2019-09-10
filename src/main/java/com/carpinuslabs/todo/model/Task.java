package com.carpinuslabs.todo.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="todo-app-tasks-{DITT_SUFFIX}") Byt ut till ditt eget suffix!
public class Task {
	private String id;
	private String title;
	private String description;
	private boolean done;

	public Task(String title, String descrption) {
		this.title = title;
		this.description = descrption;
	}

    @DynamoDBHashKey(attributeName="id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@DynamoDBAttribute(attributeName="title")
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	@DynamoDBAttribute(attributeName="description")
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@DynamoDBAttribute(attributeName="done")
	public boolean isDone() {
		return this.done;
	}
	
	public void setDone(boolean done) {
		this.done = done;
	}

}
