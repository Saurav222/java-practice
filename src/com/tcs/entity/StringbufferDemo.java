package com.tcs.entity;

public class StringbufferDemo {
	public static void main(String[] args) {
		String literal = "tcs"; //stringpool
		String newKeyWord = new String("tcs"); //heap, immutable
		StringBuilder strBuilder = new StringBuilder("tcs"); //heap,mutable, not thread-safe
		StringBuffer strBuffer = new StringBuffer("tcs"); // heap,mutable, thread-safe
	}
}
