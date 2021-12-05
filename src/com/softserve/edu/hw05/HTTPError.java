package com.softserve.edu.hw05;

public enum HTTPError {
	BAD_REQUEST(400), UNAUTHARIZED(401), PAYMENT_REQUIRED(402),
	FORBIDDEN(403), NOT_FOUND(404), METHOD_NOT_ALLOWED(405),
	NO_ACCEPTABLE(406), PROXY_AUTHENTICATION_REQUIRED(407),
	REQUEST_TIMEOUT(408), CONFLICT(409), GONE(410);
	
private int error;

private HTTPError(int error) {
	this.error = error;
}

public int getError() {
	return error;
}
}