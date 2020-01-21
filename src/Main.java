public class Main {
    public static void main(String[] args) throws Exception{
        MyHashTable table = new MyHashTable();
        System.out.println(table.set_key("key", 123456));
        System.out.println(table.find_key("key"));
        System.out.println(table.set_key("key", 654321));
        System.out.println(table.find_key("key"));
    }
}
