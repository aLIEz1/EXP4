public class BinarySearchTree {
    Tree T;

    public void CreatTree(int data) {
        Tree temp = new Tree();
        temp.data = data;
        if (T == null) {
            T = temp;
        }
        Tree cur = T;
        
    }
}
