package com.jacaranda.model;

public class BookException extends Exception {

	public BookException() {
	}

	public BookException(String message) {
		super(message);
	}

	public BookException(Throwable cause) {
		super(cause);
	}

	public BookException(String message, Throwable cause) {
		super(message, cause);
	}

	public BookException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
