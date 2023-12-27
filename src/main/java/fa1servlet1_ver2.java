/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author aqimi
 */
public class fa1servlet1_ver2 extends HttpServlet {

    private String message;
    public void init() throws ServletException {
        // setup processing activity
        message = "System is starting...";
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try{
            //display init()
            System.out.println(message);
            //delay 10seconds
            Thread.sleep(10000);
            
            //launching system
            System.out.println("The system is running...");
            Runtime.getRuntime();
            
            //delay 10seconds
            System.out.println("Waiting after opening");
            Thread.sleep(10000);
            
            PrintWriter out = response.getWriter();
            out.println("You are not eligible to apply for the job at Mukah Cafeteria");
            
            //destroy
            destroy();
            System.out.println("The system is destroyed");
        }catch(Exception ex){
        }
        response.setHeader("Accept-Language", "Bahasa Inggeris");
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
