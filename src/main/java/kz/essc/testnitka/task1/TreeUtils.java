package kz.essc.testnitka.task1;

public class TreeUtils {
    private Node root = new Node();

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
    
    private int height = 0;
    
    public int getHeight(Node node) {
        height = 0;
     
        assignDepth(node, 1);
        drawTree(node);
        
        return height;
    }
    
    private void assignDepth(Node parent, int depth) {
        for (Node node: parent.getChildren()) {
            node.setDepth(depth);
            
            assignDepth(node, depth+1);
        }
    }
    
    private void drawTree(Node parent) {
        for (Node node: parent.getChildren()) {
            System.out.println(node.getDepth());
    
            // maximum depth according to selected root node is its height
            if (node.getDepth() > height)
                height = node.getDepth();
            
            drawTree(node);
        }
    }
}
