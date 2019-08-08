package kr.ac.skuniv.autoconfigexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")		//component만 있으면 싱글턴으로 생성, 플레이어 객체를 여러개 받기위해 scope에 prototype추가 
public class Player {
	
	private String name;
	@Autowired
	private Dice dice;
	
	public Player() {
		System.out.println("player생성");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDice(Dice dice) {			//세터를 통해 다이스를 주입
		this.dice = dice;
	}
	
	
	public void play() {
		
		System.out.println(name+" 주사위를 던져서" + dice.getNumber()+" 가 나왔습니다");
		
	}
	
	
	

}
