package domain;

import java.util.List;

public class UF {
	public Node find(Node n){
		if (n.set.getRepresentative() != n){
			n.set.setRepresentative(find(n.set.getRepresentative()));
		}
		return n.set.getRepresentative();
	}

    public void union(Node x, Node y){
    	if (x.set.getRepresentative() != y.set.getRepresentative()){
    		if (x.set.getQttOfNodes() > y.set.getQttOfNodes()){
    			y.set.setRepresentative(x.set.getRepresentative());
                y.set.addNodeOnList(x);

                for (int i = 0; i <= y.set.getQttOfNodes(); i++){
                    x.set.addNodeOnList(y.set.getNodeAt(i));
                    y.set.getNodeAt(i).set.setRepresentative(x);
                }
            } else {
    			x.set.setRepresentative(y.set.getRepresentative());
                x.set.addNodeOnList(y);

                for (int i = 0; i <= x.set.getQttOfNodes(); i++){
                    y.set.addNodeOnList(x.set.getNodeAt(i));
                    x.set.getNodeAt(i).set.setRepresentative(y);
                }
            }
    	}
    }
}