package com.fruit.util.common;

import java.lang.reflect.Method;

import com.fruit.vo.common.MyException;
import com.fruit.vo.common.Response;
import com.fruit.vo.common.ResponseHeader;

public class RespUtil {

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

	public static <T> T getSuccessResponse(Class<T> clazz) {
		try {
			T resp = clazz.newInstance();
			Method method = clazz.getMethod("setHeader", ResponseHeader.class);

			method.invoke(resp, getResponseHeader("0"));
			return resp;
		} catch (Exception e) {
			throw new MyException(e.getMessage());
		}

	}

	public static <T> T getErrorResponse(Class<T> clazz) {
		try {
			T resp = clazz.newInstance();
			Method method = clazz.getMethod("setHeader", ResponseHeader.class);

			method.invoke(resp, getResponseHeader("1"));
			return resp;
		} catch (Exception e) {
			throw new MyException(e.getMessage());
		}

	}

}
