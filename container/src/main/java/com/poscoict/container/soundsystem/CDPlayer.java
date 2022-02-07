package com.poscoict.container.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //클래스마다 달아야함
public class CDPlayer {
	@Autowired
	private CompactDisc cd;
	
	public void play() {
		cd.play();
	}
}
