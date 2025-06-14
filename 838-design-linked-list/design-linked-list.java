class Node{
    int val;
    Node next;
    Node(){}
    Node(int val){
        this.val = val;
    }
    Node(int val, Node next){
        this.val = val;
        this.next = next;
    }
}

class MyLinkedList {

    private static int len;
    Node head;
    
    public MyLinkedList() {
        head = null;
        len = 0;
    }
    
    public int get(int index) {
        if(index >= len) return -1;
        Node curr = head;
        while(index-- > 0) curr= curr.next;
        return curr.val;
    }
    
    public void addAtHead(int val) {
        len++;
        if(head == null){
            Node n = new Node(val);
            head = n;
        }
        else{
            Node n = new Node(val, head);
            head = n;
        }
    }
    
    public void addAtTail(int val) {
        if(head == null){
            addAtHead(val);
            return;
        }
        len++;
        Node n = new Node(val);
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = n;
    }
    
    public void addAtIndex(int index, int val) {
        if(index == 0){
            addAtHead(val);
            return;
        }
        if(index == len){
            addAtTail(val);
            return;
        }
        if(index < 0 || index > len) return;
        len++;
        index--;
        Node cur = head;
        while(index-- > 0){
            cur = cur.next;
        }
        Node n = new Node(val, cur.next);
        cur.next = n;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= len) return;
        len--;
        if(index == 0){
            Node tmp = head.next;
            head.next = null;
            head = tmp;
            return;
        }    
        if(index == len){
            Node cur = head;
            while(cur.next.next!=null) cur = cur.next;
            cur.next = null;
            return;
        }
        Node curr = head;
        index--;
        while(index-- > 0) curr = curr.next;
        Node nxt = curr.next;
        Node n = nxt.next;
        nxt.next = null;
        curr.next = n;
        return;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */