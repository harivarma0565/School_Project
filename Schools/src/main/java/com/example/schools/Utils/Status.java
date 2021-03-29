package com.example.schools.Utils;

public enum Status {

	PRINCIPAL(1, "PRINCIPAL"), HM(2, "HM"), FACULTY(3, "FACULTY"), STUDENT(4, "STUDENT"), ATTENDER(5, "ATTENDER"),
	DRIVER(6, "DRIVER");

	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Status(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

}
