abstract class Writer /*Abstract class*/ {
    public abstract void write();
}
class Pencil extends Writer /* For class --> class we use extends*/{
    public void write(){
        System.out.println("I'm writing with pen");
    }
}
class Pen extends Writer{
    public void write(){
        System.out.println("I'm writing with pen");
    }
}
class Author {
    public void whatKit(Writer x){
        x.write();
    }
}
public class Testabstractclass {

    public static void main(String [] args){

        Author Ajay = new Author();
        Writer p = new Pen();/* Writer Super class is used as reference and object instantiated with sub class*/
        Writer pc = new Pencil();
        Ajay.whatKit(p);
    }
}
