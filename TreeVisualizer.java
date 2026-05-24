package Dsaconceptvisualizer;
import java.util.*;

public class TreeVisualizer{

    public class Node{
        int data;
        int height;
        Node left;
        Node right;

        Node(int d){
            data=d;
            height=1;
            left=null;
            right=null;
        }
    }

    private Node root=null;

    public Node getRoot(){
        return root;
    }

    // ================= BST INSERT =================
    public List<String> insert(int value){

        List<String> steps=new ArrayList<>();
        steps.add("Insert "+value+" into BST");

        try{
            root=insertRec(root,value,steps);
        }
        catch(Exception e){
            steps.add("Error during insertion: "+e.getMessage());
        }

        return steps;
    }

    private Node insertRec(Node node,int value,List<String> steps){

        if(node==null)
            return new Node(value);

        if(value<node.data){
            steps.add(value+" < "+node.data+" go left");
            node.left=insertRec(node.left,value,steps);
        }
        else{
            steps.add(value+" >= "+node.data+" go right");
            node.right=insertRec(node.right,value,steps);
        }

        return node;
    }

    // ================= BST SEARCH =================
    public List<String> search(int value){

        List<String> steps=new ArrayList<>();
        steps.add("Search "+value+" in BST");

        try{
            Node curr=root;

            while(curr!=null){
                steps.add("Checking node "+curr.data);

                if(curr.data==value){
                    steps.add("Value found");
                    return steps;
                }

                if(value<curr.data)
                    curr=curr.left;
                else
                    curr=curr.right;
            }

            steps.add("Value not found");
        }
        catch(Exception e){
            steps.add("Error during search: "+e.getMessage());
        }

        return steps;
    }

    // ================= BST DELETE =================
    public List<String> delete(int value){

        List<String> steps=new ArrayList<>();
        steps.add("Delete "+value+" from BST");

        try{
            root=deleteRec(root,value,steps);
        }
        catch(Exception e){
            steps.add("Error during deletion: "+e.getMessage());
        }

        return steps;
    }

    private Node deleteRec(Node node,int value,List<String> steps){

        if(node==null){
            steps.add("Node not found to delete");
            return null;
        }

        if(value<node.data)
            node.left=deleteRec(node.left,value,steps);
        else if(value>node.data)
            node.right=deleteRec(node.right,value,steps);
        else{
            steps.add("Node found: "+node.data);

            if(node.left==null)
                return node.right;

            if(node.right==null)
                return node.left;

            Node successor=minValue(node.right);
            node.data=successor.data;
            node.right=deleteRec(node.right,successor.data,steps);
        }

        return node;
    }

    private Node minValue(Node node){

        while(node.left!=null)
            node=node.left;

        return node;
    }

    // ================= BFS TRAVERSAL =================
    public List<String> bfs(){

        List<String> steps=new ArrayList<>();
        steps.add("BFS Traversal");

        if(root==null){
            steps.add("Tree is empty");
            return steps;
        }

        try{
            Queue<Node> q=new LinkedList<>();
            q.add(root);

            while(!q.isEmpty()){
                Node curr=q.poll();
                steps.add("Visited "+curr.data);

                if(curr.left!=null)
                    q.add(curr.left);

                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
        catch(Exception e){
            steps.add("Error during BFS: "+e.getMessage());
        }

        return steps;
    }

    // ================= AVL CONVERSION =================
    public List<String> convertToAVL(){

        List<String> steps=new ArrayList<>();
        steps.add("Convert BST to AVL");

        try{
            root=balance(root,steps);
        }
        catch(Exception e){
            steps.add("Error during AVL conversion: "+e.getMessage());
        }

        return steps;
    }

    private Node balance(Node node,List<String> steps){

        if(node==null)
            return null;

        node.left=balance(node.left,steps);
        node.right=balance(node.right,steps);

        updateHeight(node);
        int bf=getBalance(node);

        if(bf>1 && getBalance(node.left)>=0){
            steps.add("Right rotation at "+node.data);
            return rightRotate(node);
        }

        if(bf>1 && getBalance(node.left)<0){
            node.left=leftRotate(node.left);
            return rightRotate(node);
        }

        if(bf<-1 && getBalance(node.right)<=0){
            steps.add("Left rotation at "+node.data);
            return leftRotate(node);
        }

        if(bf<-1 && getBalance(node.right)>0){
            node.right=rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    private int height(Node n){
        if(n==null)
            return 0;
        return n.height;
    }

    private void updateHeight(Node n){
        n.height=1+Math.max(height(n.left),height(n.right));
    }

    private int getBalance(Node n){
        if(n==null)
            return 0;
        return height(n.left)-height(n.right);
    }

    private Node rightRotate(Node y){

        Node x=y.left;
        Node t=x.right;

        x.right=y;
        y.left=t;

        updateHeight(y);
        updateHeight(x);

        return x;
    }

    private Node leftRotate(Node y){

        Node x=y.right;
        Node t=x.left;

        x.left=y;
        y.right=t;

        updateHeight(y);
        updateHeight(x);

        return x;
    }
}