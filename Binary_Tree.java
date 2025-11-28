public class Binary_Tree{
    Node root;

    public Binary_Tree(){
        root = null;
    }

    public void insert(int data){
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(data < root.data){
            root.left = insertRec(root.left, data);
        }
        else{
            root.right = insertRec(root.right, data);
        }
        return root;
    }
    
    public void inorder(){
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.println(root.data + " ");  
            inorderRec(root.right);
        }
    }    
    
    public void preorder(){
        preorderRec(root);
        System.out.println();
    }

    private void preorderRec(Node root){
        if(root != null){
            System.out.println(root.data + " ");
            preorderRec(root.left);  
            preorderRec(root.right);
        }
    }

    public void postorder(){
        postorderRec(root);
        System.out.println();
    }

    private void postorderRec(Node root){
        if(root != null){
            postorderRec(root.left);  
            postorderRec(root.right);
            System.out.println(root.data + " ");
        }
    }

    public void remove(int key){
        root = removeRec(root, key);
    }

    private Node removeRec(Node root,int key){
        if(root == null) 
            return root;
        if(key<root.data) 
            root.left=removeRec(root.left,key);
        else if(key>root.data) 
            root.right=removeRec(root.right,key);
        else{
            if(root.left==null) 
                return root.right;
            else if(root.right==null) 
                return root.left;

            root.data=minValue(root.right);
            root.right=removeRec(root.right,root.data);
        }
        return root;
    }

    private int minValue(Node root){
        int min = root.data;
        while(root.left != null){
            min=root.left.data;
            root=root.left;
        }
        return min;
    }   

    public boolean search(int key){
        return searchRec(root, key);
    }
    
    private boolean searchRec(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(key<root.data){
            return searchRec(root.left, key);
        }
        else{
             return searchRec(root.right, key);
        }
    }

    private class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            left = right=null;
        }
    }

    public static void main(String[] args) {
        Binary_Tree a = new Binary_Tree();
        a.insert(50);
        a.insert(30);
        a.insert(60);
        a.insert(20);
        a.insert(55);
        a.insert(40);
        a.insert(80);
        System.out.println("Inorder Traversal");
        a.inorder();
        System.out.println("Preorder Traversal");
        a.preorder();
        System.out.println("Postorder Traversal");
        a.postorder();
        a.remove(60);
        System.out.println("After Deletion");
        a.inorder();
        System.out.println("Searching for 40: "+a.search(40));
        System.out.println("Searching for 90: "+a.search(90));
    }
}