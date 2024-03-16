public class SimpleLinkedList {
    public Node head;

    public SimpleLinkedList(int data){
        this.head=new Node(data);
    }

    public void addFirst(int data){
        Node newHead=new Node(data);
        newHead.next=this.head;
        this.head=newHead;
    }

    public void addLast(int data){
        Node tmp=this.head;
        while(tmp.next!=null){
            tmp=tmp.next;
        }

        Node newTail=new Node(data);
        tmp.next=newTail;
    }

    public int getSize(){
        if(this.head==null) return 0;

        Node tmp=this.head;
        int count=1;

        while(tmp.next!=null){
            count++;
            tmp=tmp.next;
        }

        return count;
    }

    public boolean isEmpty(){
        return this.head==null;
    }


    public void removeFirst(){
        if (isEmpty() == false){
            Node tmp = this.head; //current head (to be removed) is now in memory
            this.head = this.head.next; //the head is now the next Node
            tmp = null; //the remembered Node is now equal to null
        }
    }


    public void removeLast(){
        Node tmp=this.head;

        while(tmp.next!=null){
            tmp=tmp.next;
        }
        tmp = null;
    }


    public void removeAt(int position){
        Node tmp0 = this.head;
        int i = 0;

        while(i < position-1) { //the code goes to the Node that lies before the Node to be removed
            tmp0 = tmp0.next;
        }
        Node tmp1 = tmp0.next; //the variable tmp1 is set to the next of tmp0, tmp1 is the one to be removed
        tmp0.next = tmp1.next; //the variable tmp0 is told that it's next Node is actually the one that lies two spaces from it
        tmp1 = null; //end than tmp1 is removed

    }

    public int getAt(int position){
        return 0;
    }

}