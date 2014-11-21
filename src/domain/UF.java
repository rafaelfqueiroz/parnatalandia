package domain;

public class UF {
	public Node find(Node n){
		if (n.set.getRepresentative() != n){
			n.set.setRepresentative(find(n.set.getRepresentative()));
		}
		return n.set.getRepresentative();
	}

    public void union(Node x, Node y){
    	if (x.set.getRepresentative() != y.set.getRepresentative()){
    		if (x.set.getQttOfNodes() > y.set.getQttOfNodes())
    			y.set.setRepresentative(x.set.getRepresentative());
    		else 
    			x.set.setRepresentative(y.set.getRepresentative());
    	}
    }
}