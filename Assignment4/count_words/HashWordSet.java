package GS222MH_assign4.count_words;

import java.util.Iterator;

public class HashWordSet implements WordSet {
    private Node[] buckets = new Node[4];
    private int sz = 0;

    //From lecture
    @Override
    public void add(Word word) {
        int pos = getBucketNumber(word);
        Node node = buckets[pos];
        while (node != null) {
            if (contains(word))
                return;
            else
                node = node.next;
        }
        node = new Node(word);
        node.next = buckets[pos];
        buckets[pos] = node;
        //size++ every time we add an element
        sz++;
        if (sz == buckets.length) {
            reHash();
        }
    }

    //Do the samething as resize the stack
    public void reHash() {
        Node[] temp = buckets;
        buckets = new Node[buckets.length * 2];
        sz = 0;

        //Lecture
        for (Node e : temp) {
            if (e == null) continue;
            while (e != null) {
                add(e.value);
                e = e.next;
            }
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

    @Override
    public boolean contains(Word word) {
        int pos = getBucketNumber(word);
        Node node = buckets[pos];
        while (node != null) {
            if (node.value.equals(word))
                return true;
            else
                node = node.next;
        }
        return false;
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public Iterator<Word> iterator() {
         return new ListIterator();
    }

    public class ListIterator implements Iterator<Word> {
        private Node[] show = new Node[sz];
        int x1 = 0;
        int x2 = 0;

        @Override
        public boolean hasNext() {
            return show.length > x1;
        }

        @Override
        public Word next() {
            return show[x1++].value;
        }

        public ListIterator() {
            for (Node bucket : buckets) {
                Node node = bucket;
                while (node != null) {
                    show[x2] = node;
                    node = node.next;
                    x2++;
                }
            }
        }
    }


    public int getBucketNumber(Word str) {
        int hc = str.hashCode();
        return hc % buckets.length;
    }

    private class Node {
        Word value;
        Node next = null;

        public Node(Word str) {
            value = str;
        }

        public String toString() {
            return value.toString();
        }
    }
}

