package com.bridgelabz.fumdoo.utility;

import com.bridgelabz.fumdoo.response.Response;

public class ResponseHelper {
	public static Response statusResponse(int code, String message) {
		Response statusResponse = new Response();
		statusResponse.setResponseMessage(message);
		statusResponse.setResponseCode(code);
		return statusResponse;
	}
}
