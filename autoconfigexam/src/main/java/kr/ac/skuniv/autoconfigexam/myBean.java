package kr.ac.skuniv.autoconfigexam;

import org.springframework.stereotype.Component;

@Component
public class myBean {
	
	private String name;
	private int count;
	
	public myBean() {
		System.out.println("MyBean 생성자 호출");
		
	}
	
	public myBean(String name) {
		
		this.name=name;
		//this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
