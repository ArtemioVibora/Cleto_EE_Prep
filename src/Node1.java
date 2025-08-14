class Node
{

    private Node next;
    private int value;

    public Node(int value, Node next)
    {
        this.next = next;
        this.value = value;
    }

    public Node getNext()
    {
        return next;
    }

    public int getValue()
    {
        return value;
    }

}


public class Node1 {


    public static void main(String[] a)
    {
        Node n3 = new Node(3, null);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);

        // Now how to traverse

        for (int i = 0; i < 3; i++)
        {

        }
    }

}
