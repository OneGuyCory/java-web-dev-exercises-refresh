package exercises.chapterfour;

public class HelloWorld {

    public String message = "Hello World";

    public void sayHello() {

        String message = "Goodbye World";

        //prints goodbye world as its the variable in the current method
        System.out.println(message);

        //prints hello world as 'this' refers to the variable in the object as a whole
        System.out.println(this.message);

    }
}
