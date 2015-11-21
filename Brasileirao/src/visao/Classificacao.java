package visao;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controle.ListaTimes;
import modelo.Tabela;

public class Classificacao<T> extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Classificacao() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out;
		response.setContentType("text/html");
		out = response.getWriter();
		
		
		Tabela time1 = new Tabela("Flamengo", 44, 32, -5);
		Tabela time2 = new Tabela("Fluminense", 40, 32, -9);
		Tabela time3 = new Tabela("Vasco", 30, 32, -29);
		Tabela time4 = new Tabela("Atletico-MG", 62, 32, 20);
		Tabela time5 = new Tabela("Corinthians", 70, 32, 33);
		Tabela time6 = new Tabela("Gremio", 56, 32, 16);
		Tabela time7 = new Tabela("Santos", 50, 32, 15);
		Tabela time8 = new Tabela("Palmeiras", 48, 32, 13);
		Tabela time9 = new Tabela("Sport", 49, 32, 17);
		Tabela time10 = new Tabela("Internacional", 50, 32, -1);
		Tabela time11 = new Tabela("São Paulo", 50, 32, 5);
		Tabela time12 = new Tabela("Cruzeiro", 44, 32, 4);
		Tabela time13 = new Tabela("Ponte Preta", 47, 32, -5);
		Tabela time14 = new Tabela("Atletico-PR", 42, 32, -5);
		Tabela time15 = new Tabela("Chapecoense", 39, 32, -7);
		Tabela time16 = new Tabela("Figueirense", 35, 32, -14);
		Tabela time17 = new Tabela("Avaí", 34, 32, -21);
		Tabela time18 = new Tabela("Coritiba", 33, 32, -15);
		Tabela time19 = new Tabela("Joinvile", 30, 32, -14);
		Tabela time20 = new Tabela("Goias", 31, 32, -7);
		
		ListaTimes lt = new ListaTimes();
		lt.addLista(time1);
		lt.addLista(time2);
		lt.addLista(time3);
		lt.addLista(time4);
		lt.addLista(time5);
		lt.addLista(time6);
		lt.addLista(time7);
		lt.addLista(time8);
		lt.addLista(time9);
		lt.addLista(time10);
		lt.addLista(time11);
		lt.addLista(time12);
		lt.addLista(time13);
		lt.addLista(time14);
		lt.addLista(time15);
		lt.addLista(time16);
		lt.addLista(time17);
		lt.addLista(time18);
		lt.addLista(time19);
		lt.addLista(time20);
		
		
		out.println("<HTML><HEAD><TITLE>");
		out.println("Tabela");
		out.println("</TITLE></HEAD><BODY>");
		out.println("<H1>Classificação</H1>");
		out.println("<TABLE BORDER='1'><TR>");
		out.println("<TD COLSPAN='2' ALIGN='CENTER'>TIMES</TD><TD>PONTOS</TD><TD>JOGOS</TD><TD>SALDO</TD>");
		/*
		for(int i=0;i<lt.getLista().size();i++){
			out.print("<TR><TD>"+lt.getLista().get(i).getNome()+"</TD>");
			out.print("<TD>"+lt.getLista().get(i).getSaldo()+"</TD>");
			out.print("<TD>"+lt.getLista().get(i).getPontos()+"</TD></TR>");
		}
		*/
		int i = 0;
		for(Tabela tb : lt.getLista()){
			i++;
			out.print("<TR><TD ALIGN='CENTER'>"+i+"</TD><TD>"+tb.getNome()+"</TD>");
			out.print("<TD  ALIGN='CENTER'>"+tb.getPontos()+"</TD>");
			out.print("<TD  ALIGN='CENTER'>"+tb.getJogos()+"</TD>");
			out.print("<TD  ALIGN='CENTER'>"+tb.getSaldo()+"</TD></TR>");
		}
		
		out.println("</TR></TABLE>");
		out.println();
		out.println("</BODY></HTML>");
		out.close();
	}
	
}
