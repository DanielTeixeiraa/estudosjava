package BatleAnime;

import BatleAnime.Bots;
import BatleAnime.Personagens;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Random;

public class LutaInterface extends javax.swing.JFrame {

    ImageIcon icon3 = new ImageIcon("src/BatleAnime/Imagens/a2.png");
    ImageIcon icon4 = new ImageIcon("src/BatleAnime/Imagens/b2.png");
    ImageIcon icon5 = new ImageIcon("src/BatleAnime/Imagens/a2.png");
    ImageIcon icon6 = new ImageIcon("src/BatleAnime/Imagens/a2.png");
    ImageIcon fundo = new ImageIcon("src/BatleAnime/Imagens/fundo.jpg");
    ImageIcon vida = new ImageIcon("src/BatleAnime/Imagens/hp.png");
    ImageIcon man = new ImageIcon("src/BatleAnime/Imagens/mana.png");
    ImageIcon arena = new ImageIcon("src/BatleAnime/Imagens/arena.jpg");

    Font font = new Font("Courier New", Font.PLAIN, 11);
    Random gerador = new Random();
    AnimeInterface ai = new AnimeInterface();
    String hb1, hb2, hb3;
    static Personagens pp1;
    static Bots bb1;
    static int y, x;

    public void att() {
        jLabel2.setText(Integer.toString(pp1.getHp()));
        jLabel3.setText(Integer.toString(pp1.getMana()));
        jLabel6.setText(Integer.toString(bb1.getHp()));
        jLabel7.setText(Integer.toString(bb1.getMana()));
    }

    public void defesaPlayer() {
        pp1.setMana(pp1.getMana() + 1);
        switch (y) {
            case 1:
                pp1.setHp(pp1.getHp() + 50);
                danoBot();
                JOptionPane.showMessageDialog(null, "VOCE SE DEFENDEU 50 DE DANO");
                break;
            case 2:
                pp1.setHp(pp1.getHp() + 100);
                danoBot();
                JOptionPane.showMessageDialog(null, "VOCE SE DEFENDEU 100 DE DANO");
                break;
            case 3:
                pp1.setHp(pp1.getHp() + 150);
                danoBot();
                JOptionPane.showMessageDialog(null, "VOCE SE DEFENDEU 150 DE DANO");
                break;
            case 0:
                danoBot();
        }
    }

    public void danoPlayer() {
        if (pp1.getMana() <= 0) {
            JOptionPane.showMessageDialog(null, "SUA MANA ACABOU. SE DEFENDENDO AUTOMATICAMENTE");
            x = 4;
        }
        if (bb1.getMana() <= 0) {
            y = 0;
        } else if (bb1.getMana() == 1) {
            y = gerador.nextInt(2);
        } else if (bb1.getMana() < 3 && bb1.getMana() > 0) {
            y = gerador.nextInt(3);
        } else {
            y = gerador.nextInt(4);
        }

        switch (x) {
            case 1:
                bb1.setHp(bb1.getHp() - 100);
                pp1.setMana(pp1.getMana() - 1);
                JOptionPane.showMessageDialog(null, "VOCE DEU 100 DE DANO");
                danoBot();
                att();
                break;
            case 2:
                if (pp1.getMana() >= 2) {
                    bb1.setHp(bb1.getHp() - 200);
                    pp1.setMana(pp1.getMana() - 2);
                    JOptionPane.showMessageDialog(null, "VOCE DEU 200 DE DANO");
                    danoBot();
                    att();
                    break;
                }
                JOptionPane.showMessageDialog(null, "MANA INSUFICIENTE");
                break;
            case 3:
                if (pp1.getMana() >= 3) {
                    bb1.setHp(bb1.getHp() - 300);
                    pp1.setMana(pp1.getMana() - 3);
                    JOptionPane.showMessageDialog(null, "VOCE DEU 300 DE DANO");
                    danoBot();
                    att();
                    break;
                }
                JOptionPane.showMessageDialog(null, "MANA INSUFICIENTE");
                break;
            case 4:
                defesaPlayer();
                att();
        }

    }

    public void defesaBot() {
        bb1.setMana(bb1.getMana() + 1);
        switch (x) {
            case 1:
                bb1.setHp(bb1.getHp() + 50);
                JOptionPane.showMessageDialog(null, "O BOT SE DEFENDEU 50 DE DANO");
                break;
            case 2:
                bb1.setHp(bb1.getHp() + 100);
                JOptionPane.showMessageDialog(null, "O BOT VOCE SE DEFENDEU 100 DE DANO");
                break;
            case 3:
                bb1.setHp(bb1.getHp() + 150);
                JOptionPane.showMessageDialog(null, "O BOT VOCE SE DEFENDEU 150 DE DANO");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "NIGUEM LEVOU DANO");
                break;
        }
    }

    public void danoBot() {
        switch (y) {
            case 0:
                defesaBot();
                break;
            case 1:
                pp1.setHp(pp1.getHp() - 100);
                bb1.setMana(bb1.getMana() - 1);
                JOptionPane.showMessageDialog(null, "O BOT DEU 100 DE DANO");
                break;
            case 2:
                pp1.setHp(pp1.getHp() - 200);
                bb1.setMana(bb1.getMana() - 2);
                JOptionPane.showMessageDialog(null, "O BOT  DEU 200 DE DANO");
                break;
            case 3:
                pp1.setHp(pp1.getHp() - 300);
                bb1.setMana(bb1.getMana() - 3);
                JOptionPane.showMessageDialog(null, "O BOT  DEU 300 DE DANO");
                break;
        }
    }

    public LutaInterface() {
        initComponents();
        setSize(820,620);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton6.setVisible(false);
        jButton4.setVisible(false);
    }

    public void Dados(Personagens p1, Bots b1) {
        LutaInterface.pp1 = p1;
        LutaInterface.bb1 = b1;
        arena.setImage(arena.getImage().getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(), 0));
        jLabel8.setIcon(arena);
        vida.setImage(vida.getImage().getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), 0));
        jLabel9.setIcon(vida);
        man.setImage(man.getImage().getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), 0));
        jLabel10.setIcon(man);
        vida.setImage(vida.getImage().getScaledInstance(jLabel11.getWidth(), jLabel11.getHeight(), 0));
        jLabel11.setIcon(vida);
        man.setImage(man.getImage().getScaledInstance(jLabel12.getWidth(), jLabel12.getHeight(), 0));
        jLabel12.setIcon(man);

        String hp = Integer.toString(LutaInterface.pp1.hp);
        jLabel1.setText(LutaInterface.pp1.nome);
        jLabel2.setText(Integer.toString(LutaInterface.pp1.getHp()));
        jLabel3.setText(Integer.toString(LutaInterface.pp1.getMana()));
        jLabel5.setText(b1.nome);
        jLabel6.setText(Integer.toString(LutaInterface.bb1.getHp()));
        jLabel7.setText(Integer.toString(LutaInterface.bb1.getMana()));
        hb1 = LutaInterface.pp1.getHb1();
        hb2 = LutaInterface.pp1.getHb2();
        hb3 = LutaInterface.pp1.getHb3();

        LutaInterface.pp1 = p1;
        LutaInterface.bb1 = b1;

        if ("Luffy".equals(p1.getNome())) {
            icon3.setImage(icon3.getImage().getScaledInstance(per.getWidth(), per.getHeight(), 1));
            per.setIcon(icon3);
        } else if ("Goku".equals(p1.getNome())) {
            icon4.setImage(icon4.getImage().getScaledInstance(per.getWidth(), per.getHeight(), 1));
            per.setIcon(icon4);
        }
        if ("Luffy".equals(b1.getNome())) {
            icon3.setImage(icon3.getImage().getScaledInstance(bot.getWidth(), bot.getHeight(), 1));
            bot.setIcon(icon3);
        } else if ("Goku".equals(b1.getNome())) {
            icon4.setImage(icon4.getImage().getScaledInstance(bot.getWidth(), bot.getHeight(), 1));
            bot.setIcon(icon4);
        }

    }

    public void fim() {
        if (bb1.getHp() <= 0) {
            JOptionPane.showMessageDialog(null, " FIM DE JOGO " + pp1.nome + "(JOGADOR) GANHOU");
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?");
            if (resposta == JOptionPane.YES_OPTION) {
                ai.setVisible(true);
            } else if (resposta == JOptionPane.NO_OPTION) {
                System.exit(0);
            } else {
            }
        }
        if (pp1.getHp() <= 0) {
            JOptionPane.showMessageDialog(null, " FIM DE JOGO " + pp1.nome + "(BOT) GANHOU");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        per = new javax.swing.JLabel();
        bot = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("HP");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 30, 70, 31);

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("MANA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 70, 79, 30);

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("PERSONAGEM");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 0, 100, 17);

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("BOT");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(510, 0, 40, 28);

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("HP");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(560, 40, 30, 19);

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("MANA");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(560, 70, 40, 14);

        per.setText("Personagem");
        getContentPane().add(per);
        per.setBounds(52, 200, 149, 228);

        bot.setText("BOT");
        getContentPane().add(bot);
        bot.setBounds(642, 200, 148, 228);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("VS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 253, 90, 110);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton1.setText("jButton4");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 390, 212, 51);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton2.setText("jButton5");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(300, 460, 212, 54);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton6.setText("jButton6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(300, 530, 212, 50);

        jButton3.setText("INICIAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(350, 220, 105, 64);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton4.setText("DEFESA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(20, 530, 212, 54);

        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(480, 20, 50, 40);

        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(480, 60, 50, 50);

        jLabel11.setText("jLabel9");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(130, 20, 50, 40);

        jLabel12.setText("jLabel10");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(130, 60, 50, 50);

        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 860, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        x = 1;
        danoPlayer();
        fim();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton1.setText(hb1);
        jButton2.setText(hb2);
        jButton6.setText(hb3);
        jButton1.setFont(font);
        jButton2.setFont(font);
        jButton6.setFont(font);
        jButton4.setFont(font);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton6.setVisible(true);
        jButton4.setVisible(true);
        jButton3.setVisible(false);


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        x = 3;
        danoPlayer();
        fim();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        x = 2;
        danoPlayer();
        fim();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        x = 4;
        danoPlayer();
        fim();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new LutaInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bot;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    private javax.swing.JLabel per;
    // End of variables declaration//GEN-END:variables
}
