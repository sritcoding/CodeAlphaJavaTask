class Room{
    int length,breadth;
    void roomarea(int x,int y){
        length=x;
        breadth=y;
    }
    void roomarea(int x){
        length=breadth=x;
        
    }
    int area(){
        return(length*breadth);
    }
}
public class overloadingg {
    public static void main(String[] args) {
        Room r1=new Room();
r1.roomarea(10, 20);
int area1=r1.area();
System.out.println("area="+area1);
    }
}
