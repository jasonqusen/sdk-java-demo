package com.sm.sdk.demo.servlets;

import com.google.gson.Gson;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by huaoguo on 2017/4/30.
 */
public class BaseServlet extends HttpServlet{

    protected void json(Object data, HttpServletResponse response) {
        try {
            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");

            Gson gson = new Gson();
            String json = gson.toJson(data);
            response.getWriter().print(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
