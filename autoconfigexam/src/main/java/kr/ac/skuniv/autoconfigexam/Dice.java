package kr.ac.skuniv.autoconfigexam;

import org.springframework.stereotype.Component;

@Component
public class Dice {
	
	private int face;
	
	public Dice() {
		face= 6;
	}
	
	public Dice(int face) {			//xml에 contstructor
		System.out.println("주사위 생성");
		this.face = face;
		
	}
	
	public int getNumber() {
		System.out.println("주사위의 getnumber");
		return (int)(Math.random()*face)+1;
		
	}

}
