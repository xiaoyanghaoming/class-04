package top.soft.class04.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet("/sessionDemo02")
public class SessionDemo02 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        HttpSession session = request.getSession();
        Object username = session.getAttribute("username");
        System.out.println(username);
    }
}
/**
 * @description: TODO
 * @author 86185
 * @date 2024/10/19 14:51
 */