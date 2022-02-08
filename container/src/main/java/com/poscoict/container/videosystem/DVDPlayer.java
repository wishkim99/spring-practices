package com.poscoict.container.videosystem;

public class DVDPlayer {

	private DigitalVideoDisc dvd;
	public void play() {
		dvd.play(); //에러나는 이유는 DigitalVideoDisc 인터페이스에 play메소드가 없어서
	}

}
