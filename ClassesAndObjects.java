

public class ClassesAndObjects {
    public static void main(String[] args){
        //**Pen class */
        // Pen p1 = new Pen();
        // p1.tip = 7;
        // p1.color = "Blue";
        // System.out.println(p1.tip);
        // System.out.println(p1.color);

        //**Bank class */
        Bank c1 = new Bank();
        c1.setName("Sandesh");
        c1.setPassword("abcdefg");

        //here we cant use the c1.name = "Sandesh" because the access is private

        System.out.println(c1.getName());
        System.out.println(c1.getPassword());

    }
}


//This class shows how can we easily change the properties associated with the data.
class Pen{
    String color;
    int tip;
    void setColor(String cName){
        this.color = cName;
    }
}

class Bank{
    private String name;
    private String password;
    void setName(String name){
        this.name = name;
    }

    void setPassword(String pwd){
        this.password = pwd;
    }

    String getName(){
        return this.name;
    }

    String getPassword(){
        return this.password;
    }
}