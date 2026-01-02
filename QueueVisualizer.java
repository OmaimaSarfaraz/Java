package Dsaconceptvisualizer;
import java.util.*;

public class QueueVisualizer{

    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public QueueVisualizer(int capacity){
        queue=new int[capacity];
        Arrays.fill(queue,-1);
        front=0;
        rear=-1;
        size=0;
    }

    public int[] getQueue(){
        return queue;
    }

    // ---------- ENQUEUE ----------
    public List<String> enqueue(int value){

        List<String> steps=new ArrayList<>();
        steps.add("Enqueue "+value);

        if(size==queue.length){
            steps.add("Queue Overflow: cannot insert");
            return steps;
        }

        rear=(rear+1)%queue.length;
        queue[rear]=value;
        size++;

        steps.add("Inserted at position "+rear);
        return steps;
    }

    // ---------- DEQUEUE ----------
    public List<String> dequeue(){

        List<String> steps=new ArrayList<>();
        steps.add("Dequeue Operation");

        if(size==0){
            steps.add("Queue Underflow: queue is empty");
            return steps;
        }

        int removed=queue[front];
        queue[front]=-1;
        front=(front+1)%queue.length;
        size--;

        steps.add("Removed element "+removed);
        return steps;
    }

    // ---------- SEARCH ----------
    public List<String> search(int value){

        List<String> steps=new ArrayList<>();
        steps.add("Search "+value+" in Queue");

        if(size==0){
            steps.add("Queue is empty");
            return steps;
        }

        int idx=front;

        for(int i=0;i<size;i++){

            steps.add("Checking index "+idx);

            if(queue[idx]==value){
                steps.add("Value found at index "+idx);
                return steps;
            }

            idx=(idx+1)%queue.length;
        }

        steps.add("Value not found in queue");
        return steps;
    }
}