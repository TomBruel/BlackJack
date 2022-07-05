
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import java.awt.Dimension;

public class blackjackApp {

	private static JFrame frame;
	
//définition des objets globaux
	public static Joueur J1; // creation d'un objet Joueur
	public static Joueur Croupier;
	
	public static Paquet paquet; // creation d'un objet paquet
	public static ArrayList<JLabel>lblCartesJ;
	public static ArrayList<JLabel>lblCartesC;
	public static JButton boutonJouer;
	public static JButton boutonArreter;
	public static JButton boutonNouvellePartie;
	
	public static JLabel lblScoreJoueur;	
	public static JLabel lblScoreCroupier;	
	public static JLabel lblResult;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new blackjackApp();
		frame.setVisible(true);
		
		/*for(;;)
		{
			if(J1.getCarte1J()!=null)
			{
				System.out.println("ok");

			}
			else System.out.println("nok");
			
	 		}*/
				
		// ALGORITHME DU PROGRAMME PRINCIPAL
		
		// LANCER UNE PARTIE
		
		// TIRER UNE CARTE 1 POUR LE JOUEUR
		
		// TIRER UNE CARTE 1 POUR LA BANQUE
		
		// TIRER UNE CARTE 2 POUR LE JOUEUR
		
		// PROPOSER AU JOUEUR DE TIRER UNE CARTE OU DE S'ARRETER (SPLIT ou DOUBLER)
		
		// TIRER UNE CARTE POUR LA BANQUE TANT QUE SON SCORE EST INFERIEUR A 17 
		
		// DETERMINER QUI GAGNE
	}

	/**
	 * Create the application.
	 */
	public blackjackApp() {
		
		J1 = new Joueur(); // creation d'un objet Joueur J1
		Croupier = new Joueur();
		paquet = new Paquet(); // creation d'un objet paquet
		lblCartesJ = new  ArrayList<JLabel>();
		frame = new JFrame();
		boutonJouer = new JButton("Jouer");
		boutonArreter = new JButton("Arreter");
		boutonNouvellePartie = new JButton("Nouvelle partie");
		lblScoreJoueur = new JLabel();
		lblScoreCroupier = new JLabel();
		lblResult = new JLabel();

		initialize();
		
		boutonNouvellePartie.addActionListener(new actionPartie());
		boutonJouer.addActionListener(new actionJouer());
		boutonArreter.addActionListener(new actionArreter());
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
// initialisation de la fenetre principale
		
		//frame.setBounds(0, 0, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//enlève la barre du haut de la fenetre (reduire,agrandir,fermer)
		frame.setUndecorated(true);
		//positionne la fenêtre au milieu de l'écran
		//frame.setLocationRelativeTo(null);
		//redimensionner la fenetre
		Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		int height = (int)dimension.getHeight();
		int width  = (int)dimension.getWidth();
		frame.setSize(width,height);
		frame.getContentPane().setLayout(null);
		

		
		//ajout d'un jeu complet
		paquet.ajouteUnjeuComplet();

		boutonJouer.setBounds(900, 200, 100, 100);
		frame.getContentPane().add(boutonJouer);
		
		boutonArreter.setBounds(1050, 200, 100, 100);
		frame.getContentPane().add(boutonArreter);
		
		
		JLayeredPane layer = new JLayeredPane();
		/*JLabel lblTapis = new JLabel("");
		lblTapis.setBounds(0, 0, width, height);
*/
		/*BufferedImage img = ImageIO.read(this.getClass().getResource("tapis2.png"));
				//Affiche l'image Tapis sur le label en pleine écran
		ImageIcon icon = new ImageIcon(new ImageIcon("tapis2.png").getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
		
		layer.add(img);
		
		frame.getContentPane().add(lblTapis);
		lblTapis.setIcon(icon);*/
		

		

	} 	
	
	//ACTION LISTENER
	public class actionJouer implements ActionListener
	{
	
		public void actionPerformed(ActionEvent e) 
		{ 	
			if(J1.nbCartes()==0 && J1.getScore()<21) {
					
				//TIRAGE CARTE 1 DU JOUEUR
				Carte nouvelleCarte = paquet.TirageCarte();
				J1.setCarte(nouvelleCarte); 
				J1.majScore();
				//affichage de la carte tirée
				ImageIcon imgCarte = new ImageIcon(new ImageIcon(J1.getCarte(J1.nbCartes()-1).getChaineCarte()).getImage().getScaledInstance(80, 120, Image.SCALE_DEFAULT));
				System.out.println(J1.getCarte(J1.nbCartes()-1).getChaineCarte());
				JLabel nouveauLabel = new JLabel();
				frame.add(nouveauLabel);	
				nouveauLabel.setBounds(875+88*(J1.nbCartes()-1), 800, 80, 120);
			    nouveauLabel.setIcon(imgCarte);
				    //TIRAGE CARTE 1 CROUPIER
			    
				nouvelleCarte = paquet.TirageCarte();
				Croupier.setCarte(nouvelleCarte); 
				Croupier.majScore();
				//affichage de la carte tirée
				imgCarte = new ImageIcon(new ImageIcon(Croupier.getCarte(Croupier.nbCartes()-1).getChaineCarte()).getImage().getScaledInstance(80, 120, Image.SCALE_DEFAULT));
				System.out.println(Croupier.getCarte(Croupier.nbCartes()-1).getChaineCarte());
				nouveauLabel = new JLabel();
				frame.add(nouveauLabel);
				nouveauLabel.setBounds(875+88*(Croupier.nbCartes()-1), 350, 80, 120);
			    nouveauLabel.setIcon(imgCarte);
			    
			    //TIRAGE CARTE 2 DU JOUEUR
				nouvelleCarte = paquet.TirageCarte();
				J1.setCarte(nouvelleCarte); 
				J1.majScore();
				//affichage de la carte tirée
				imgCarte = new ImageIcon(new ImageIcon(J1.getCarte(J1.nbCartes()-1).getChaineCarte()).getImage().getScaledInstance(80, 120, Image.SCALE_DEFAULT));
				System.out.println(J1.getCarte(J1.nbCartes()-1).getChaineCarte());
				nouveauLabel = new JLabel();
				frame.add(nouveauLabel);
				nouveauLabel.setBounds(875+88*(J1.nbCartes()-1), 800, 80, 120);
			    nouveauLabel.setIcon(imgCarte);
			    
			    //remplacer le bouton Jouer par tirer une carte
			    boutonJouer.setText("Tirer");
			    
			}
			else if(Croupier.nbCartes()==1)
			{
				//TIRAGE NOUVELLE CARTE DU JOUEUR
				Carte nouvelleCarte = paquet.TirageCarte();
				J1.setCarte(nouvelleCarte); 
				J1.majScore();
				//affichage de la carte tirée
				ImageIcon imgCarte = new ImageIcon(new ImageIcon(J1.getCarte(J1.nbCartes()-1).getChaineCarte()).getImage().getScaledInstance(80, 120, Image.SCALE_DEFAULT));
				System.out.println(J1.getCarte(J1.nbCartes()-1).getChaineCarte());
				JLabel nouveauLabel = new JLabel();
				frame.add(nouveauLabel);
				nouveauLabel.setBounds(875+88*(J1.nbCartes()-1), 800, 80, 120);
			    nouveauLabel.setIcon(imgCarte);
			}
			J1.majScore();
			if(J1.getScore()>21) {
				// AFFICHER BUST
				Font font = new Font("Arial",Font.BOLD,30);
				lblResult.setFont(font);
				//Joueur 1 a perdu
			    lblResult.setText("Bust !");
				frame.add(lblResult);
				lblResult.setBounds(915, 500, 400, 400);
				
				boutonNouvellePartie.setBounds(500, 200, 150, 100);
				frame.getContentPane().add(boutonNouvellePartie);
			}
			
		    System.out.println(J1.getScore());
		    //affichage du score du joueur
		    lblScoreJoueur.setText(""+ J1.getScore());
			frame.add(lblScoreJoueur);
			lblScoreJoueur.setBounds(915, 870, 80, 120);
			
		    //affichage du score du croupier
		    lblScoreCroupier.setText(""+ Croupier.getScore());
			frame.add(lblScoreCroupier);
			lblScoreCroupier.setBounds(915, 420, 80, 120);		
		} 
	}
	
	public class actionArreter implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			//TIRAGE CARTE CROUPIER TANT QUE SCORE < 16
			Croupier.majScore();
			while(Croupier.getScore()<=16) {
				Carte nouvelleCarte = paquet.TirageCarte();
				Croupier.setCarte(nouvelleCarte); 
				Croupier.majScore();
				//affichage de la carte tirée
				ImageIcon imgCarte = new ImageIcon(new ImageIcon(Croupier.getCarte(Croupier.nbCartes()-1).getChaineCarte()).getImage().getScaledInstance(80, 120, Image.SCALE_DEFAULT));
				System.out.println(Croupier.getCarte(Croupier.nbCartes()-1).getChaineCarte());
				JLabel nouveauLabel = new JLabel();
				frame.add(nouveauLabel);
				nouveauLabel.setBounds(875+88*(Croupier.nbCartes()-1), 350, 80, 120);
			    nouveauLabel.setIcon(imgCarte);
			    lblScoreCroupier.setText(""+ Croupier.getScore());
				frame.add(lblScoreCroupier);
				lblScoreCroupier.setBounds(915, 420, 80, 120);
			}
			if(J1.getScore()>Croupier.getScore() && Croupier.getScore()<=21 || Croupier.getScore()>21) {
				//J1 A GAGNE
				Font font = new Font("Arial",Font.BOLD,30);
				lblResult.setFont(font);
			    lblResult.setText("Victoire !");
				frame.add(lblResult);
				lblResult.setBounds(915, 500, 400, 400);
			} else if(J1.getScore()==Croupier.getScore()) {
				//ex aequo
				Font font = new Font("Arial",Font.BOLD,30);
				lblResult.setFont(font);
			    lblResult.setText("Bust !");
				frame.add(lblResult);
				lblResult.setBounds(915, 500, 400, 400);
			} else {
				//Croupier a gagne
				Font font = new Font("Arial",Font.BOLD,30);
				lblResult.setFont(font);
			    lblResult.setText("Défaite !");
				frame.add(lblResult);
				lblResult.setBounds(915, 500, 400, 400);
			}
			
			boutonNouvellePartie.setBounds(500, 200, 100, 100);
			frame.getContentPane().add(boutonNouvellePartie);
			/*try {
				Thread.sleep(5000, 0);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}*/
			
			boutonNouvellePartie.setBounds(500, 200, 150, 100);
			frame.getContentPane().add(boutonNouvellePartie);
		}
	}

	public class actionPartie implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			//Croupier.jeterCartes();
			//J1.jeterCartes();

			new blackjackApp();
			
			J1 = new Joueur(); // creation d'un objet Joueur J1
			Croupier = new Joueur();
			paquet = new Paquet(); // creation d'un objet paquet
			lblCartesJ = new  ArrayList<JLabel>();
			frame = new JFrame();
			boutonJouer = new JButton("Jouer");
			boutonArreter = new JButton("Arreter");
			boutonNouvellePartie = new JButton("Nouvelle partie");
			lblScoreJoueur = new JLabel();
			lblScoreCroupier = new JLabel();
			lblResult = new JLabel();
			
			
			System.out.println(frame.getSize());
			frame.setVisible(false);
			new blackjackApp();
			frame.removeAll();
			frame.repaint();

			frame.pack();
			System.out.println(J1.nbCartes());
			
		}
	}
}

