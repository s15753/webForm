package servlets;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import javax.servlet.ServletOutputStream;

import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import engine.*;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/form")
public class CreditFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreditFormServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String name = request.getParameter("name");
		//response.setContentType("text/html");
		//response.getWriter().println("<h1>Hello " + name +"<h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String loanAmount = request.getParameter("kwotaKredytu");
		String installmentsCount = request.getParameter("iloscRat");
		String interest = request.getParameter("oprocentowanie");
		String fixedFee = request.getParameter("oplataStala");
		String installmentType = request.getParameter("rodzajRat");
		String button = request.getParameter("action");
		
		// Walidacja pol formularza.
		// Jesli pole kwotaKredytu, iloscRat, oprocentowanie jest puste lub ma wartosc zero, to pozostaje na stronie
		// formularza. Jesli pole oplataStala jest puste rowniez pozostaje na stronie formularza
		CreditCalculation creditCalculation = new CreditCalculation(loanAmount,installmentsCount,interest,fixedFee);
		if(loanAmount==null || loanAmount.equals("") || loanAmount.equals("0") 
				|| installmentsCount==null || installmentsCount.equals("") || installmentsCount.equals("0")
				|| interest==null || interest.equals("") || interest.equals("0")
				|| fixedFee==null || fixedFee.equals("")) {
			response.sendRedirect("/");
		}
		// 
		
		if("Wyslij".equals(button)) {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			if(installmentType.equals("Stala")) {
				printHeader(out);
				printFixedInstallmentsHTML(out, creditCalculation, installmentsCount);
				printFooter(out);
			}
			else {
				printHeader(out);
				printDecreasingInstallmentHTML(out, creditCalculation, installmentsCount);
				printFooter(out);
			}
		}
//		else if("DoPDF".equals(button)) {
//			Document document = new Document();
//			try {
//				ServletOutputStream out = new ServletOutputStream("CreditForm.pdf");
//				PdfWriter.getInstance(document,	out);
//				document.open();
//				document.add(new Paragraph("Ta strona jest typu landscape"));
//			}
//			catch (DocumentException de) {
//					System.err.println(de.getMessage());
//			}
//			catch (IOException ioe) {
//				System.err.println(ioe.getMessage());
//			}
//			document.close();
//		}
	}
	
	// Metoda wypisuje pocz¹tek html'a
	private void printHeader(PrintWriter writer) {
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>Harmonogram splat</h1><br/>");
		writer.println("<table border=\"2\"><tr><td>Rata nr</td><td>Kwota raty</td></tr>");
	}
	
	// Metoda wypisuje kocówkê html'a 
	private void printFooter(PrintWriter writer) {
		writer.println("</table>");
		writer.println("</body>");
		writer.println("</html>");
	}
	
	// Metoda wypisuje raty stale
	private void printFixedInstallmentsHTML(PrintWriter writer, CreditCalculation creditCalculation, String installmentsCount) {
		for(int i=1; i <= Integer.parseInt(installmentsCount); i++) {	
			writer.println("<tr><td>" + i + "</td><td>" + creditCalculation.fixedInstallment() + "</td></tr>");
		}
	}
	
	// Metoda wypisuje raty malejace
	private void printDecreasingInstallmentHTML(PrintWriter writer, CreditCalculation creditCalculation, String installmentsCount) {
		for(int i=1; i <= Integer.parseInt(installmentsCount); i++) {	
			writer.println("<tr><td>" + i + "</td><td>" + creditCalculation.decreasingInstallment(i) + "</td></tr>");
		}
	}	
}

