/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import models.AccountService; //Not sure why this isnt working

/**
 *
 * @author mdkul
 */
public class LoginServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String logout = request.getParameter("logout");
        
        if(logout != null){
            session.invalidate();
            String loggedOut = "You have seccessfully logged out.";
            request.setAttribute("message", loggedOut);
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
        else{
        //if the session exitst then you need to redirect to the homepage
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String uname = request.getParameter("username");
        String passw = request.getParameter("password");
        
        if(uname != "" && passw != ""){
            //TODO has to validate somehow
            //if(AccountService.login(uname, passw) = null){
                String error = "Invalid login";
                request.setAttribute("message", error);
                getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            }
            else{
                
            }
            
            
            
            
            getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
            
        }
    }
//}
