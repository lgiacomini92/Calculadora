/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.calculadoratd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static br.edu.utfpr.calculadoratd.FuncoesCalculadora.dividir;
import static br.edu.utfpr.calculadoratd.FuncoesCalculadora.formataNumero;
import static br.edu.utfpr.calculadoratd.FuncoesCalculadora.multiplicar;
import static br.edu.utfpr.calculadoratd.FuncoesCalculadora.somar;
import static br.edu.utfpr.calculadoratd.FuncoesCalculadora.subtrair;
/**
 *
 * @author Leonardo Giacomini
 */
@WebServlet(name = "CalculadoraServlet", urlPatterns = {"/CalculadoraServlet"})
public class CalculadoraServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            double num1 = Double.parseDouble(request.getParameter("txtNum1"));
            double num2 = Double.parseDouble(request.getParameter("txtNum2"));
            String form = request.getParameter("htmlFormName");
            String operacao = "";
            
            switch(form){
            	case "frmCalculadoraCombo":
            		operacao = request.getParameter("selOperacao");
            		break;
            	case "frmCalculadoraRadio":
            		operacao = request.getParameter("rbOperacao");
            		break;
            	case "frmCalculadoraBotoes":
            		operacao = request.getParameter("auxOperacao");
            		break;
            }
            
            String resultado = "";
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultados do Cálculo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div id='divResultado'>");
            out.println("<table id='tbResultado'>");
            out.println("<tr><th colspan='2'>Resultado</th></tr>");
            out.println("<tr><td>");
            switch(operacao){
                case "Somar":
                    resultado = somar(num1, num2);
                    out.println(formataNumero(num1)+" + "+formataNumero(num2)+" = ");
                    break;
                case "Subtrair":
                    resultado = subtrair(num1, num2);
                    out.println(formataNumero(num1)+" - "+formataNumero(num2)+" = ");
                    break;
                case "Multiplicar":
                    resultado = multiplicar(num1, num2);
                    out.println(formataNumero(num1)+" * "+formataNumero(num2)+" = ");
                    break;
                case "Dividir":
                    resultado = dividir(num1, num2);
                    out.println(formataNumero(num1)+" / "+formataNumero(num2)+" = ");
                    break;
            }
            out.println("</td>");
            out.println("<td><span id='vlResultado'>"+resultado+"</span></td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("<a href='calculadora.html'>Voltar para menu de calculadoras</a>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
