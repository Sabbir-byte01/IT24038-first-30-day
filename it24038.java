class vehicle{

private String brand;
private String color;

//constractor
public vehicle(String brand,String color){
 this.brand = brand;
 this.color = color;
}
//method
 public void Drive(){
    System.out.println("Brand = " + brand);
    System.out.println("Color = " + color);
 }
}
public class it24038{
 //Main class
 public static void main(String[] args){
 
 //command line input
 for(int i=0; i<args.length; i++){
 vehicle v = new vehicle(args[i],args[i++]);

 v.Drive();
 }
 }
}