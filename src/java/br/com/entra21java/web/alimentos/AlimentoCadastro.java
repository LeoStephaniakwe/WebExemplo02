package br.com.entra21java.web.alimentos;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Alunos
 */
@WebServlet(urlPatterns = "/alimentos/cadastro")
public class AlimentoCadastro extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Alimentos - Cadastro</title>");
        out.println("<link rel='stylesheet' type='text/css' href='/WebExemplo02/resources/css/bootstrap/css/bootstrap.css'>");
        out.println("<link rel='stylesheet' href='https://img.stpu.com.br/?img=https://s3.amazonaws.com/pu-mgr/default/a0RG000000jZwGHMA0/566f0a09e4b0c7d7284bd2d7.jpg&w=620&h=400'/>");
        out.println("<link rel='stylesheet' type='text/css' href='/WebExemplo02/resources/css/alimentos-index.css'>");
        out.println("<script src='/WebExemplo02/alimentos-cadastro.js'></script>");
        out.println("<link rel='icon' href ='http://www.oknoticias.com.br/wp-content/uploads/2014/10/Lanches.png'/>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='my-navbar'>");
        out.println("<a href='/WebExemplo02/'>Home</a>");
        out.println("<div class='my-dropdown'>");
        out.println("<button class='my-dropbtn'>Alimentos");
        out.println("<i class='fa fa-caret-down'></i>");
        out.println("</button>");
        out.println("<div class='my-dropdown-content'>");
        out.println("<a href='/WebExemplo02/alimentos'>Lista</a>");
        out.println("<a href='/WebExemplo02/alimentos/cadastro'>Cadastro</a>");
        out.println("</div>");
        out.println("</div> ");
        out.println("</div>");
        
        out.println("<div class='container-fluid'>");
        out.println("<form action='/WebExemplo02/alimentos/store' method='POST' onSubmit='validarFormulario()'>");
        out.println("<div id='div-campo-nome' class='form-group ml-md-4 mr-md-4 mt-md-4'>");
        out.println("<label for='campo-nome'>Nome<span class='text-danger font-weight-bold'>*</span></label>");
        out.println("<input type='text' id='campo-nome' name='nome' class='form-control' required='required onfocus='validarCampoNome()>");
        out.println("</div>");
        out.println("<div id='campo-quantidade' class='form-group ml-md-4 mr-md-4 mt-md-4'>");
        out.println("<label for='campo-quantidade'>Quantidade<span class='text-danger font-weight-bold'>*</span></label>");
        out.println("<input type='text' id='campo-quantidade' name='quantidade' class='form-control' required='required'>");
        out.println("</div>");
        out.println("<div class='form-group ml-md-4 mr-md-4 mt-md-4'>");
        out.println("<label for='campo-preco'>Preço<span class='text-danger font-weight-bold'>*</span></label>");
        out.println("<input type='text' id='campo-preco' name='preco' class='form-control' required='required'>");
        out.println("</div>");
        out.println("<div class='form-group ml-md-4 mr-md-4 mt-md-4'>");
        out.println("<label for='campo-descricao'>Descrição</label>");
        out.println("<textarea id='campo-descricao' name='descricao' class='form-control' required='required'></textarea>");
        out.println("</div>"); 
        out.println("<input type='submit' value='Cadastrar' class='form-group ml-md-4 mr-md-4 mt-md-4'>");
        out.println("</form>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
    
    
}
