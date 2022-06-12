package org.oop.interface1;

public class Guitar implements Playable {

	@Override
	public void ready() {
		System.out.println("기타가 준비되었습니다.");
	}

	@Override
	public void play() {
		System.out.println("디링디링");
	}

}
