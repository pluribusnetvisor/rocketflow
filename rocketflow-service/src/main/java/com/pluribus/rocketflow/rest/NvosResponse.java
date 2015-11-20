package com.pluribus.rocketflow.rest;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NvosResponse<T> {

	@JsonProperty("data")
	private T[] data;

	public T[] getData() {
		return data;
	}

	public void setData(T[] data) {
		this.data = data;
	}

	@JsonProperty("result")
	private NvosResult result;

	public NvosResult getResult() {
		return result;
	}

	public void setResult(NvosResult result) {
		this.result = result;
	}

	public static class NvosResult {
		@JsonProperty("status")
		private String status;
		
		@JsonProperty("result")
		private NvosResultDetail[] result;

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public NvosResultDetail[] getResult() {
			return result;
		}

		public void setResult(NvosResultDetail[] result) {
			this.result = result;
		}

		@Override
		public String toString() {
			return "NvosResult [status=" + status + ", result=" + Arrays.toString(result) + "]";
		}
		
		
	}

	public static class NvosResultDetail {
		@JsonProperty("api.switch-name")
		private String apiSwitchName;

		@JsonProperty("scope")
		private String scope;
		
		@JsonProperty("status")
		private String status;
		
		@JsonProperty("code")
		private int code;
		
		@JsonProperty("message")
		private String message;

		public String getApiSwitchName() {
			return apiSwitchName;
		}

		public void setApiSwitchName(String apiSwitchName) {
			this.apiSwitchName = apiSwitchName;
		}

		public String getScope() {
			return scope;
		}

		public void setScope(String scope) {
			this.scope = scope;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public int getCode() {
			return code;
		}

		public void setCode(int code) {
			this.code = code;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		@Override
		public String toString() {
			return "NvosResultDetail [apiSwitchName=" + apiSwitchName + ", scope=" + scope + ", status=" + status
					+ ", code=" + code + ", message=" + message + "]";
		}
		
		
	}
}
