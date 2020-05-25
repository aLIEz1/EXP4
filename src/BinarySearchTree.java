import java.util.Scanner;

public class BinarySearchTree {
    int data;
    BinarySearchTree lChild;
    BinarySearchTree rChild;

    public static void main(String[] args) {
        BinarySearchTree bT = new BinarySearchTree();
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        bT.data=data;
        while (true) {
            data = sc.nextInt();
            if (data == -1) {
                bT.PreOrderTree(bT);
                break;
            }
            bT.CreatTree(data);
        }

    }

    public void Creat(BinarySearchTree bT) {
        if (bT == null) {
            return;
        }
        if (bT.data < this.data) {
            if (this.lChild == null) {
                this.lChild = bT;
            } else {
                this.lChild.Creat(bT);
            }
        } else {
            if (this.rChild == null) {
                this.rChild = bT;
            } else {
                this.rChild.Creat(bT);
            }
        }
    }

    public void CreatTree(int data) {
        if (data != -1) {
            BinarySearchTree temp = new BinarySearchTree();
            temp.data = data;
            Creat(temp);
        }
    }

    public void PreOrderTree(BinarySearchTree bT) {
        if (bT != null) {
            System.out.print(bT.data + " ");
            PreOrderTree(bT.lChild);
            PreOrderTree(bT.rChild);
        }
    }
}
