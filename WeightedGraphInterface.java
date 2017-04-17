package graphassignment_cs;

import java.util.Queue;


public interface WeightedGraphInterface {
    
    
    
    public boolean isEmpty();
    public boolean isFull();
    public void addVertex(Object vertex);
    public void addEdge(Object fromVertex, Object toVertex, int weight);
    public int weightIs(Object fromVertex, Object toVertex);
    public Queue getToVertex(Object vertex);
    public void clearMarks();
    public void markVertex(Object vertex);
    public boolean isMarcked(Object vertex);
    
}
