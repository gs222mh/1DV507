package GS222MH_assign4.count_words;

import java.util.ArrayList;
import java.util.Iterator;


public class TreeWordSet implements WordSet {
    private BST root = null;
    private int sz = 0;

    @Override
    public void add(Word word) {
        if (root == null) {
            root = new BST(word);
            sz++;
        } else if (root.contains(word)) {
            return;
        } else
            root.add(word);
        sz++;
    }

    @Override
    public boolean contains(Word word) {
        if (root == null){
            return false;
        }
        else
        return root.contains(word);
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public Iterator<Word> iterator() {
        return new ListIterator();
    }

    //I get this informaion from both lecture and book 940
    private class ListIterator implements Iterator {
        private ArrayList<Word> list = new ArrayList<>();
        private int current = 0;

        public ListIterator() {
            print();
        }

        private void print() {
            print(root);
        }

        private void print(BST root){
            if (root == null) return;
            print(root.left);
            list.add(root.value);
            print(root.right);
        }

        public boolean hasNext() {
            return current < list.size();
        }

        public Word next() {
            return list.get(current++);
        }
    }

    @Override
    public String toString() {
        Iterator<Word> iterator = iterator();
        StringBuilder element = new StringBuilder();
        while (iterator.hasNext()){
            element.append(iterator.next().toString());
            element.append(" ");
        }
        return element.toString();
    }

    private class BST {
        Word value;
        BST left = null;
        BST right = null;

        BST(Word val) {
            value = val;
        }

        void add(Word n) { // recursive add
            if (n.compareTo(value) < 0) {
                // add to left branch
                if (left == null)
                    left = new BST(n);
                else
                    left.add(n); // Recursive call
            } else if (n.compareTo(value) > 0) {
                // add to right branch
                if (right == null)
                    right = new BST(n);
                else
                    right.add(n); // Recursive call
            }
        }

        boolean contains(Word n) { // recursive look−up
            if (n.compareTo(value) < 0) {
                // search left branch
                if (left == null)
                    return false;
                else
                    return left.contains(n);
            } else if (n.compareTo(value) > 0) {
                // search right branch
                if (right == null)
                    return false;
                else
                    return right.contains(n);
            }
            return true;
        }
    }
}
