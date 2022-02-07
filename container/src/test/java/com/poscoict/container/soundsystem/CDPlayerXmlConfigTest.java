package com.poscoict.container.soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:com/poscoict/container/config/soundsystem/CDPlayerConfig.xml" })
public class CDPlayerXmlConfigTest {

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@Autowired
	private CDPlayer cdPlayer;

	@Test
	public void testCdPlayerNotNull() {
		assertNotNull(cdPlayer);
	}

	@Test
	public void testHelloWorld1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/poscoict/container/config/soundsystem/CDPlayerConfig.xml");
		CDPlayer cdPlayer = ac.getBean(CDPlayer.class);

		assertNotNull(cdPlayer);
	}

	@Test
	public void testPlay() {
		cdPlayer.play();
		assertEquals("Playing 붕붕 by 김하온", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
		//앞의 변수가 기대하는 값
	}
}