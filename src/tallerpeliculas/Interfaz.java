package tallerpeliculas;
//@autor Alex Payome
import java.util.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

public class Interfaz extends JFrame implements ActionListener{
    int numEntradas=0;
    JPanel p1, p2, p3;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, bc, bs;
    JTextField t1, ts;
    JLabel l0, l1;
    JTextArea a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
    
    Pelicula ae = new Pelicula(1,"Avengers: Endgame", "Anthony y Joe Russo", 2019, "Los Vengadores restantes deben encontrar una manera de recuperar a sus aliados para un enfrentamiento épico con Thanos, el malvado que diezmó el planeta y el universo.",0);
    Pelicula av = new Pelicula(2,"Avatar", "James Cameron", 2009, "En un exuberante planeta llamado Pandora viven los Na'vi, seres que aparentan ser primitivos pero que en realidad son muy evolucionados. Debido a que el ambiente "
            + "\nde Pandora es venenoso, los híbridos humanos/Na'vi, llamados Avatares, están relacionados con las mentes humanas, lo que les permite moverse libremente por Pandora. "
            + "\nJake Sully, un exinfante de marina paralítico se transforma a través de un Avatar, y se enamora de una mujer Na'vi.", 0);
    Pelicula ti = new Pelicula(3,"Titanic", "James Cameron", 1997, "Una joven de la alta sociedad abandona a su arrogante pretendiente por un artista humilde en el trasatlántico que se hundió durante su viaje inaugural.",0 );
    Pelicula st = new Pelicula(4,"Star Wars: Episodio VII - El despertar de la Fuerza", "J. J. Abrams", 2015, "Treinta años después de haber derrotado al Imperio, una nueva amenaza se cierne sobre la República. El terrible y enigmático guerrero Kylo Ren ha reunido un ejército"
            + "\nde leales al Imperio, que se hace llamar la Primera Orden y ataca a la Alianza. La única esperanza para la galaxia es que una recogedora de chatarra, un stromtrooper "
            + "\nfugado y un androide llamado BB-8 logren encontrar a tiempo al legendario jedi Luke Skywalker.",0 );
    Pelicula ai = new Pelicula(5,"Avengers: Infinity war", "Anthony y Joe Russo", 2018, "Los superhéroes se alían para vencer al poderoso Thanos, el peor enemigo al que se han enfrentado. Si Thanos logra reunir las seis gemas del infinito: poder, tiempo, "
            + "\nalma, realidad, mente y espacio, nadie podrá detenerlo.",0 );
    Pelicula jw = new Pelicula(6,"Jurassic World", "Colin Trevorrow", 2015, "Una nueva especie de dinosaurio, creada por los científicos de forma artificial y claramente más inteligente y peligrosa que los animales conocidos, "
            + "\nataca a los turistas que visitan el parque temático \"Jurassic World\", situado en una isla frente a Costa Rica.",0 );
    Pelicula rl = new Pelicula(7,"El rey león", "Jon Favreau", 2019, "Tras el asesinato de su padre, Simba, un joven león es apartado su reino y tendrá que descubrir con ayuda de amigos de la sabana africana el significado de la"
            + "\nresponsabilidad y la valentía. Más tarde volverá para recuperar el control de su reino.",0 );
    Pelicula ta = new Pelicula(8,"The avengers", "Joss Whedon", 2012, "El director de la Agencia SHIELD decide reclutar a un equipo para salvar al mundo de un desastre casi seguro cuando un enemigo inesperado surge como una "
            + "\ngran amenaza para la seguridad mundial.",0 );
    Pelicula f2 = new Pelicula(9,"Frozen 2", "Chris Buck, Jennifer Lee", 2019, "Elsa tiene un poder extraordinario: es capaz de crear hielo y nieve. Sin embargo, a pesar de lo feliz que la hacen los habitantes de Arendelle, "
            + "\nsiente que no encaja allá. Después de oír una voz misteriosa, Elsa, acompañada por Anna, Kristoff, Olaf y Sven, viaja a los bosques embrujados y los mares "
            + "\noscuros que se extienden más allá de los límites de su reino para descubrir quién es en realidad y por qué posee un poder tan asombroso.",0 );
    Pelicula jk = new Pelicula(10,"Joker", "Todd Phillips", 2019, "Arthur Fleck adora hacer reír a la gente, pero su carrera como comediante es un fracaso. El repudio social, la marginación y una serie de trágicos "
            + "\nacontecimientos lo conducen por el sendero de la locura y, finalmente, cae en el mundo del crimen.",0 );
    
    ArrayList list = new ArrayList();
    public Interfaz(){
    setBounds(0, 0, 1400, 350);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    p1=new JPanel();
    p1.setLayout(new FlowLayout());
    p1.setSize(300, 350);
    p1.setBorder(javax.swing.BorderFactory.createTitledBorder("Películas"));
    p2=new JPanel();
    p2.setSize(700, 350);
    p2.setLayout(new FlowLayout());
    p2.setBorder(javax.swing.BorderFactory.createTitledBorder("Información película"));
    p3=new JPanel();
    p3.setLayout(new FlowLayout());
    p3.setBorder(javax.swing.BorderFactory.createTitledBorder("Voletas Vendidas en total"));
    
    b1=new JButton(ae.getNombre());
    b1.addActionListener(this);
    b2=new JButton(av.getNombre());
    b2.addActionListener(this);
    b3=new JButton(ti.getNombre());
    b3.addActionListener(this);
    b4=new JButton(st.getNombre());
    b4.addActionListener(this);
    b5=new JButton(ai.getNombre());
    b5.addActionListener(this);
    b6=new JButton(jw.getNombre());
    b6.addActionListener(this);
    b7=new JButton(rl.getNombre());
    b7.addActionListener(this);
    b8=new JButton(ta.getNombre());
    b8.addActionListener(this);
    b9=new JButton(f2.getNombre());
    b9.addActionListener(this);
    b10=new JButton(jk.getNombre());
    b10.addActionListener(this);
    bc=new JButton("Comprar");
    bc.addActionListener(this);
    bs=new JButton("Entradas vendidas en total");
    bs.addActionListener(this);
    
    t1=new JTextField(2);
    t1.setText("0");
    ts=new JTextField(3);
    
    list.add(ae);
    list.add(av);
    list.add(ti);
    list.add(st);
    list.add(ai);
    list.add(jw);
    list.add(rl);
    list.add(ta);
    list.add(f2);
    list.add(jk);
    
    Iterator it = list.iterator();
    
    while (it.hasNext()) {
            Object next = it.next();
            Pelicula p = (Pelicula)next; 
            if (p.getNumero()==1) {
                a1=new JTextArea(p.toString());
            }
            else if(p.getNumero()==2){
                a2=new JTextArea(p.toString());
            }
            else if(p.getNumero()==3){
                a3=new JTextArea(p.toString());
            }
            else if(p.getNumero()==4){
                a4=new JTextArea(p.toString());
            }
            else if(p.getNumero()==5){
                a5=new JTextArea(p.toString());
            }
            else if(p.getNumero()==6){
                a6=new JTextArea(p.toString());
            }
            else if(p.getNumero()==7){
                a7=new JTextArea(p.toString());
            }
            else if(p.getNumero()==8){
                a8=new JTextArea(p.toString());
            }
            else if(p.getNumero()==9){
                a9=new JTextArea(p.toString());
            }
            else if(p.getNumero()==10){
                a10=new JTextArea(p.toString());
            }
        }
    
    l0=new JLabel("Entradas a comprar:");
    l1=new JLabel("Total de entradas vendidas: ");
    
    add(p1);
    p1.add(b1);
    p1.add(b2);
    p1.add(b3);
    p1.add(b4);
    p1.add(b5);
    p1.add(b6);
    p1.add(b7);
    p1.add(b8);
    p1.add(b9);
    p1.add(b10);
    add(p2);
    
    setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1) {
            p2.removeAll();
            p2.add(l0);
            p2.add(t1);
            p2.add(bc);
            p2.add(a1);
            p2.updateUI();
        }
        else if(e.getSource()==b2){
            p2.removeAll();
            p2.add(l0);
            p2.add(t1);
            p2.add(bc);
            p2.add(a2);
            p2.updateUI();
        }
        else if(e.getSource()==b3){
            p2.removeAll();
            p2.add(l0);
            p2.add(t1);
            p2.add(bc);
            p2.add(a3);
            p2.updateUI();
        }
        else if(e.getSource()==b4){
            p2.removeAll();
            p2.add(l0);
            p2.add(t1);
            p2.add(bc);
            p2.add(a4);
            p2.updateUI();
        }
        else if(e.getSource()==b5){
            p2.removeAll();
            p2.add(l0);
            p2.add(t1);
            p2.add(bc);
            p2.add(a5);
            p2.updateUI();
        }
        else if(e.getSource()==b6){
            p2.removeAll();
            p2.add(l0);
            p2.add(t1);
            p2.add(bc);
            p2.add(a6);
            p2.updateUI();
        }
        else if(e.getSource()==b7){
            p2.removeAll();
            p2.add(l0);
            p2.add(t1);
            p2.add(bc);
            p2.add(a7);
            p2.updateUI();
        }
        else if(e.getSource()==b8){
            p2.removeAll();
            p2.add(l0);
            p2.add(t1);
            p2.add(bc);
            p2.add(a8);
            p2.updateUI();
        }
        else if(e.getSource()==b9){
            p2.removeAll();
            p2.add(l0);
            p2.add(t1);
            p2.add(bc);
            p2.add(a9);
            p2.updateUI();
        }
        else if(e.getSource()==b10){
            p2.removeAll();
            p2.add(l0);
            p2.add(t1);
            p2.add(bc);
            p2.add(a10);
            p2.updateUI();
            
        }
        else if(e.getSource()==bc){
            p2.removeAll();
            suma();
            p2.add(bs);
            p2.updateUI();
        }
        else if(e.getSource()==bs){
            p2.removeAll();
            p2.add(l1);
            ts=new JTextField(3);
            ts.setText(numEntradas+"");
            p2.add(ts);
            p2.updateUI();
        }
    }
    public void suma(){
        int ent, entradasT=0;
        ent=Integer.parseInt(t1.getText());
        numEntradas+=ent;
        t1.setText("0");
    }
}
