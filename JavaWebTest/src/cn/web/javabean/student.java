package cn.web.javabean;

public class student {
    private String id;
    private String username;
    private String age;
    private String sex;
    private String level;

    public String getId(){
        return this.id;
    }

    public String getUsername(){
        return this.username;
    }

    public String getAge(){
        return this.age;
    }

    public String getSex(){
        return this.sex;
    }

    public String getLevel(){
        return this.level;
    }

    public void setId(String id){
        this.id=id;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public void setAge(String age){
        this.age=age;
    }

    public void setSex(String sex){
        this.sex=sex;
    }

    public void setLevel(String level){
        this.level=level;
    }
}
