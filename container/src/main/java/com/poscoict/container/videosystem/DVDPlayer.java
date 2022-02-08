package com.poscoict.container.videosystem;

public class DVDPlayer {
	private DigitalVideoDisc dvd;

	public DVDPlayer() {
	}

	public DVDPlayer(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}

	public DigitalVideoDisc getDvd() {
		return dvd;
	}

	public void setDvd(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}

	public void play() {
		dvd.play(); //에러나는 이유는 DigitalVideoDisc 인터페이스에 play메소드가 없어서
	}
}




