package test001;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 重建二叉树，并层序遍历
 * 根据前序和中序遍历得到得到后序遍历或者层序遍历方式
 */
public class T004 {
    public static void main(String[] args) {
        int[] preOdeer = {1,2,4,8,9,5,10,3,6,7};
        int[] inOrder  = {8,4,9,2,10,5,1,6,3,7};
        BTree b=new BTree();
        Node bTreeRootNode=b.rebuildBtree(preOdeer,0,preOdeer.length-1,inOrder,0,inOrder.length-1);
        BTree bTree=new BTree(bTreeRootNode);
        bTree.order();
    }
}

class Node{
    public Node leftNode;
    public Node rightNode;
    public int value;
//无参构造（内部全空）和有参构造
    public Node(int value) {
        this.value = value;
        this.leftNode=null;
        this.rightNode=null;
    }
    public Node() {
    }
}

class BTree{
    private Node root;
    public BTree(Node root) {
        this.root = root;
    }
    public BTree() {
        this.root = null;
    }
//初始化二叉树方法：通过前序和中序遍历来重新建立二叉树
    public Node rebuildBtree(int[] preorderArr,int start1,int end1,int[] inorderArr,int start2,int end2){
        if(start1>end1||start2>end2)return null;
        Node head=new Node(preorderArr[start1]);
        int index=findPreorderInInorder(preorderArr[start1],inorderArr,start2,end2);
        int offset=index-start2;
        head.leftNode=rebuildBtree(preorderArr,start1+1,start1+offset,inorderArr,start2,start2+offset-1);
        head.rightNode=rebuildBtree(preorderArr,start1+offset+1,end1,inorderArr,index+1,end2);
        return head;
    }
//   方法： 查找前序首节点数据在中序数组中的位置
    public int findPreorderInInorder(int headValue,int[] inorderArr,int inorderStart,int inordedrEnd){
        if(inordedrEnd-inorderStart==0){
            return inorderStart;//查找索引特殊情况，中序数组的开始到结束内只有一个数据
        }
        for (int i=inorderStart;i<=inordedrEnd;i++) {
           if(inorderArr[i] == headValue){
               return i;
           }
        }
        return 0;
    }
//层序遍历方法：根据二叉树的root节点来层序遍历二叉树
//
    public void order(){
        Queue queue=new LinkedList();
        queue.offer(this.root);
        while(!queue.isEmpty()){
            Node node= (Node) queue.poll();
            if(node!=null){
                System.out.println(node.value);
                queue.offer(node.leftNode);
                queue.offer(node.rightNode);
            }
        }


    }

}