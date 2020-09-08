package com.home.app.model;

public class Topic {	
	
    private int topicId;  
    private String title;
	private String category;
	
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Topic [topicId=" + topicId + ", title=" + title + ", category=" + category + "]";
	}
	
} 