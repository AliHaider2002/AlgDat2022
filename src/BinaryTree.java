import java.util.ArrayDeque;

public class BinaryTree {

   static class BinaryTreeNode{
        char value;
        BinaryTreeNode rightchild;
        BinaryTreeNode leftchild;

        BinaryTreeNode(char value){//konstruktør
            this.value = value;
            this.rightchild = null;
            this.leftchild = null;
        }
        BinaryTreeNode addLeftChild(char value){ //lager det venstre barnet
            this.leftchild = new BinaryTreeNode(value);
            return this.leftchild;

        }
        BinaryTreeNode addRightChild(char value){
            this.rightchild = new BinaryTreeNode(value);
            return this.rightchild;
        }
    }

    static void printLevelOrder(BinaryTreeNode rot){
        ArrayDeque<BinaryTreeNode> queue = new ArrayDeque<BinaryTreeNode>();
        queue.addLast(rot); //rot noden lagt til
        while (!queue.isEmpty()){

            BinaryTreeNode current = queue.removeFirst(); // 1. tar ut den første fra køen

            //2. legger til current sine barn
            if (current.leftchild != null){
                queue.addLast(current.leftchild);
            }
            if (current.rightchild != null){
                queue.addLast(current.rightchild);
            }
            //3 skriv ut
            System.out.println(current.value + " ");

        }
    }
    static void printPreOrder(BinaryTreeNode node){
       if (node == null){ //basistilfellet i rekursjon
           return;
       }
       System.out.println(node.value + " "); //enklere kall?
       printPreOrder(node.leftchild);
       printPreOrder(node.rightchild);
    }
    static void printInOrder(BinaryTreeNode node){
       if (node == null) {
           return;
       }
       printInOrder(node.leftchild);
       System.out.println(node.value + " ");
       printInOrder(node.rightchild);
    }
    static void printPostOrder(BinaryTreeNode node){
       if (node == null){
           return;
       }
       printPostOrder(node.leftchild);
       printPostOrder(node.rightchild);
       System.out.println(node.value);
    }

    public static void main(String[] args) {

        BinaryTreeNode rot = new BinaryTreeNode('A'); //lager en rot node - nivå 0

        //resterende verdier nivå 1
        BinaryTreeNode b = rot.addLeftChild('B');
        BinaryTreeNode c = rot.addRightChild('C');

        //resterende verdier nivå 2
        BinaryTreeNode d = b.addLeftChild('D');
        BinaryTreeNode e = b.addRightChild('E');

        BinaryTreeNode f = c.addLeftChild('F');
        BinaryTreeNode g = c.addRightChild('G');

        System.out.println("bredde/niva orden");
        printLevelOrder(rot);

        //printLevelOrder(rot);
        System.out.println("Pre order: ");
        printPreOrder(rot);

        System.out.println();

        System.out.println("In order: ");
        printInOrder(rot);

        System.out.println();

        System.out.println("Post order: ");
        printPostOrder(rot);



    }
}
