package com.kodnest.practice.program1;

public class Laptop {

	private String processorName;
	private String memorySize;
	public Laptop(String processorName, String memorySize) {
		super();
		this.processorName = processorName;
		this.memorySize = memorySize;
	}
	public String getProcessorName() {
		return processorName;
	}
	public String getMemorySize() {
		return memorySize;
	}
	
}
