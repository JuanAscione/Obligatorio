package TADs.Interfaces;

import TADs.Excepciones.KeyNotFound;

public interface HashTable<K, V>{

    void put(K key, V value);

    boolean contains(K key);

    void remove(K clave) throws KeyNotFound;
}
