public class Node {
    String key;
    int value;
    Node next;

    public Node(String key, int value){
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public int set_key(String key, int value) {
        if(this.key == key){
            this.value = value;
            return this.value;
        }
        if (next == null) {
            next = new Node(key, value);
            return next.value;
        }
        else {
            return next.set_key(key, value);
        }
    }

    public int find_key(String key){
        if(this.key == key){ return this.value; }
        if (next == null) {
            next = new Node(key, 0);
            return next.value;
        }
        else{
            return next.find_key(key);
        }
    }
}
