package HybridInheritanceExample;


class Parent {
 Parent() {
     System.out.println("Parent constructor called.");
 }
}


interface AnotherParent {
 void display();
}


class Child extends Parent implements AnotherParent {Child() {

     System.out.println("Child constructor called.");
 }

 @Override
 public void display() {
     System.out.println("Display method from AnotherParent implemented in Child.");
 }
}


public class HybridInheritance {
 public static void main(String[] args) {
     Child child = new Child(); 
     child.display(); 
 }
}

