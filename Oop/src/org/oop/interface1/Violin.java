package org.oop.interface1;

public class Violin implements Playable {

	@Override
	public void ready() {
		System.out.println("���̿ø��� �غ�Ǿ����ϴ�.");
	}

	@Override
	public void play() {
		System.out.println("��~��~��");
	}

}
