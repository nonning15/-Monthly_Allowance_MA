package com.myspace.sample_project;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class validationErrror implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Error")
	private java.lang.String error;

	public validationErrror() {
	}

	public java.lang.String getError() {
		return this.error;
	}

	public void setError(java.lang.String error) {
		this.error = error;
	}

	public validationErrror(java.lang.String error) {
		this.error = error;
	}

}