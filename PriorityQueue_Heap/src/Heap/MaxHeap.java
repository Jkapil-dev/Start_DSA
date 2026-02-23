package Heap;

public class MaxHeap {
    int[] heap;//array to store elements
    int capacity;//max capacity of heap
    int count;//current no of elements

    MaxHeap(int capacity){
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.count =0;
    }
    int parent(int i){//parent index
        if(i<=0)return -1;
        return (i-1)/2;
    }
    int leftChild(int i){//return left child
        int left = (2*i)+1 ;
        if(left>= count)return -1;
        return left;
    }
    int rightChild(int i){//return right child
        int right = (2*i)+2;
        if(right >= count)return -1;
        return right;
    }
    int getMax() {//return max element
        if (count == 0) throw new RuntimeException("Heap is empty");
        return heap[0];
    }


}
