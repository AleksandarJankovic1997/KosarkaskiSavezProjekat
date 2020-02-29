package servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Kosarkasi;
import sessionBeans.StatelessBeanKolokvijumRemote;

/**
 * Servlet implementation class RegistrovanjeServlet
 */
@WebServlet("/RegistrovanjeServlet")
public class RegistrovanjeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	StatelessBeanKolokvijumRemote bin;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrovanjeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ime=request.getParameter("ime");
		String prezime=request.getParameter("prezime");
		String liga=request.getParameter("liga");
		String tim=request.getParameter("tim");
		String email=request.getParameter("email");
		Kosarkasi k=new Kosarkasi();
		k.setIme(ime);
		k.setPrezime(prezime);
		k.setLiga(liga);
		k.setKlub(tim);
		k.setEmail(email);
		bin.unesiIgraca(k);
	}

}
