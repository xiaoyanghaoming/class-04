package top.soft.class04.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/CookieDemo02")
public class CookieDemo02 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        Cookie[] cookies = request.getCookies();
        for(Cookie cookie:cookies){
            String name = cookie.getName();
            if("Username".equals(name)){
                System.out.println("结果"+cookie.getValue());
                break;
            }
        }
    }
}
/**
 * @description: TODO
 * @author 86185
 * @date 2024/10/19 14:02
 */