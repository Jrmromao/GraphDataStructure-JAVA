package graphassignment_cs;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Stack;
import java.util.Queue;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import jdk.nashorn.internal.objects.NativeString;

public class WeightedGraph{

    public static int NULL_EDGE = 0;
    private int numVertices;
    private int maxVertices;
    private Object[] vertices;
    private int[][] edges;
    private boolean[] marks;

    public WeightedGraph() {
        numVertices = 0;
        maxVertices = 50;
        vertices = new Object[50];
        marks = new boolean[50];
        edges = new int[50][50];

    }

    public void addVertex(Object vertex) {

        vertices[numVertices] = vertex;

        for (int i = 0; i < numVertices; i++) {
            edges[numVertices][i] = NULL_EDGE;
            edges[i][numVertices] = NULL_EDGE;
        }
        numVertices++;
    }

    public void setEdgeToZero(Object fromVertex, Object toVertex) {

        int departIndex = indexIs(fromVertex);
        int arriveIndex = indexIs(toVertex);

        edges[departIndex][arriveIndex] = 0;

    }

    public String display() {

        String flightHeader = " Departure\t  Arrivel\t\t  Cost\n";
        String flight = "";
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {

                if (edges[i][j] != 0) {
                    flightHeader += "" + vertices[i] + "\t" + vertices[j] + "\t\t" + weightIs(vertices[i], vertices[j]) + "\n";

                }

            }
        }
        return flightHeader;
    }

    public int indexIs(Object vertex) {
        int index = 0;
      
            while (!vertex.equals(vertices[index])) {
                index++;
            }
      

        return index;
    }

    public void addEdge(Object fromVertex, Object toVertex, int weight) {

        int row;
        int column;
        addVertex(fromVertex);
        addVertex(toVertex);
        row = indexIs(fromVertex);
        column = indexIs(toVertex);
        edges[row][column] = weight;

    }

    public int weightIs(Object fromVertex, Object toVertex) {
        int row;
        int column;
        row = indexIs(fromVertex);
        column = indexIs(toVertex);
        return edges[row][column];

    }

    public Queue getToVertex(Object vertex) {

        Queue adjVertices = new LinkedList();

        int fromIndex;
        int toIndex;

        fromIndex = indexIs(vertex);
        for (toIndex = 0; toIndex < numVertices; toIndex++) {
            if (edges[fromIndex][toIndex] != NULL_EDGE) {
                adjVertices.add(vertices[toIndex]);
            }
        }

        return adjVertices;
    }

    public boolean isEmpty() {

        if (vertices.length == 0) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isFull() {

        if (vertices.length == maxVertices) {
            return true;
        } else {
            return false;
        }
    }

    public void clearMarks() {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = false;
        }

    }

    public void markVertex(Object vertex) {

        for (int i = 0; i < vertices.length; i++) {
            if (vertex == vertices[i]) {
                marks[i] = true;
            }
        }

    }

    public boolean isMarcked(Object vertex) {

        boolean isMarcked = false;
        for (int i = 0; i < vertices.length; i++) {

            if ((vertex == vertices[i]) == true) {
                isMarcked = true;
            } else {
                isMarcked = false;
            }
        }
        return isMarcked;
    }

}
