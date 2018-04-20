package kr.co.gdu;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorWebTest {

	@Mock
	HttpServletRequest request;
	@Mock
	HttpServletResponse response;
	
	@Before
	public void before() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void test() throws ServletException, IOException {
		when(request.getParameter("a")).thenReturn("3");
		when(request.getParameter("b")).thenReturn("2");
		when(request.getParameter("key")).thenReturn("add");
		
		StringWriter SW = new StringWriter();
		PrintWriter PW = new PrintWriter(SW);
		
		when(response.getWriter()).thenReturn(PW);
		
		Calc CL = new Calc();
		CL.doGet(request, response);
		
		System.out.println(SW);
	}
	
	@After
	public void after() {
	}

}
