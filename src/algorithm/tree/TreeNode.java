package algorithm.tree;

import model.special.exception.BaseException;

import java.io.*;
import java.util.LinkedList;

/**
 * 树逻辑结构
 * 前序：根左右
 * 中序：左根右
 * 这里的左右代表的是整个树 ：整个左子树 | 根节点 | 整个右子树
 *
 * @author: east
 * @date: 2023/12/1
 */
public class TreeNode implements Serializable {
    private static final long serialVersionUID = 123456789L;

    public Integer value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(Integer value) {
        this.value = value;
    }

    /**
     * 层序打印树结构: 只打印有值部分
     * 需要用到先进先出逻辑结构
     */
    public void printSimpleTree() {
        LinkedList<TreeNode> deque = new LinkedList<>();
        System.out.print(this.value + "\t");
        deque.addLast(this.left);
        deque.addLast(this.right);
        while (!deque.isEmpty()) {
            TreeNode node = deque.pollFirst();
            if (node != null) {
                System.out.print(node.value + "\t");
                deque.addLast(node.left);
                deque.addLast(node.right);
            }
        }
    }

    /**
     * 层序打印树结构: 按照树型打印 todo
     * 需要用到先进先出逻辑结构
     */
    public void printWholeTree() {
        LinkedList<TreeNode> deque = new LinkedList<>();
        System.out.println(this.value + "\t");
        deque.addLast(this.left);
        deque.addLast(this.right);
        while (!deque.isEmpty()) {
            TreeNode node = deque.pollFirst();
            if (node != null) {
                System.out.println(node.value + "\t");
                deque.addLast(node.left);
                deque.addLast(node.right);
            }
        }
    }

    public void serializeTree() {
        try (FileOutputStream fileOutputStream = new FileOutputStream("TreeObject1.ser");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(this);
            System.out.println("node serialize succeed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new BaseException();
        }
    }

    public static TreeNode deserializeTree() {
        try (FileInputStream fileInputStream = new FileInputStream("TreeObject1.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            TreeNode root = (TreeNode) objectInputStream.readObject();
            System.out.println("node deserialize succeed");
            return root;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new BaseException();
        }
    }


}
