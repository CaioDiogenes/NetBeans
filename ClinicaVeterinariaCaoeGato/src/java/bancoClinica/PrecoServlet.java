package bancoClinica;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PrecoServlet", urlPatterns = {"/PrecoServlet"})
public class PrecoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Servicos c1 = new Servicos();
        c1.nome = request.getParameter("nome");
        c1.preco = request.getParameter("preco");
        String inserirServicos = "INSERT INTO SERVICOS (NOME, PRECO)"
                + "VALUES('" + c1.nome + "', '" + c1.preco + "');";
        String urlbanco = "jdbc:mysql://localhost/banco";
        String listarServicos = "Select * from cliente;";
        java.sql.Connection banco;
        java.sql.ResultSet listagem;
        int n=0;
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>"
                    + "<html>\n"
                    + "    <head>\n"
                    + "        <title>Clinica Veterinaria Cao e Gato</title>\n"
                    + "        <meta charset=\"UTF-8\" />\n"
                    + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
            out.println("<style type=\"text/css\">");
            out.println("@import url(\"estilo.css\");");
            out.println("@import url(\"css/bootstrap.css\");");
            out.println("@import url(\"css/bootstrap-theme.css\");");
            out.println("</style>");
            out.println(" </head>\n"
                    + "    <body>\n"
                    + "        <div id=\"tudo\">\n"
                    + "            <div id=\"topo\">\n"
                    + "                <div class=\"cabecalho row\">\n"
                    + "                    <div class=\"col-md-1 col-md-offset-2 item-menu\"><a href=\"../index.html\">Home</a></div>\n"
                    + "                    <div class=\"col-md-1  item-menu\">\n"
                    + "                        <div class=\"dropdown\">\n"
                    + "                            <div class=\"dropbtn\"><a>Serviços</a></div>\n"
                    + "                            <div class=\"dropdown-content\">\n"
                    + "                                <a href=\"servicos/consultas.html\">Consultas</a>\n"
                    + "                                <a href=\"servicos/cirurgias.html\">Cirurgias</a>\n"
                    + "                                <a href=\"servicos/vacinas.html\">Vacinas</a>\n"
                    + "                                <a href=\"servicos/exames.html\">Exames</a>\n"
                    + "                                <a href=\"servicos/medicamentos.html\">Medicamentos</a>\n"
                    + "                                <a href=\"servicos/raio-x.html\">Raio-x</a>\n"
                    + "                                <a href=\"servicos/internacao.html\">Internação</a>                                \n"
                    + "                                <a href=\"servicos/hospedagem.html\">Hospedagem</a>\n"
                    + "                                <a href=\"servicos/banhoetosa.html\">Banho e Tosa</a>\n"
                    + "                                <a href=\"servicos/tabeladeprecos.html\">Preços</a>\n"
                    + "                            </div>\n"
                    + "                        </div>\n"
                    + "                    </div>\n"
                    + "                    <div class=\"col-md-1  item-menu\"><a href=\"../galeria.html\">Galeria</a></div>\n"
                    + "                    <div class=\"col-md-2\"><img class=\"logo\" src=\"imagens/Logo.png\" alt=\"logo\"/></div>\n"
                    + "                    <div class=\"col-md-1  item-menu\"><a href=\"../sobre.html\">Sobre</a></div>\n"
                    + "                    <div class=\"col-md-1  item-menu\"><a href=\"../equipe.html\">Equipe</a></div>\n"
                    + "                    <div class=\"col-md-1  item-menu\"><a href=\"../contato.html\">Contato</a></div>\n"
                    + "                </div> \n"
                    + "            </div> \n"
                    + "            <div id=\"conteudo\">\n"
                    + "<div class=\"thumbnail col-md-8 col-md-offset-2\">");
            for (int i = 0; i < 30; i++) {

                out.println("<div class=\"thumbnail col-md-6\">"
                        + "<p>Beatriz Vasconcelos</p>"
                        + "<p>Caio Corchado</p>"
                        + "<p>João Lima<p>"
                        + "</div>");
            }
            out.println("</div>"
                    + " <div class=\"clear\"></div> \n"
                    + "</div>\n"
                    + "<footer>"
                    + "            <div id=\"rodape\">\n"
                    + "                <img class=\"imagem1rodape\" src=\"imagens/Dog.png\" alt=\"1\">\n"
                    + "                <div id=\"infos\">\n"
                    + "                    <div class=\"medium-6 large-3 columns\"> \n"
                    + "                        <div class=\"pergunta\">  Endereço: </div>\n"
                    + "                        <br>\n"
                    + "                        <div class=\"texto\"> Rua Sinharinha Frota, 1630, Buscardi, Matão/SP</div>\n"
                    + "                    </div>\n"
                    + "                    <div class=\"medium-6 large-3 columns\"> \n"
                    + "                        <div class=\"pergunta\">  Tel: </div>\n"
                    + "                        <br>\n"
                    + "                        <div class=\"texto\"> Clínica Veterinária:\n"
                    + "                            <br>\n"
                    + "                            (16)3394-4241</div>\n"
                    + "                    </div>\n"
                    + "                    <div class=\"medium-6 large-3 columns\"> \n"
                    + "                        <div class=\"pergunta\"> \n"
                    + "                            Horários Disponíveis : </div>\n"
                    + "                        <br>\n"
                    + "                        <div class=\"texto\"> \n"
                    + "                            Segunda à Sexta: 09:00 às 18:00 </div>\n"
                    + "                        <div class=\"texto\"> De sábado: 09:00 às 12:00</div>\n"
                    + "                    </div>\n"
                    + "                    <div class=\"medium-6 large-3 columns\"> \n"
                    + "                        <div class=\"pergunta\">  \n"
                    + "                            <span class=\"glyphicon glyphicon-thumbs-up\"></span>\n"
                    + "                            Rede Social: \n"
                    + "                        </div>\n"
                    + "                        <br>\n"
                    + "                        <div class=\"texto\"> Facebook: \n"
                    + "                            <br>\n"
                    + "                            Alessandra Varella \n"
                    + "                        </div>\n"
                    + "                    </div>  \n"
                    + "                </div>\n"
                    + "                <img class=\"imagem2rodape\" src=\"imagens/Gato.png\" alt=\"1\">\n"
                    + "            </div>\n"
                    + "        </div>\n"
                    + "</footer>"
                    + "    </body>\n"
                    + "</html>");
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                banco = DriverManager.getConnection(urlbanco, "root", "");
            } catch (SQLException erro) {
                out.println("<p>" + erro + "</p>");
                throw new RuntimeException(erro);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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
