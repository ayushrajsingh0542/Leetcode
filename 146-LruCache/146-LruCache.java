// Last updated: 15/08/2026, 20:06:08
class LRUCache {
   static class Node {
       int key, val;
       Node prev, next;
       Node(int k, int v) {
           this.key = k;
           this.val = v;
           prev = null;
           next = null;
       }
   }

   static int cap;
   HashMap<Integer, Node> map;
   Node head;
   Node tail;

   public LRUCache(int capacity) {
       map = new HashMap<>();
       head = new Node(-1, -1);
       tail = new Node(-1, -1);
       head.next = tail;
       tail.prev = head;
       cap = capacity;
   }

   public void remove(int key) {
       Node node = map.get(key);
       Node temp = node.prev;
       temp.next = node.next;        
       node.next.prev = node.prev;       
       map.remove(key);
   }

   public void insertAfterHead(int key, int val) {
       Node node = new Node(key, val);
       Node temp = head.next;
       head.next = node;
       node.prev = head;
       node.next = temp;
       temp.prev = node;
       map.put(key, node);
   }

   public int get(int key) {
       if (map.isEmpty() || !map.containsKey(key))
           return -1;
       Node node = map.get(key);
       remove(key);
       insertAfterHead(key, node.val);
       return node.val;
   }

   public void put(int key, int value) {
       if (map.isEmpty()) {
           insertAfterHead(key, value);
           return;
       } else if (!map.isEmpty() && map.containsKey(key)) {
           remove(key);
           insertAfterHead(key, value);
       } else if (!map.isEmpty() && !map.containsKey(key)) {
           if (map.size() == cap) {
               remove(tail.prev.key);
               insertAfterHead(key, value);
               return;
           } else if (map.size() != cap) {
               insertAfterHead(key, value);
               return;
           }
       }
   }
}
