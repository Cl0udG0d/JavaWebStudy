package cn.web.shopping;

import java.util.HashMap;
import java.util.Map;

//购物车 类
public class shoppingcart {
    public Map<String,Integer> items = new HashMap<String,Integer>();

    public void addBookNum(String bookname,Integer number){
        items.put(bookname,number);
        System.out.println("添加成功 "+bookname+" 数量 "+number);
    }
    public void addItem(String bookname){
        if(items.containsKey(bookname)){
            Integer tempNumber=items.get(bookname);
            tempNumber+=1;
            items.put(bookname,tempNumber);
        }else{
            items.put(bookname,1);
        }
    }

    public Integer getNumber(String bookname){
        return items.get(bookname);
    }

    public Map getItems(){
        return items;
    }
}
