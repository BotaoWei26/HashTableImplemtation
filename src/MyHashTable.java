public class MyHashTable {
    HashSlot[] key_array = new HashSlot[100];

    public MyHashTable() {
        for (int i = 0; i < 100; ++i) {
            key_array[i] = new HashSlot();
        }
    }
    public int encode_key(String key){
        int encoded_key = 0;
        for (int i = 0; i < key.length(); ++i) {
            encoded_key += (int)key.charAt(i) * Math.pow(10, i*2);
        }
        encoded_key %= 100;
        return encoded_key;
    }

    public int set_key(String key, int value){
        int encoded_key = this.encode_key(key);
        return key_array[encoded_key].set_key(key, value);
    }

    public int find_key(String key){
        int encoded_key = this.encode_key(key);
        return key_array[encoded_key].find_key(key);
    }
}
