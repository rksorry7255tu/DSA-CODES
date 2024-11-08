import java.util.LinkedList;
import java.util.Queue;

public class tree {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }

        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }

        public static void levelorder(Node root){
            Queue<Node> q=new LinkedList<>();
            if(root==null){
                return;
            }
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data);
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }

        public static int  sumOfNodes(Node root){
            if(root==null){
                return 0;
            }

            return sumOfNodes(root.left)+sumOfNodes(root.right)+root.data;
        }

        //size
        public static int size(Node root){
            if(root==null){
                return 0;
            }
            return size(root.left)+size(root.right)+1;
        }


        //height
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int left=height(root.left)+1;
            int right=height(root.right)+1;
            int height=Math.max(left,right);
            return height;
        }
    }

    public static void main(String[] args) {
       //int nodes[]={1,2,3,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       //int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       int nodes[]={1, 2,-1,-1,-1};
       BinaryTree tree=new BinaryTree();
       Node root=tree.buildTree(nodes);
       
       //tree.preorder(root);
       //tree.inorder(root);
       //tree.postorder(root);
       //tree.levelorder(root);
       System.out.println(tree.sumOfNodes(root));
       System.out.println(tree.size(root));
       System.out.println(tree.height(root));

    }
}
