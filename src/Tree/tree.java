package Tree;

public class tree {

    public static void main(String[] arg)
    {
        treestruc mytree = new treestruc(1);  // BSD
        mytree.root.left = new node(2);
        mytree.root.right = new node(3);
        mytree.root.left.left = new node(4);
    }

    public void traversal(node root) // in Depth
    {
        if(root == null)
            return;

        System.out.println(root.data);  // PreOrder
        traversal(root.left);
        traversal(root.right);

//        traversal(root.left);
//        System.out.println(root.data);  // InOrder
//        traversal(root.right);
//
//        traversal(root.left);
//        traversal(root.right);
//        System.out.println(root.data);  // PostOrder
    }

    public int maxDepth(node root)
    {
        if(root == null)
            return 0;
        int DepthLeft = maxDepth(root.left);
        int DepthRight = maxDepth(root.right);
        if( DepthLeft>DepthRight)
            return DepthLeft +1;
        else
            return DepthRight +1;
    }

}

class treestruc
{
    node root;
    treestruc(int val)
    {
        root = new node(val);
    }
    treestruc()
    {
        root = null;
    }
}

class node{
    int data;
    node left,right;
    node(int val)
    {
        this.data = val;
        left=right=null;
    }
}


