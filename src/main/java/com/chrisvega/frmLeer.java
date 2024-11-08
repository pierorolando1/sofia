package com.chrisvega;

import com.chrisvega.IdLexer;
import com.chrisvega.ParserSym;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import javax.swing.JFileChooser;
import java.io.StringReader;
import java.awt.Color;
import java_cup.runtime.Scanner;
import java_cup.runtime.Symbol;

public class frmLeer extends javax.swing.JFrame {

    /**
     * Creates new form frmLeer
     */
    public frmLeer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ButtonAbrir = new javax.swing.JButton();
        ButtonAnalizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        VerArchivo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        VerAnalisis = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        VerSint = new javax.swing.JTextArea();
        ButtonSint = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 102));

        jLabel1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel1.setText("LÉXICO");

        ButtonAbrir.setText("ABRIR ARCHIVO");
        ButtonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAbrirActionPerformed(evt);
            }
        });

        ButtonAnalizar.setText("ANALIZAR");
        ButtonAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAnalizarActionPerformed(evt);
            }
        });

        VerArchivo.setColumns(20);
        VerArchivo.setRows(5);
        jScrollPane1.setViewportView(VerArchivo);

        VerAnalisis.setColumns(20);
        VerAnalisis.setRows(5);
        jScrollPane2.setViewportView(VerAnalisis);

        jButton3.setText("LIMPIAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ButtonAbrir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonAnalizar)
                        .addGap(65, 65, 65)
                        .addComponent(jButton3)
                        .addGap(29, 29, 29))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(116, 116, 116))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAbrir)
                    .addComponent(ButtonAnalizar)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel2.setText("SINTÁCTICO");

        VerSint.setColumns(20);
        VerSint.setRows(5);
        jScrollPane3.setViewportView(VerSint);

        ButtonSint.setText("ANALIZAR");
        ButtonSint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSintActionPerformed(evt);
            }
        });

        jButton2.setText("LIMPIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(103, 103, 103))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(ButtonSint)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSint)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("ANALIZADOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(372, 372, 372))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAbrirActionPerformed
        // TODO add your handling code here:
    
    JFileChooser chooser = new JFileChooser();
    chooser.showOpenDialog(jPanel2);
    File archivoSeleccionado = chooser.getSelectedFile();
    
    if (archivoSeleccionado != null) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivoSeleccionado));
            String linea;
            StringBuilder contenido = new StringBuilder();
            while ((linea = reader.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
            reader.close();
            VerArchivo.setText(contenido.toString());
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        } catch (IOException ex) {
            System.out.println("Error leyendo el archivo");
        }
    } else {
        System.out.println("No seleccionó archivo");
    }
    }//GEN-LAST:event_ButtonAbrirActionPerformed

    private void ButtonAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAnalizarActionPerformed

        String textoAAnalizar = VerArchivo.getText(); 

        if (textoAAnalizar.isEmpty()) {
            //JOptionPane.showMessageDialog(this, "No hay texto en el área para analizar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            Reader reader = new BufferedReader(new StringReader(textoAAnalizar)); 
            IdLexer lexer = new IdLexer(reader);
            StringBuilder resultados = new StringBuilder();

            while (true) {
                Symbol tokens = lexer.next_token();
                if (tokens.sym == ParserSym.EOF) {
                    resultados.append("FIN");
                    VerAnalisis.setText(resultados.toString()); // Mostrar los resultados en VerAnalisis
                    return;
                }
                switch (tokens.sym) {
                    case ParserSym.error:
                        resultados.append("NO DEFINIDO\n");
                        break;
                    case ParserSym.DEFINE_SPACE:
                        resultados.append("[ defineSpace : DEFINE_SPACE ]\n");
                        break;
                    case ParserSym.DEFINE_CAR:
                        resultados.append("[ defineCar : DEFINE_CAR ]\n");
                        break;
                    case ParserSym.USE_SPACE:
                        resultados.append("[ useSpace : USE_SPACE ]\n");
                        break;
                    case ParserSym.USE_CAR:
                        resultados.append("[ useCar : USE_CAR ]\n");
                        break;
                    case ParserSym.SET_DIRECTION:
                        resultados.append("[ setDirectionVector : SET_DIRECTION ]\n");
                        break;
                    case ParserSym.MOVE_FORWARD:
                        resultados.append("[ moveForward : MOVE_FORWARD ]\n");
                        break;
                    case ParserSym.STOP:
                        resultados.append("[ stop : STOP ]\n");
                        break;
                    case ParserSym.ROTATE:
                        resultados.append("[ rotate : ROTATE ]\n");
                        break;
                    case ParserSym.MOVE_FORWARD_STOP:
                        resultados.append("[ moveForwardAndStop : MOVE_FORWARD_STOP ]\n");
                        break;
                    case ParserSym.IDENTIFIER:
                        resultados.append("[ ").append(lexer.yytext()).append(" : IDENTIFIER ]\n");
                        break;
                    case ParserSym.NUMBER:
                        resultados.append("[ ").append(lexer.yytext()).append(" : NUMBER ]\n");
                        break;
                    case ParserSym.ASSIGN:
                        resultados.append("[ = : ASSIGN ]\n");
                        break;
                    case ParserSym.LPAREN:
                        resultados.append("[ ( : LPAREN ]\n");
                        break;
                    case ParserSym.RPAREN:
                        resultados.append("[ ) : RPAREN ]\n");
                        break;
                    case ParserSym.COMMA:
                        resultados.append("[ , : COMMA ]\n");
                        break;
                    case ParserSym.SEMICOLON:
                        resultados.append("[ ; : SEMICOLON ]\n");
                        break;
                    default:
                        resultados.append("[ Token: ").append(tokens.sym).append(" ]\n");
                        break;
                }
            }
        } catch (IOException ex) {
            //JOptionPane.showMessageDialog(this, "Error procesando el texto.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_ButtonAnalizarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        VerAnalisis.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ButtonSintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSintActionPerformed
        // TODO add your handling code here:
        String cadena = VerArchivo.getText();
        
        

        
        Parser p = new Parser(new IdLexer(new StringReader(cadena)));
        try{
            p.parse();
            VerSint.setText("Análisis Exitoso");
            VerSint.setForeground(Color.BLUE);
        }catch (Exception ex){
            Symbol symbol = getErrorSymbol(p);
            if (symbol != null) {
                String errorMessage = "Error encontrado en línea " + (symbol.right + 1) +
                                      ", Columna " + (symbol.left + 1) +
                                      ", Valor: " + symbol.value;
                VerSint.setText(errorMessage);
            } else {
                VerSint.setText("Error de análisis desconocido");
            }
            VerSint.setForeground(Color.RED);
        }
    }//GEN-LAST:event_ButtonSintActionPerformed

        private Symbol getErrorSymbol(Parser parser) {
        try {
            // Obtener símbolo de error en caso de análisis fallido
            return parser.getSymbolFactory().newSymbol("error", 0, null, null);
        } catch (Exception e) {
            return null;  // Retorna nulo si no se puede obtener el símbolo
        }
    }

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        VerAnalisis.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmLeer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLeer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLeer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLeer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLeer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAbrir;
    private javax.swing.JButton ButtonAnalizar;
    private javax.swing.JButton ButtonSint;
    private javax.swing.JTextArea VerAnalisis;
    private javax.swing.JTextArea VerArchivo;
    private javax.swing.JTextArea VerSint;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
