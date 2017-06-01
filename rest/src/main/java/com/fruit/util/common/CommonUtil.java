package com.fruit.util.common;

import com.fruit.vo.common.Response;
import com.fruit.vo.common.ResponseHeader;

public class CommonUtil {

	public static Response getResponse(String resultCode) {

		Response response = new Response();
		response.setHeader(getResponseHeader(resultCode));

		return response;
	}

	private static ResponseHeader getResponseHeader(String resultCode) {
		ResponseHeader header = new ResponseHeader();
		header.setResultCode(resultCode);
		return header;
	}

}
