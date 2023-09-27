package Trees.app.src.main.java.trees.dirFileComparator;

public class DirectoryComparator {
    public static boolean compareDirectories(TreeNode tree1, TreeNode tree2) {
        int fileCount1 = countFiles(tree1);
        int fileCount2 = countFiles(tree2);

        return fileCount1 == fileCount2;
    }

    private static int countFiles(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int count = 0;
        for (TreeNode child : node.children) {
            if (child.children.isEmpty()) {
                count++;
            } else {
                count += countFiles(child);
            }
        }

        return count;
    }

    public static void main(String[] args) {
//        TreeNode tree1 = new TreeNode("dir1");
//        TreeNode tree2 = new TreeNode("dir2");
//
//        TreeNode file1 = new TreeNode("file1");
//        TreeNode file2 = new TreeNode("file2");
//        TreeNode file3 = new TreeNode("file3");
//
//        tree1.addChild(file1);
//        tree1.addChild(tree2);
//        tree2.addChild(file2);
//        tree2.addChild(file3);
//
//        boolean result = compareDirectories(tree1, tree2);
//
//        System.out.println("First tree result");
//        System.out.println(result);

        TreeNode tree1 = new TreeNode("dir1");
        TreeNode tree2 = new TreeNode("dir2");

        TreeNode file1 = new TreeNode("file1");
        TreeNode file2 = new TreeNode("file2");
        TreeNode file3 = new TreeNode("file3");
        TreeNode file4 = new TreeNode("file4");

        tree1.addChild(file1);
        tree1.addChild(file2);
        tree2.addChild(file3);
        tree2.addChild(file4);

        boolean result = compareDirectories(tree1, tree2);

        System.out.println(result);

    }
}
