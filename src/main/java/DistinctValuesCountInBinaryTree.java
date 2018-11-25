import java.util.HashSet;
import java.util.Set;

class DistinctValuesCountInBinaryTree {

    public static void main(String[] args) {
        Tree A = new Tree();
        A.x = 4;

        Tree B = new Tree();
        B.x = 5;

        Tree C = new Tree();
        C.x = 6;

        A.l = B;
        A.r = C;

        Tree D = new Tree();
        D.x = 4;

        B.l = D;
        B.r = null;

        Tree E = new Tree();
        E.x = 1;

        Tree F = new Tree();
        F.x = 6;

        C.l = E;
        C.r = F;

        E.l = null;
        E.r = null;

        F.l = null;
        F.r = null;

        Tree G = new Tree();
        G.x = 5;

        G.l = null;
        G.r = null;

        D.l = G;
        D.r = null;

        DistinctValuesCountInBinaryTree distinctValuesCountInBinaryTree = new DistinctValuesCountInBinaryTree();
        System.out.println(distinctValuesCountInBinaryTree.solution(A));

    }

    public int solution(Tree T) {
        int result = 0;
        if (T != null) {
            // N -> 1..50 000
            // Height of tree 0..3500
            // Each value in tree is integer from 1..N
            // TODO: validate input!!!
            Set<Integer> distinctValues = new HashSet<>();
            return traverse(T, distinctValues);

        }
        return result;
    }

    private int traverse(Tree root, Set<Integer> distinctValues) {
        int leftCount, rightCount;
        if (root == null) {
            return distinctValues.size();
        } else {
            int valueToAdd = root.x;
            boolean didNotExistBefore = distinctValues.add(valueToAdd) == false;
            if (didNotExistBefore) {
                leftCount = traverseLeftSubTree(root, distinctValues);
                rightCount = traverseRightSubTree(root, distinctValues);
            } else {
                rightCount = traverseRightSubTree(root, distinctValues);
                leftCount = traverseLeftSubTree(root, distinctValues);
                distinctValues.remove(valueToAdd);
            }
            return Math.max(leftCount, rightCount);
        }
    }

    private int traverseRightSubTree(Tree root, Set<Integer> distinctValues) {
        int rightCount;
        rightCount = traverse(root.r, distinctValues);
        return rightCount;
    }

    private int traverseLeftSubTree(Tree root, Set<Integer> distinctValues) {
        int leftCount;
        leftCount = traverse(root.l, distinctValues);
        return leftCount;
    }

    static class Tree {
        public int x;
        public Tree l;
        public Tree r;
    }


}