package com.sm.sdk.demo.servlets;

import com.sm.sdk.demo.models.File;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by huaoguo on 2017/5/1.
 */
@WebServlet("/store")
public class StoreFileServlet extends BaseServlet {
    private List<File> files = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        getServletContext().setAttribute("files", files);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String guid = req.getParameter("guid");
        String name = req.getParameter("name");
        String type = req.getParameter("type");
        String user = req.getParameter("user");

        File file = new File(guid, name, type, user);
        files.add(file);
    }

}
