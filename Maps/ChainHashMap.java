package Maps;

import java.util.ArrayList;
import PriorityQueues.Entry;

public class ChainHashMap<K,V> extends AbstractHashMap<K,V> {
    private UnsortedTableMap<K,V>[] table;
    public ChainHashMap(){super();}
    public ChainHashMap(int cap){super(cap);}
    public ChainHashMap(int cap, int p){super(cap, p);}

    public void createTable(){
        table = (UnsortedTableMap<K,V>[]) new UnsortedTableMap[capacity];
    }

    protected V bucketGet(int h, K k){
        UnsortedTableMap<K,V> bucket = table[h];
        if (bucket == null) return null;
        return bucket.get(k);
    }

    protected V bucketPut(int h, K k, V v){
        UnsortedTableMap<K,V> bucket = table[h];
        if (bucket == null)
            bucket = table[h] = new UnsortedTableMap<>();
        int oldSize = bucket.size();
        V answer = bucket.put(k, v);
        n += (bucket.size() - oldSize);
        return answer;
    }

    protected V bucketRemove(int h, K k){
        UnsortedTableMap<K,V> bucket = table[h];
        if (bucket == null) return null;
        int oldSize = bucket.size();
        V answer = bucket.remove(k);
        n -= (oldSize - bucket.size());
        return answer;
    }
    
    public boolean isEmpty() {
        return size() == 0;
    }
    
    public Iterable<Entry<K, V>> entrySet() {
        ArrayList<Entry<K,V>> buffer = new ArrayList<>();
        for (int h = 0; h < capacity; h++)
            if (table[h] != null)
                for (Entry<K,V> e : table[h].entrySet())
                    buffer.add(e);
        return buffer;
    }
}
