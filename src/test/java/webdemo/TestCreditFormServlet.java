package webdemo;

import servlets.CreditFormServlet;
import org.mockito.*;
import org.junit.Test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestCreditFormServlet extends Mockito{
	
	/*@Test
	public void servlet_should_not_display_credit_form_if_loanAmount_is_null() throws ServletException, IOException {
	HttpServletRequest request = mock(HttpServletRequest.class);
	HttpServletResponse response = mock(HttpServletResponse.class);
	CreditFormServlet servlet = new CreditFormServlet();
	
	when(request.getParameter("kwotaKredytu")).thenReturn(null);
	
	servlet.doPost(request,response);
	verify(response).sendRedirect("/");
	}
	
	@Test
	public void servlet_should_not_display_credit_form_if_installmentsCount_is_null() throws ServletException, IOException {
	HttpServletRequest request = mock(HttpServletRequest.class);
	HttpServletResponse response = mock(HttpServletResponse.class);
	CreditFormServlet servlet = new CreditFormServlet();
	
	when(request.getParameter("iloscRat")).thenReturn(null);
	
	servlet.doPost(request,response);
	verify(response).sendRedirect("/");
	}
	
	@Test
	public void servlet_should_not_display_credit_form_if_interest_is_null() throws ServletException, IOException {
	HttpServletRequest request = mock(HttpServletRequest.class);
	HttpServletResponse response = mock(HttpServletResponse.class);
	CreditFormServlet servlet = new CreditFormServlet();
	
	when(request.getParameter("oprocentowanie")).thenReturn(null);
	
	servlet.doPost(request,response);
	verify(response).sendRedirect("/");
	}
	
	@Test
	public void servlet_should_not_display_credit_form_if_fixedFee_is_null() throws ServletException, IOException {
	HttpServletRequest request = mock(HttpServletRequest.class);
	HttpServletResponse response = mock(HttpServletResponse.class);
	CreditFormServlet servlet = new CreditFormServlet();
	
	when(request.getParameter("oplataStala")).thenReturn(null);
	
	servlet.doPost(request,response);
	verify(response).sendRedirect("/");
	}
	
	@Test
	public void servlet_should_not_display_credit_form_if_loanAmount_is_empty() throws ServletException, IOException {
	HttpServletRequest request = mock(HttpServletRequest.class);
	HttpServletResponse response = mock(HttpServletResponse.class);
	CreditFormServlet servlet = new CreditFormServlet();
	
	when(request.getParameter("kwotaKredytu")).thenReturn("");
	
	servlet.doPost(request,response);
	verify(response).sendRedirect("/");
	}
	
	@Test
	public void servlet_should_not_display_credit_form_if_installmentsCount_is_empty() throws ServletException, IOException {
	HttpServletRequest request = mock(HttpServletRequest.class);
	HttpServletResponse response = mock(HttpServletResponse.class);
	CreditFormServlet servlet = new CreditFormServlet();
	
	when(request.getParameter("iloscRat")).thenReturn("");
	
	servlet.doPost(request,response);
	verify(response).sendRedirect("/");
	}
	
	@Test
	public void servlet_should_not_display_credit_form_if_interest_is_empty() throws ServletException, IOException {
	HttpServletRequest request = mock(HttpServletRequest.class);
	HttpServletResponse response = mock(HttpServletResponse.class);
	CreditFormServlet servlet = new CreditFormServlet();
	
	when(request.getParameter("oprocentowanie")).thenReturn("");
	
	servlet.doPost(request,response);
	verify(response).sendRedirect("/");
	}
	
	@Test
	public void servlet_should_not_display_credit_form_if_fixedFee_is_empty() throws ServletException, IOException {
	HttpServletRequest request = mock(HttpServletRequest.class);
	HttpServletResponse response = mock(HttpServletResponse.class);
	CreditFormServlet servlet = new CreditFormServlet();
	
	when(request.getParameter("oplataStala")).thenReturn("");
	
	servlet.doPost(request,response);
	verify(response).sendRedirect("/");
	}
	
	*/
}
