package com.leegebe.algorithms.tree;

/**
 * 二叉搜索树
 */
public class BinarySearchTree {

    TreeNode rootNode;

    public TreeNode insert(TreeNode node){
        if(this.rootNode == null){
            this.rootNode = node;
        }else{
            if(node.getData() > rootNode.getData()){

            }
        }
        return rootNode;
    }

    public void insert(TreeNode source, TreeNode target){
        if(source.getData() < target.getData()){
            if(source.getRight() == null){
                source.setRight(target);
            }else{
                insert(source.getRight(),target);
            }
        }else{
            if(source.getLeft() == null){
                source.setLeft(target);
            }else{
                insert(source.getLeft(),target);
            }
        }
    }





}
