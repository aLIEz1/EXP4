import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearchTree {
    int data;
    BinarySearchTree lChild;
    BinarySearchTree rChild;

    public static void main(String[] args) {
        BinarySearchTree bT = new BinarySearchTree();
        bT.lChild = new BinarySearchTree();
        bT.rChild = new BinarySearchTree();
        Scanner sc = new Scanner(System.in);
        int data;
        List<Integer> list = new ArrayList<>();
        List<Integer> listFormer = new ArrayList<>();
        List<Integer> listLatter = new ArrayList<>();
        while (true) {
            data = sc.nextInt();
            if (data == -1) {
                break;
            } else {
                list.add(data);
            }
        }
        list.sort((o1, o2) -> o2 - o1);
        bT.data = list.get(list.size() / 2);
//        System.out.println(bT.data);
        for (int i = 0; i < (list.size() / 2); i++) {
            listFormer.add(list.get(i));
        }
        for (int i = (list.size() / 2) + 1; i < list.size(); i++) {
            listLatter.add(list.get(i));
        }
//        for (Integer i:list){
//            System.out.print("ALL"+i+" ");
//        }
//        System.out.println();

        for (Integer integer : listFormer) {
//            System.out.print("LEFT"+i+" ");
            bT.lChild.CreatTree(integer);
        }
        for (Integer integer : listLatter) {
//            System.out.print("RIGHT"+i+" ");
            bT.rChild.CreatTree(integer);
        }
        System.out.print(bT.calcHeight(bT) - 1);

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

    public int calcHeight(BinarySearchTree b) {
        if (b == null) {
            return 0;
        } else {
            return Math.max(calcHeight(b.lChild), calcHeight(b.rChild)) + 1;
        }

    }
}
