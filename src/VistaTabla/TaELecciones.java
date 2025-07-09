package VistaTabla;
import Clases.*;
import Registro.*;
import Igu.*;
import javax.swing.table.DefaultTableModel;

public class TaELecciones extends javax.swing.JFrame {

    private Registro_Elecciones regEleccion;
    private DefaultTableModel modelTaEleccion;
    
    public TaELecciones() {
        initComponents();
    }
    
    public TaELecciones(Registro_Elecciones regEleccion){
        initComponents();
        this.regEleccion = regEleccion;
        modelTaEleccion = new DefaultTableModel();
        this.taElecciones.setModel(modelTaEleccion);
        
        
        
        modelTaEleccion.addColumn("Número");
        modelTaEleccion.addColumn("Tipo");
        modelTaEleccion.addColumn("Fecha");
        
        rellenarTabla();
    }
    
    private void rellenarTabla(){
        
        Eleccion[] elec = regEleccion.getElecciones();
        
        for (int i = 0; i < regEleccion.longitud(); i++) {
            
            String tipo = elec[i].getTipoEleccion();
            String fecha = elec[i].getFecha();
            int aux = i + 1;
            String alfa = aux + "";
            
            String[] fila = new String[3];
            
            fila[0] = alfa;
            fila[1] = tipo;
            fila[2] = fecha;
            
            this.modelTaEleccion.addRow(fila);
            
            
            
        }
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taElecciones = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();
        btnElimina = new javax.swing.JButton();
        btnModifica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tabla de Elecciones");

        taElecciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(taElecciones);

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnElimina.setText("Eliminar");
        btnElimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaActionPerformed(evt);
            }
        });

        btnModifica.setText("Modifica");
        btnModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnModifica)
                                .addGap(61, 61, 61)
                                .addComponent(btnElimina)
                                .addGap(69, 69, 69)
                                .addComponent(btnCerrar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar)
                    .addComponent(btnElimina)
                    .addComponent(btnModifica))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnEliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaActionPerformed
        
        int filaSeleccionada = taElecciones.getSelectedRow();

        regEleccion.eliminarEleccion(filaSeleccionada);
        modelTaEleccion.setRowCount(0);
        rellenarTabla();
        
        
        
        
    }//GEN-LAST:event_btnEliminaActionPerformed

    private void btnModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaActionPerformed
        int filaSeleccionada = taElecciones.getSelectedRow();
        Modifcar modi = new Modifcar(regEleccion, filaSeleccionada);
        modi.setVisible(true);
        modi.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnModificaActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnElimina;
    private javax.swing.JButton btnModifica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable taElecciones;
    // End of variables declaration//GEN-END:variables
}
