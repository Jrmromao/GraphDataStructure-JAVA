package graphassignment_cs;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import javax.swing.JOptionPane;

public class GraphAssignment_CS_CUI extends javax.swing.JFrame {

    public WeightedGraph graph = new WeightedGraph();
    public static ArrayList<Object> VertexList = new ArrayList();
    public static ArrayList cost = new ArrayList();

    public static boolean BreathFirstSearch(WeightedGraph graph, Object startVertex, Object endVertex) {

        Queue queue = new LinkedList();
        Queue VertexQueue = new LinkedList();
        Object vertex;
        Object item;
        boolean found = false;
        graph.clearMarks();
        queue.add(startVertex);
        do {
            vertex = queue.poll();
            if (vertex.equals(endVertex)) {
                VertexList.add(vertex);
                cost.add(graph.weightIs(startVertex, vertex));
                found = true;
            } else if (!graph.isMarcked(vertex)) {
                graph.markVertex(vertex);
                VertexList.add(vertex);
                VertexQueue = graph.getToVertex(vertex);
                cost.add(graph.weightIs(startVertex, vertex));
                while (!VertexQueue.isEmpty()) {
                    item = VertexQueue.poll();
                    if (!graph.isMarcked(item)) {
                        queue.add(item);
                    }
                }
            }
        } while (!queue.isEmpty() && !found);

        if (found == true) {
            return true;
        } else {
            return false;
        }
    }

    public GraphAssignment_CS_CUI() {
        initComponents();

        graph.addEdge("Austin", "Dallas", 200);
        graph.addEdge("Dallas", "Austin", 200);
        graph.addEdge("Dallas", "Denver", 900);
        graph.addEdge("Chicago", "Denver",1000 );
        graph.addEdge("Denver", "Chicago", 1000);
        graph.addEdge("Washington", "Dallas", 1300);
        graph.addEdge("Atlanta", "Washington", 600);
        graph.addEdge("Washington", "Atlanta", 600);
        graph.addEdge("Austin", "Huston", 160);
        graph.addEdge("Atlanta", "Huston", 800);
        graph.addEdge("Huston", "Atlanta", 800);
        graph.addEdge("Austin", "Lisbon", 300);

        flightSchedulle_jTextArea1.setText(graph.display());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        departure_lbl = new javax.swing.JLabel();
        departure_txtbox = new javax.swing.JTextField();
        arrival_txtbox = new javax.swing.JTextField();
        arrival_lbl = new javax.swing.JLabel();
        distance_txtbox = new javax.swing.JTextField();
        distance_lbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        flightSchedulle_jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        flightInfo_jTextArea2 = new javax.swing.JTextArea();
        addNewFlight_btn = new javax.swing.JButton();
        exit_btn = new javax.swing.JButton();
        seekFlight_btn = new javax.swing.JButton();
        deleteFlight_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        departure_lbl.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        departure_lbl.setText("Departure Airport");

        arrival_lbl.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        arrival_lbl.setText("Arrival Airport");

        distance_lbl.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        distance_lbl.setText("Distance");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Flight Schedulle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        flightSchedulle_jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        flightSchedulle_jTextArea1.setColumns(20);
        flightSchedulle_jTextArea1.setRows(5);
        jScrollPane1.setViewportView(flightSchedulle_jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Flight Schedulle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        flightInfo_jTextArea2.setBackground(new java.awt.Color(204, 204, 204));
        flightInfo_jTextArea2.setColumns(20);
        flightInfo_jTextArea2.setRows(5);
        jScrollPane2.setViewportView(flightInfo_jTextArea2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        addNewFlight_btn.setText("Add New Flight");
        addNewFlight_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewFlight_btnActionPerformed(evt);
            }
        });

        exit_btn.setText("Exit");
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
            }
        });

        seekFlight_btn.setText("Seek Flight");
        seekFlight_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seekFlight_btnActionPerformed(evt);
            }
        });

        deleteFlight_btn.setText("Delete Flight");
        deleteFlight_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFlight_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addNewFlight_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seekFlight_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(arrival_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departure_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(distance_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arrival_txtbox, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(departure_txtbox)
                    .addComponent(distance_txtbox)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(deleteFlight_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exit_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departure_lbl)
                    .addComponent(departure_txtbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arrival_lbl)
                    .addComponent(arrival_txtbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(distance_lbl)
                    .addComponent(distance_txtbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNewFlight_btn)
                    .addComponent(seekFlight_btn)
                    .addComponent(deleteFlight_btn)
                    .addComponent(exit_btn))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_btnActionPerformed


    private void addNewFlight_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewFlight_btnActionPerformed

        String departure = departure_txtbox.getText();
        String arrival = arrival_txtbox.getText();
        int distance = Integer.parseInt(distance_txtbox.getText());
        graph.addEdge(departure, arrival, distance);

        flightSchedulle_jTextArea1.setText(graph.display());
    }//GEN-LAST:event_addNewFlight_btnActionPerformed

    private void deleteFlight_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFlight_btnActionPerformed

        String departure = departure_txtbox.getText();
        String arrival = arrival_txtbox.getText();

        graph.setEdgeToZero(departure, arrival);
        flightSchedulle_jTextArea1.setText(graph.display());

    }//GEN-LAST:event_deleteFlight_btnActionPerformed

    
    
    private void seekFlight_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seekFlight_btnActionPerformed

        String departure = departure_txtbox.getText();
        String arrival = arrival_txtbox.getText();
        String noPath = "No path Available between " + departure + " and " + arrival;
        String path = "Yes, there is a path between" + departure + " and " + arrival;
        String flightInfo = "FLIGHT PATH: \n";

        if (BreathFirstSearch(graph, departure, arrival)) {
            for (int i = 0; i < VertexList.size(); i++) {
                flightInfo += VertexList.get(i) + "\n";
            }
            flightInfo_jTextArea2.setText(flightInfo);

            //flightInfo_jTextArea2.setText(path);
        } else {
            flightInfo_jTextArea2.setText(noPath);
        }

        VertexList.clear();
        //flightInfo_jTextArea2.setText(" ");


    }//GEN-LAST:event_seekFlight_btnActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GraphAssignment_CS_CUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraphAssignment_CS_CUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraphAssignment_CS_CUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraphAssignment_CS_CUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraphAssignment_CS_CUI().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewFlight_btn;
    private javax.swing.JLabel arrival_lbl;
    private javax.swing.JTextField arrival_txtbox;
    private javax.swing.JButton deleteFlight_btn;
    private javax.swing.JLabel departure_lbl;
    private javax.swing.JTextField departure_txtbox;
    private javax.swing.JLabel distance_lbl;
    private javax.swing.JTextField distance_txtbox;
    private javax.swing.JButton exit_btn;
    private javax.swing.JTextArea flightInfo_jTextArea2;
    private javax.swing.JTextArea flightSchedulle_jTextArea1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton seekFlight_btn;
    // End of variables declaration//GEN-END:variables
}
