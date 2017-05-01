package com.sm.sdk.demo.servlets;

import com.sm.sdk.demo.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by huaoguo on 2017/5/1.
 */
@WebServlet("/login")
public class LoginServlet extends BaseServlet {
    private static final String[] avatars = new String[]{ "1.gif", "2.jpeg", "3.png" };
    private int id = 0;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        id += 1;

        if (name == null) {
            name = "游客" + id;
        }

        String avatar = avatars[(id - 1) % 3];

        User user = new User(id, name, avatar);

        req.getSession().setAttribute("user", user);
        resp.sendRedirect("/index.jsp");
    }

}
