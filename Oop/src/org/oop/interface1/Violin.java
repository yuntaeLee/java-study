package org.oop.interface1;

public class Violin implements Playable {

	@Override
	public void ready() {
		System.out.println("바이올린이 준비되었습니다.");
	}

	@Override
	public void play() {
		System.out.println("낑~낑~낑");
	}

}
