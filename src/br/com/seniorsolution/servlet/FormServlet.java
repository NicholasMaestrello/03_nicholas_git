package br.com.seniorsolution.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.seniorsolution.entidades.Dados;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		System.out.println(request.getParameter("nome"));
		try {
			Dados dados = new Dados();
			
			String nome = request.getParameter("nome");
			int idade = Integer.parseInt(request.getParameter("idade"));
			String curso = request.getParameter("curso");
			int semestre = Integer.parseInt(request.getParameter("semestre"));
			
			dados.setNome(nome);
			dados.setIdade(idade);
			dados.setCurso(curso);
			dados.setSemestre(semestre);
			
			request.setAttribute("mensagem", dados.getNome() + " - " + dados.getIdade() + " - " + dados.getCurso() + " - " + dados.getSemestre());
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
			request.setAttribute("mensagem", "Erro: " + e.getMessage());
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		System.out.println(request.getParameter("nome"));
		try {
			Dados dados = new Dados();
			
			String nome = request.getParameter("nome");
			int idade = Integer.parseInt(request.getParameter("idade"));
			String curso = request.getParameter("curso");
			int semestre = Integer.parseInt(request.getParameter("semestre"));
			
			dados.setNome(nome);
			dados.setIdade(idade);
			dados.setCurso(curso);
			dados.setSemestre(semestre);
			
			request.setAttribute("mensagem", dados.getNome() + " - " + dados.getIdade() + " - " + dados.getCurso() + " - " + dados.getSemestre());
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
			request.setAttribute("mensagem", "Erro: " + e.getMessage());
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

}
