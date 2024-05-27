class Rectangle{
    int length;
    int breadth;
    Rectangle(int x,int y)//constructor mathod
    {
        length=x;
        breadth=y;
    }
    int rectarea(){
        return(length*breadth);

    }
}
public class constructorr {
public static void main(String[] args) {
    Rectangle rect1 = new Rectangle(20,20);
int area1=rect1.rectarea();
System.out.println("area1="+area1);
    
}
    
}
