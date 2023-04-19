package Model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * clase de hashingMap
 * @param <K> Tipo a almacenar
 * @param <V> Tipo a almacenar
 */
public class HashingBasedMap<K,V>implements Map{
    /**
     * instancia de hashmap
     */

    public HashMap<Object, Object> store;

    /**
     * Constructor de HashingMap
     */

    public HashingBasedMap(){
        store = new HashMap<>();
    }

    /**
     * Agrega un valor al hashmap
     * @param key tipo de llave
     * @param value tipo del valor
     */
    public void add(K key, V value) {
        store.put(key, value);

    }

    /**
     * verifica si se encuentra un valor
     * @param key valor a buscar
     * @return true o false dependiendo el resultado
     */

    public boolean buscar(K key) {
        return store.containsKey(key);
    }

    /**
     * retornar el largo
     * @return largo
     */
    public int size() {
        return store.size();
    }

    /**
     * verifica si es empty
     * @return
     */
    public boolean isEmpty() {
        return store.isEmpty();
    }

    /**
     * verifica si contiene una llave
     * @param key llave a buscar
     * @return true or false
     */
    public boolean containsKey(Object key) {
        return store.containsKey(key);
    }

    /**
     * verifica si contiene un valor
     * @param value valor a buscar
     * @return true or false
     */
    public boolean containsValue(Object value) {
        return store.containsValue(value);
    }

    /**
     * busca
     * @param key objeto a buscar
     * @return el objeto encontrado
     */
    public Object get(Object key) {
        return store.get(key);
    }

    /**
     * Put
     * @param key llave
     * @param value valor
     * @return encontrado
     */
    public Object put(Object key, Object value) {
        return store.put(key,value);
    }

    /**
     * Remove
     * @param key llave a remover
     * @return quitar el objeto
     */
    @Override
    public Object remove(Object key) {
        return store.remove(key);
    }

    /**
     * sustituyepor un mapa
     * @param m mapa a susstituir
     */
    @Override
    public void putAll(Map m) {
        store.putAll(m);

    }

    /**
     * limpia Hashing map
     */
    @Override
    public void clear() {
        store.clear();
    }

    /**
     * Regresa todas las llaves
     * @return las llaves
     */
    @Override
    public Set keySet() {
        return store.keySet();
    }

    /**
     * regresa los valores
     * @return valores
     */
    @Override
    public Collection values() {
        return store.values();
    }

    /**
     * Almacena, cambia
     * @return almacenar el entry
     */
    @Override
    public Set<Map.Entry<Object,Object>> entrySet() {
        return store.entrySet();
    }
}
