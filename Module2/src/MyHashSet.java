import java.util.HashMap;
import java.util.Map;

class MyHashSet<T> {
    private Map<T, Object> map = new HashMap<>();
    private static final Object PRESENT = new Object();

    public void insert(T element) {
        map.put(element, PRESENT);
    }

    public void remove(T element) {
        map.remove(element);
    }

    public boolean containsElement(T element) {
        return map.containsKey(element);
    }

    public int size() {
        return map.size();
    }

    public boolean contains(Object o) {
        return map.containsKey(o);
    }
}
