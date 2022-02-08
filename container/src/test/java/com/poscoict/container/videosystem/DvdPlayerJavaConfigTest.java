package com.poscoict.container.videosystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.poscoict.container.config.videosystem.DvdPlayerConfig;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {DvdPlayerConfig.class}) //설정 자바 클래스를 만들어야함
public class DvdPlayerJavaConfigTest {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	private DigitalVideoDisc dvd; //dvd 객체를 구현한 객체가 하나의 인터페이스에 
	
	@Autowired
	private DVDPlayer dvdPlayer; //인터페이스는 아님
	
	@Test
	public void testDVDNotNull() {
		assertNotNull(dvd);
	}
	
	@Test
	public void testDVDPlayerNotNull() {
		assertNotNull(dvdPlayer);
	}
	
	@Test
	public void testPlay() {
		dvdPlayer.play();
		assertEquals("Playing Movie MARVEL's Avengers", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
}
