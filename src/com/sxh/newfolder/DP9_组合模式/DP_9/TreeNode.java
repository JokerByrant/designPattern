package com.sxh.newfolder.DP9_组合模式.DP_9;

import java.util.ArrayList;
import java.util.List;

/**
 * 树节点
 * @author 一池春水倾半城
 * @date 2019/12/17 20:38
 */
public class TreeNode {
    /**
     * 节点名
     */
    private String name;

    /**
     * 父节点
     */
    private TreeNode parentNode;

    /**
     * 子节点
     */
    private List<TreeNode> childNodes = new ArrayList<>();

    public TreeNode(String name) {
        this.name = name;
    }

    public TreeNode() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParentNode() {
        return parentNode;
    }

    public void setParentNode(TreeNode parentNode) {
        this.parentNode = parentNode;
    }

    public List<TreeNode> getChildNodes() {
        return childNodes;
    }

    public void setChildNodes(List<TreeNode> childNodes) {
        this.childNodes = childNodes;
    }

    /**
     * 添加子节点
     * @param nodeName
     * @return
     */
    public TreeNode addChildNode(String nodeName) {
        TreeNode node = new TreeNode(nodeName);
//        // 设置父节点
//        node.setParentNode(this);
        // 将节点添加到子节点列表中
        this.childNodes.add(node);
        return node;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "name='" + name + '\'' +
                ", parentNode=" + parentNode +
                ", childNodes=" + childNodes +
                '}';
    }
}
