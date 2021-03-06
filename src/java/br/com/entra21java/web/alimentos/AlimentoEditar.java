package br.com.entra21java.web.alimentos;

import br.com.entra21java.bean.AlimentoBean;
import br.com.entra21java.dao.AlimentoDAO;
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
@WebServlet(urlPatterns = "/alimentos/editar")
public class AlimentoEditar extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        int id = Integer.parseInt(req.getParameter("id"));
        AlimentoBean alimento = new AlimentoDAO().obterPeloId(id);
        
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Alimentos - Editar</title>");
        out.println("<link rel='stylesheet' type='text/css' href='/WebExemplo02/resources/css/bootstrap/css/bootstrap.css'>");
        out.println("<link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.2.0/css/all.css' integrity='sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ' crossorigin='anonymous'/>");
        out.println("<link rel='stylesheet' type='text/css' href='/WebExemplo02/resources/css/alimentos-index.css'>");
        out.println("<link rel='icon' href ='http://www.oknoticias.com.br/wp-content/uploads/2014/10/Lanches.png'/>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='navbar'>");
        out.println("<a href='/WebExemplo02/'>Home</a>");
        out.println("<div class='dropdown'>");
        out.println("<button class='dropbtn'>Alimentos ");
        out.println("<i class='fa fa-caret-down'></i>");
        out.println("</button>");
        out.println("<div class='dropdown-content'>");
        out.println("<a href='/WebExemplo02/alimentos'>Lista</a>");
        out.println("<a href='/WebExemplo02/alimentos/cadastro'>Cadastro</a>");
        out.println("</div>");
        out.println("</div> ");
        out.println("</div>");
        out.println("<form action='/WebExemplo02/alimentos/update' method='post'>");
        out.println("<input type='hidden' name='id' value='"+alimento.getId()+"'>");
        out.println("<div>");
        out.println("<label for='campo-nome'>Nome</label>");
        out.println("<input type='text' id='campo-nome' name='nome' value='"+alimento.getNome()+"'>");
        out.println("</div>");
        out.println("<div>");
        out.println("<label for='campo-quantidade'>Quantidade</label>");
        out.println("<input type='text' id='campo-quantidade' name='quantidade' value='"+alimento.getQuantidade()+"'>");
        out.println("</div>");
        out.println("<div>");
        out.println("<label for='campo-preco'>Preço</label>");
        out.println("<input type='text' id='campo-preco' name='preco' value='"+alimento.getPreco()+"'>");
        out.println("</div>");
        out.println("<div>");
        out.println("<label for='campo-descricao'>Descrição</label>");
        out.println("<textarea name='descricao' id='campo-descricao'>"+alimento.getDescricao()+"</textarea>");
        out.println("</div>");
        out.println("<input type='submit' value='Cadastrar'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }
    
}
