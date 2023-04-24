package w3Schools;

//import static jdk.internal.logger.BootstrapLogger.BootstrapExecutors.head;

public class LL {
    Node head;
    private int size;
    LL(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    /** Add - first and last **/
    public void addfirst(String data){

            Node newNode = new Node(data);
            if (head==null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode; // update head pointer
        }

    public void addlast(String data) {
        Node newNode = new Node(data); // Object
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    //print
    public void printlist(){
        if (head == null){
            System.out.println("List is empty");
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data +"->");
            currNode = currNode.next;
        }
        System.out.println("NULL");

    }
    /** remove/delete first --> first of all create a delete function **/
      public void removeFirst(){
          if (head == null){
              System.out.println("The list is empty");
              return;
          }
          size--;
          head = head.next;
      }
      /** remove last */
      public void removeLast(){
          if (head == null){
              System.out.println("This list is empty");
              return;
          }
          size-- ;
          if (head.next == null){
              head = null;
              return;
          }
          Node secondLast = head;
          Node lastNode = head.next; // head.next = null -> lastNode= null
          while (lastNode.next != null){ // null.next
              lastNode = lastNode.next;
              secondLast = secondLast.next;
          }
          secondLast.next = null;
      }

      public  int getSize(){
          return size;
      }


    public static void main(String[] args) {
        LL list = new LL();

        /** addfirst **/
      list.addfirst("a");
      list.addfirst("is");
      list.addfirst("This");
      list.printlist();

      /** addlast **/
        list.addlast("list");
        list.printlist();

       /** removefirst **/
        list.removeFirst();
        list.printlist();

        /** removelast **/
        list.removeLast();
        list.printlist();

        System.out.println("size of linkedlist is:"+list.getSize());
        list.addfirst("This");
        System.out.println("size of linkedlist is:"+list.getSize());



    }
}
