package GS222MH_assign1.Stack;

public class StackMain {
    public static void main(String[] args) {

        //Try, so maybe it could be an exception here.
        try {

            //Send values to StackClass.
            StackClass test = new StackClass();
            test.push("1");
            test.push("2");
            test.push("3");
            test.push("4");




            //Print out the methods from StackClass.
            System.out.println("Array: " + test.toString());
            System.out.println("Size/Length: " + test.size());
            System.out.println("Empty: " + test.isEmpty());
            System.out.println("Array before pop: " + test.toString());
            System.out.println("Pop: " + test.pop());
            System.out.println("Array after pop: " + test.toString());
            System.out.println("Pop: " + test.pop());
            System.out.println("Array after pop: " + test.toString());
            System.out.println("Peek: " + test.peek());
            System.out.println("Array: " + test.toString());


        }
        //If there is an exception print out the message.
        catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }


    }
}
