package com.galvanize.assessment.motel666;

import com.galvanize.assessment.motel666.controller.EventController;
import com.galvanize.assessment.motel666.model.Events;
import com.galvanize.assessment.motel666.service.EventService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigInteger;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Motel666ApplicationTests {

	@Mock
	private EventService mockService;

	@Test
	public void contextLoads() {
	}

	//test request list of all user events
	//expected output in list format
	@Test
	public void testGetAllEvents(){
		//setup
		BigInteger time = BigInteger.valueOf(345345345);

		Events expectedResult = new Events(UUID.randomUUID(),"promotion-viewed", time);
		EventController eventController = new EventController(mockService);

		when(mockService.getEvents()).thenReturn((Iterable<Events>) expectedResult);
		//execute
		Events actualResult = (Events) eventController.getEvents();

		//assert
		assertEquals(expectedResult,actualResult);

	}

	//testing get user evnts by id
	@Test
	public void testGetEventsById(){

		//setup
		UUID id = UUID.randomUUID();
		BigInteger time = BigInteger.valueOf(345345345);
		Events expectedResult = new Events(id,"promotion-viewed", time);
		EventController eventController = new EventController(mockService);

		when(mockService.getEventsById(id)).thenReturn(expectedResult);

		//execute
		Events actualResult = (Events) eventController.getEventsById(id);


		//Assert
		assertEquals(expectedResult,actualResult);

	}




}

