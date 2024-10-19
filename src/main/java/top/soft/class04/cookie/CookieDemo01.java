package top.soft.class04.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/CookieDemo01")
public class CookieDemo01 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        Cookie cookie = new Cookie("usename","zhangsan");
        response.addCookie(cookie);
        cookie.setMaxAge(60*60*24*7);
    }
}
/**
 * @description: TODO 
 * @author 86185
 * @date 2024/10/19 14:06
 *
 */