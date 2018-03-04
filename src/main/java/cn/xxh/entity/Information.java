package cn.xxh.entity;

import java.util.Date;

public class Information {

	public String title;
	public String content;
	public Date time;

	public Information() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String toString() {
		return "Information [title=" + title + ", content=" + content + ", time=" + time + "]";
	}

}
