// uday sir is practisedc
public class Mobile2 {

 String brand;
String modelNo;
 float cast;

 Mobile2(String brand,String modelNo,float cast){
  this.brand=brand;
  this.modelNo=modelNo;
  this.cast=cast;
 }
 public static void main(String[] args){

  
  Mobile2 M1=new Mobile2("samsong","M40",28000);
  Mobile2 M2=new Mobile2("vivo","T2x 5G",102000);

System.out.println("mobile detel "+M1.brand+" "+M1.modelNo+" "+M1.cast);
System.out.println("mobile detel "+M2.brand+" "+M2.modelNo+" "+M2.cast);



 }

}