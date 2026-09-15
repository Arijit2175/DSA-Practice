class Node {
    int key;
    int val;
    int freq;
    Node prev;
    Node next;
    Node(int key, int val) {
        this.key = key;
        this.val = val;
        this.freq = 1;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;
    DoublyLinkedList() {
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }
    void addFirst(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
    void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    } 
    Node removeLast() {
        if(head.next == tail) return null;
        Node node = tail.prev;
        remove(node);
        return node;
    }
}

class LFUCache {

    HashMap<Integer, Node> map;
    HashMap<Integer, DoublyLinkedList> freqMap;
    int capacity;
    int size;
    int minFreq;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.minFreq = 0;
        map = new HashMap<>();
        freqMap = new HashMap<>();
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node node = map.get(key);
        int freq = node.freq;
        freqMap.get(freq).remove(node);
        node.freq++;
        if(!freqMap.containsKey(node.freq)) freqMap.put(node.freq, new DoublyLinkedList());
        freqMap.get(node.freq).addFirst(node);
        if(freq == minFreq && freqMap.get(freq).head.next == freqMap.get(freq).tail) minFreq++;
        return node.val;
    }
    
    public void put(int key, int value) {
        if(capacity == 0) return;
    if(map.containsKey(key)) {
        Node node = map.get(key);
        node.val = value;
        get(key);
        return;
    }
    if(size == capacity) {
        DoublyLinkedList list = freqMap.get(minFreq);
        Node removed = list.removeLast();
        map.remove(removed.key);
        size--;
    }
    Node node = new Node(key, value);
    if(!freqMap.containsKey(1)) freqMap.put(1, new DoublyLinkedList());
    freqMap.get(1).addFirst(node);
    map.put(key, node);
    size++;
    minFreq = 1;
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */