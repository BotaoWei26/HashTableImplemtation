public class HashSlot {
    Node next;

    public HashSlot(){
        this.next = null;
    }

    public int set_key(String key, int value) {
        if (next == null) {
            next = new Node(key, value);
            return next.value;
        }
        else {
            return next.set_key(key, value);
        }
    }

    public int find_key(String key){
        if (next == null) {
            next = new Node(key, 0);
            return next.value;
        }
        else{
            return next.find_key(key);
        }
    }
}
