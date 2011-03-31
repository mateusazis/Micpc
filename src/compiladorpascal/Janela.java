package compiladorpascal;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * Janela.java
 *
 * Created on 22/03/2011, 21:01:49
 */

/**
 *
 * @author Azis
 */
public class Janela extends javax.swing.JFrame {

    private Mode mode;
    private FileNameExtensionFilter filtroC;
    private FileNameExtensionFilter filtroPascal;

    public Janela() {
        initComponents();
        fileChooser.setDialogTitle("Escolar o arquivo .pas a compilar...");
        fileChooser.setDragEnabled(true);
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
        fileChooser.setCurrentDirectory(fileChooser.getCurrentDirectory());
        filtroC = new FileNameExtensionFilter("Código C ou arquivos executáveis (.c; .exe)", "c", "exe");
        filtroPascal = new FileNameExtensionFilter("Código Pascal ou arquivos executáveis (.pas; .exe)", "pas", "exe");
        alterarModo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        buttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        botaoEscolherExec = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        campoCaminhoExec = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        caixaDeResultado = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        caixaSintaxeComp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        caixaSintaxeExec = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botaoPascal = new javax.swing.JRadioButton();
        botaoC = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        fileChooser.setDragEnabled(true);

        buttonGroup.add(botaoPascal);
        buttonGroup.add(botaoC);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MINI-IDE de compilação Pascal 1.1.1");

        jLabel1.setText("Caminho do arquivo fonte ou executável");

        botaoEscolherExec.setText("Escolher arquivo...");
        botaoEscolherExec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botaoEscolherPressionado(evt);
            }
        });

        jButton2.setText("Compilar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botaoCompilarPressionado(evt);
            }
        });

        jLabel2.setText("Saída da compilação");

        caixaDeResultado.setColumns(20);
        caixaDeResultado.setEditable(false);
        caixaDeResultado.setFont(new java.awt.Font("Tahoma", 0, 11));
        caixaDeResultado.setRows(5);
        jScrollPane1.setViewportView(caixaDeResultado);

        jButton1.setText("Limpar saída");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botaoLimparPressionado(evt);
            }
        });

        jButton3.setText("Executar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                executarPrograma(evt);
            }
        });

        jLabel3.setText("Sintaxe de compilação");

        jLabel4.setText("Sintaxe de execução");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Modo"));

        botaoPascal.setSelected(true);
        botaoPascal.setText("Pascal");
        botaoPascal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPascalPressionado(evt);
            }
        });

        botaoC.setText("C");
        botaoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCPressionado(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoPascal)
                    .addComponent(botaoC))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(botaoPascal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Ajuda");

        jMenuItem1.setText("Sobre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exibirCréditos(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(371, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campoCaminhoExec, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE))
                                                    .addComponent(caixaSintaxeComp, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                                    .addComponent(caixaSintaxeExec, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
                                                .addGap(16, 16, 16)))
                                        .addGap(97, 97, 97))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botaoEscolherExec)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)))))
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCaminhoExec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEscolherExec))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(caixaSintaxeComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caixaSintaxeExec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEscolherPressionado(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoEscolherPressionado
        fileChooser.showOpenDialog(this);
        File f = fileChooser.getSelectedFile();
        try{
            campoCaminhoExec.setText(f.getPath());
        } catch(NullPointerException e){}
    }//GEN-LAST:event_botaoEscolherPressionado

    private void botaoCompilarPressionado(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCompilarPressionado
        compilarPrograma();
    }//GEN-LAST:event_botaoCompilarPressionado

    private void botaoLimparPressionado(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoLimparPressionado
        caixaDeResultado.setText("");
    }//GEN-LAST:event_botaoLimparPressionado

    private void executarPrograma(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_executarPrograma
        String caminho = campoCaminhoExec.getText();
        String extensaoFonte;
        if(mode == Mode.PASCAL)
            extensaoFonte = ".pas";
        else
            extensaoFonte = ".c";
        if(caminho.endsWith(extensaoFonte)){
            caminho = caminho.substring(0, caminho.length() - extensaoFonte.length());
            caminho += ".exe";
        }
        try{
            Runtime.getRuntime().exec("cmd /c start " + caminho);
        } catch(Exception e){
            exibirErro(e.toString());
        }

    }//GEN-LAST:event_executarPrograma

    private void exibirErro(String errorDescription){
        JOptionPane.showMessageDialog(this, "Houve um erro:\n" + errorDescription, "Erro!!!", JOptionPane.ERROR_MESSAGE);
    }

    private void alterarModo(){
        fileChooser.resetChoosableFileFilters();
        if(botaoPascal.isSelected()){
            mode = Mode.PASCAL;
            fileChooser.setFileFilter(filtroPascal);
            caixaSintaxeComp.setText("fpc <nome_do_arquivo>");
            caixaSintaxeExec.setText("start <nome_do_arquivo>");
        }
        else{
            mode = Mode.C;
            fileChooser.setFileFilter(filtroC);
            caixaSintaxeComp.setText("gcc <nome_do_arquivo> -o <nome_do_executavel>");
            caixaSintaxeExec.setText("start <nome_do_arquivo>");
        }
    }

    private void botaoPascalPressionado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPascalPressionado
        // TODO add your handling code here:
        alterarModo();
    }//GEN-LAST:event_botaoPascalPressionado

    private void botaoCPressionado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCPressionado
        // TODO add your handling code here:
        alterarModo();
    }//GEN-LAST:event_botaoCPressionado

    private void exibirCréditos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exibirCréditos
        // TODO add your handling code here:
        String mensagem = "Mini-IDE de Compilação e Execução para Pascal e C";
        mensagem += "\n©Mateus Azis (aka Lord_X) 27/03/2011";
        mensagem += "\nContato: lordx2@gmail.com";
        mensagem += "\nLicença: Open Source";
        JOptionPane.showMessageDialog(this, mensagem, "Sobre este programa", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_exibirCréditos

    private String nomeExecutavel(String caminho){
        String retorno = caminho.substring(0, caminho.length() - mode.extensao.length());
        return retorno + ".exe";
    }

    private void compilarPrograma(){
        Process p;
        String comando = caixaSintaxeComp.getText();
        comando = comando.replaceAll("<nome_do_arquivo>", Matcher.quoteReplacement(campoCaminhoExec.getText()));
        comando = comando.replaceAll("<nome_do_executavel>", Matcher.quoteReplacement(nomeExecutavel(campoCaminhoExec.getText())));
        try{
            p = Runtime.getRuntime().exec(comando);
            exibirProcesso(p);
            if(mode == Mode.C || p.exitValue() == 0)
                caixaDeResultado.append("Compilado com sucesso (esta saída não foi gerada pelo compilador).");
            caixaDeResultado.append("\n");
        } catch(Exception e){
            exibirErro(e.toString());
        }
    }

    private void exibirProcesso(Process p){
        Scanner outputScanner = new Scanner(p.getInputStream());
        Scanner errorScanner = new Scanner(p.getErrorStream());
        while(outputScanner.hasNextLine())
            caixaDeResultado.append(outputScanner.nextLine() + "\n");
        while(errorScanner.hasNextLine())
            caixaDeResultado.append(errorScanner.nextLine() + "\n");
        outputScanner.close();
        errorScanner.close();
    }

    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e){
            System.err.println("Erro ao definir skin do sistema.");
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botaoC;
    private javax.swing.JButton botaoEscolherExec;
    private javax.swing.JRadioButton botaoPascal;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JTextArea caixaDeResultado;
    private javax.swing.JTextField caixaSintaxeComp;
    private javax.swing.JTextField caixaSintaxeExec;
    private javax.swing.JTextField campoCaminhoExec;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
