package br.com.trinity.saladereuniao.domain;

import java.time.LocalDateTime;

public class Meeting {

	private String _id;
	private Team team;
	private String title;
	private String description;
	private LocalDateTime dateTimeBegin;
	private LocalDateTime dateTimeEnd;

	public Meeting(String _id, Team team, String title, String description, LocalDateTime dateTimeBegin,
			LocalDateTime dateTimeEnd) {
		super();
		this._id = _id;
		this.team = team;
		this.title = title;
		this.description = description;
		this.dateTimeBegin = dateTimeBegin;
		this.dateTimeEnd = dateTimeEnd;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getDateTimeBegin() {
		return dateTimeBegin;
	}

	public void setDateTimeBegin(LocalDateTime dateTimeBegin) {
		this.dateTimeBegin = dateTimeBegin;
	}

	public LocalDateTime getDateTimeEnd() {
		return dateTimeEnd;
	}

	public void setDateTimeEnd(LocalDateTime dateTimeEnd) {
		this.dateTimeEnd = dateTimeEnd;
	}

}
