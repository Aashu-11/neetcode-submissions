
class MyHashMap {

    List<List<Integer>> list;

    public MyHashMap() {
        list = new ArrayList<>();
    }

    public void put(int key, int value) {
        for (List<Integer> pair : list) {
            if (pair.get(0) == key) {
                pair.set(1, value);
                return;
            }
        }

        List<Integer> pair = new ArrayList<>();
        pair.add(key);
        pair.add(value);
        list.add(pair);
    }

    public int get(int key) {
        for (List<Integer> pair : list) {
            if (pair.get(0) == key)
                return pair.get(1);
        }
        return -1;
    }

    public void remove(int key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).get(0) == key) {
                list.remove(i);
                return;
            }
        }
    }
}