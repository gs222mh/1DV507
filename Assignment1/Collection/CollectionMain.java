package GS222MH_assign1.Collection;

public class CollectionMain {
    public static void main(String[] args) {
        final String RED = "\u001B[31m";
        final String RESET = "\033[0m";  // Text Reset


        ArrayIntStack arrStack = new ArrayIntStack();

        //As we know the array has 8 pos. So we push 16 to test push() and reSize().
        arrStack.push(1);
        arrStack.push(2);
        arrStack.push(3);
        arrStack.push(4);
        arrStack.push(5);
        arrStack.push(6);
        arrStack.push(7);
        arrStack.push(8);
        arrStack.push(9);
        arrStack.push(10);
        arrStack.push(11);
        arrStack.push(12);
        arrStack.push(13);
        arrStack.push(14);
        arrStack.push(15);
        arrStack.push(16);


        System.out.println(RED + ">>>>>>>>>>>INT STACK<<<<<<<<<<<" + RESET);
        System.out.println("Array/before pop: " + arrStack.toString());
        System.out.println("Empty: " + arrStack.isEmpty());
        System.out.println("Elements/size: " + arrStack.size());
        System.out.println("Pop: " + arrStack.pop());
        System.out.println("Peek: " + arrStack.peek());
        System.out.println("Array/after pop: " + arrStack.toString());
        System.out.println("Pop: " + arrStack.pop());
        System.out.println("Peek: " + arrStack.peek());
        System.out.println("Array/after pop: " + arrStack.toString());
        System.out.println("Peek: " + arrStack.peek());


        ArrayIntList arrList = new ArrayIntList();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);
        arrList.add(6);
        arrList.add(7);
        arrList.add(8);
        arrList.add(9);
        arrList.add(10);
        System.out.println(RED + ">>>>>>>>>>>INT LIST<<<<<<<<<<<" + RESET);
        System.out.println("Array: " + arrList.toString());
        System.out.println("Empty: " + arrList.isEmpty());
        //in this case num 5 should remove.
        arrList.remove(4);
        System.out.println("Array after remove: " + arrList.toString());
        System.out.println("Elements/size: " + arrList.size());
        System.out.println("Get (at pos 1): " + arrList.get(1));
        System.out.println("Index of: " + arrList.indexOf(8));
        //in this case num 5 should back.
        arrList.addAt(5, 5);
        System.out.println("Array after add: " + arrList.toString());


    }
}
