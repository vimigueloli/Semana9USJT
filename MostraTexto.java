import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.SwingUtilities;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MostraTexto extends JFrame implements ActionListener{
   private JLabel digite;
   private JTextField campo;
   private JButton botao;
   private JButton botao1;
   private JButton botao2;
   Toolkit tk = Toolkit.getDefaultToolkit();
   Dimension d = tk.getScreenSize();
   private int telaW= d.width;
   private int telaH= d.height;
   private int centroW = telaW/2;
   private int centroH = telaH/2; 
   private Container tela;
   
   
   public MostraTexto(){
      super ("Aplicativo");
      Toolkit tk = Toolkit.getDefaultToolkit();
      Dimension d = tk.getScreenSize();
      telaW= d.width;
      telaH= d.height;
      centroW = telaW/2;
      centroH = telaH/2;
      int unidade= telaW/25;
      
      campo= new JTextField("");
      digite= new JLabel("digite:");
      botao= new JButton("Mostrar");
     botao1= new JButton("Limpar");
     botao2= new JButton("sair");
      
      tela= getContentPane();
      tela.setLayout(null);
      
      campo.setBounds(centroW-(3*unidade/2),centroH/2,unidade*3,unidade*1);
      digite.setBounds(centroW-(unidade/4),centroH/3,unidade,unidade);
      botao.setBounds(centroW-(3*unidade/2),centroH-unidade,unidade*3,unidade);
      botao1.setBounds(centroW-(3*unidade/2),centroH-2*unidade,unidade*3,unidade);
      botao2.setBounds(centroW-(3*unidade/2),centroH,unidade*3,unidade);
      
      
      botao.addActionListener(this);
      botao1.addActionListener(this);
      botao2.addActionListener(this);
      
      
      tela.add(campo);
      tela.add(digite);
      tela.add(botao);
      tela.add(botao1);
      tela.add(botao2);
      
      setSize(telaW,telaH);//tela do tamanho da tela do usuario
      setExtendedState(JFrame.MAXIMIZED_BOTH);//tela cheia
      setLayout(null);
      setVisible(true); 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fecha a aplicacao   
         
      
   }
   
   
   public void actionPerformed(ActionEvent e){
      if(e.getSource() == botao){
      
         JOptionPane.showMessageDialog(null,"Voce digitou: " + campo.getText());
         
      }
      if(e.getSource() == botao1){
      
         campo.setText("");
         
      }
      if(e.getSource() == botao2){
      
         System.exit(0);	
         
      }
   }
   
   
   public static void main (String [] args){
         SwingUtilities.invokeLater (new Runnable (){
            public void run (){
               new MostraTexto();//coloca o nome do arquivo no lugar de PadraoTelas
            }
         });
      }

   
}


