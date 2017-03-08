package com.leegebe.algorithms.tree;

/**
 * 二叉树
 */
public class Tree {

    private TreeNode root;



    public int calculateTreeNodeNum(){
        return calculateNodeNum(root);
    }

    public int calculateNodeNum(TreeNode treeNode){
        if(treeNode == null){
            return 0;
        }else{
            System.out.println(treeNode.getData());
            return calculateNodeNum(treeNode.getLeft()) + calculateNodeNum(treeNode.getRight()) + 1;
        }
    }

    /**
     * 计算树深度
     * @return
     */
    public int calculateDepth(){
        return calculateNodeDepth(root);
    }

    /**
     * 计算一个节点的深度
     * @param treeNode
     * @return
     */
    public int calculateNodeDepth(TreeNode treeNode){
        if(treeNode == null){
            return 0;
        }else{
            int lefthDeeph = calculateNodeDepth(treeNode.getLeft()) + 1;
            int rightDeepth = calculateNodeDepth(treeNode.getRight()) + 1;
            return lefthDeeph>rightDeepth?lefthDeeph:rightDeepth;
        }
    }


    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
}
