package com.example.schools.Utils;

import java.util.List;

import org.springframework.http.HttpStatus;

public class Response<T> {

	private Boolean status;
	private HttpStatus httpStatus;
	private String message;
	private T result;
	private List<String> errors;

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	@Override
	public String toString() {
		return "Response [status=" + status + ", httpStatus=" + httpStatus + ", message=" + message + ", result="
				+ result + ", errors=" + errors + "]";
	}

	public Response(Boolean status, HttpStatus httpStatus, String message, T result, List<String> errors) {
		super();
		this.status = status;
		this.httpStatus = httpStatus;
		this.message = message;
		this.result = result;
		this.errors = errors;
	}

	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Response(Boolean status, HttpStatus httpStatus, T result) {
		super();
		this.status = status;
		this.httpStatus = httpStatus;
		this.result = result;
	}

	public Response(HttpStatus httpStatus, String message, T result) {
		super();
		this.httpStatus = httpStatus;
		this.message = message;
		this.result = result;
	}

	public Response(Boolean status, HttpStatus httpStatus, String message, T result) {
		super();
		this.status = status;
		this.httpStatus = httpStatus;
		this.message = message;
		this.result = result;
	}

	public Response(Boolean status, String message, T result) {
		super();
		this.status = status;
		this.message = message;
		this.result = result;
	}

}
