package com.shrenik.example;

import java.util.InputMismatchException;

public class ExceptionHandler extends Exception{
	
	public String errorCode;
	public String errMsg;
	
	public ExceptionHandler()
	{
		super();
		errorCode = "E0031";
		errMsg = "Unhandled Exception";
	}
	
	public ExceptionHandler(Object exObj)
	{
		if(exObj instanceof ArithmeticException)
		{
			errorCode = "E0032";
			errMsg = "Division By Zero is not Valid";
		}
		else if(exObj instanceof InputMismatchException)
		{
			errorCode = "E0033";
			errMsg = "Input is not Valid. Check its type";
		}
		else if(exObj instanceof ArrayIndexOutOfBoundsException)
		{
			errorCode = "E0034";
			errMsg = "Array Index is not Valid. enter correct";
		}
		else if(exObj instanceof ClassCastException)
		{
			errorCode = "E0035";
			errMsg = "Class can not cast to the type you expected. Check its Correct/valid type";
		}
		else if(exObj instanceof Exception)
		{
			errorCode = "E0036";
			errMsg = "Exception is Unknown";
		}
	}

	@Override
	public String toString() {
		return "ExceptionHandler [errorCode=" + errorCode + ", errMsg=" + errMsg + "]";
	}
	
	
}
