import java.util.LinkedList;

public class HashTable {
    private class Entry {
        int key;
        String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value) {
        Entry entry = getEntry(key);
        if (entry != null) {
            entry.value = value;
            return;
        }
        int index = hash(key);
        LinkedList bucket = entries[index];
        if (bucket == null) {
            bucket = new LinkedList<>();
        }
        bucket.add(new Entry(key, value));
        entries[index] = bucket;
    }

    public void remove(int key) {
        int index = hash(key);
        for (var entry : entries[index]) {
            if (entry.key == key) {
                entries[index].remove(entry);
            }
        }
    }

    private Entry getEntry(int key) {
        int index = hash(key);
        LinkedList bucket = entries[index];
        if (bucket != null) {
            for (var entry : entries[index]) {
                if (entry.key == key) {
                    return entry;
                }
            }
        }
        return null;
    }

    public String get(int key) {
        Entry entry = getEntry(key);
        return entry == null ? null : entry.value;
    }

    private int hash(int key) {
        return key % entries.length;
    }
}
