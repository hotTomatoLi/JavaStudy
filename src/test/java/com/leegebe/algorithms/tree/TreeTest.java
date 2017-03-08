package com.leegebe.algorithms.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */
class TreeTest {


    @Test
    void calculateTreeNum() {
        Tree tree = new Tree();
        TreeNode rootNode = generateTree(10);
        tree.setRoot(rootNode);
        System.out.println(tree.calculateTreeNodeNum());
    }

    @Test
    void calculateTreeDepth(){
        Tree tree = new Tree();
        TreeNode rootNode = generateTree(50);
        tree.setRoot(rootNode);
        System.out.println(tree.calculateDepth());
    }


    public TreeNode generateTree(int size){
        TreeNode rootNode = new TreeNode();
        rootNode.setData(9999);
        TreeNode curNode = rootNode;
        for(int i = 0; i < size; i++){
            TreeNode leftNode = new TreeNode();
            leftNode.setData(i);
            curNode.setLeft(leftNode);

            TreeNode rightNode = new TreeNode();
            rightNode.setData(-i);
            curNode.setRight(rightNode);
            if(i%2 == 0){
                curNode = leftNode;
            }else{
                curNode = rightNode;
            }
        }
        return rootNode;
    }

}