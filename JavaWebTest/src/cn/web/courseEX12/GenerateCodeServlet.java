package cn.web.courseEX12;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet("/GenerateCodeServlet")
public class GenerateCodeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int width=80;
        int height=40;
        HttpSession session=req.getSession();

        BufferedImage image=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        Graphics g=image.getGraphics();

        String randStr=getRandNum();
        session.setAttribute("randStr",randStr);

        g.setColor(Color.WHITE);
        g.setFont(new Font("",Font.PLAIN,20));
        g.drawString(randStr,10,17);

        for(int i=0;i<100;i++){
            int x=getIntRandNum(width);
            int y=getIntRandNum(height);
            g.drawOval(x,y,1,1);
        }
        ImageIO.write(image,"jpg",resp.getOutputStream());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    private String getRandNum(){
        Random rnd=new Random();
        int randNum=rnd.nextInt(8999)+1000;
        String randStr=String.valueOf(randNum);
        return randStr;
    }

    private int getIntRandNum(int num){
        Random rnd=new Random();
        return rnd.nextInt(num);
    }
}
