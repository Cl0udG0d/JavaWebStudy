package cn.web.shopping;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet("/servletShopping")
public class servletShopping extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        HttpSession session=req.getSession();
        if(session.getAttribute("shoppingcart")==null){
            shoppingcart newShoppingCart=new shoppingcart();
            session.setAttribute("shoppingcart",newShoppingCart);
        }

        shoppingcart nowShoppingCart= (shoppingcart) session.getAttribute("shoppingcart");
        String[] selectedItems=req.getParameterValues("selectedItems");

        if(selectedItems.length!=0){
            for(int i=0;i<selectedItems.length;i++){
                String bookname=selectedItems[i];
                nowShoppingCart.addItem(bookname);
            }
        }
        session.setAttribute("shoppingcart",nowShoppingCart);
        resp.sendRedirect("/Unit8/shopping.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
