/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 813116
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String plus = request.getParameter("plus");
        String minus = request.getParameter("minus");
        String multiply = request.getParameter("multiply");
        String modulo = request.getParameter("modulo");
        
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        
        
            if (first == null || first.equals("") || second == null || second.equals("")) {
                request.setAttribute("wrong", "invalid");
            }
                else if (plus.equals("+") ) {
                     request.setAttribute("plus", Integer.parseInt(first) + Integer.parseInt(second));
                }
            
                else if ( minus.equals("-") ) {
                     request.setAttribute("minus", Integer.parseInt(first) - Integer.parseInt(second));
                }
            
                else if (multiply.equals("*") ) {
                     request.setAttribute("multiply", Integer.parseInt(first) * Integer.parseInt(second));
                }
                
                
            
                else {
                     request.setAttribute("modulo", Integer.parseInt(first) % Integer.parseInt(second));
                }
                
                        
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
                    
                
              
                }
                
            }
        
        
    

  



