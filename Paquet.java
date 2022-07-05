import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Paquet {
	
	private ArrayList<Carte> paquet = new ArrayList<Carte>();

	public Paquet() {
		super();
	}
	
	public ArrayList<Carte> getPaquet() {
		return paquet;
	}

	public Carte TirageCarte() {
		//tire un nombre aléatoire entier entre 0 et 51 compris
		int x = (int)((Math.random() * (52 - 0)));
		return paquet.get(x);
	}
	
	public void ajouteUnjeuComplet() {
		Carte nouvelleCarte;
		String chaineCarte;
		ImageIcon img;
		int largeur = 60; // largeur de la carte en pixel
		int hauteur = 100; // hauteur de la carte en pixel
		
		
		// insère toutes les images dans le paquet de la famille carreau
		String famille = "carreau";
		for(int cpt=2;cpt<=10;cpt++) {
			chaineCarte=chaineNomCarte(Integer.toString(cpt),famille);
			img = new ImageIcon(new ImageIcon(chaineCarte).getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
			nouvelleCarte = new Carte(img,cpt,famille,chaineCarte);
			paquet.add(nouvelleCarte);
		}
		//insère toutes les images des têtes de la famille carreau
		//as
		chaineCarte=chaineNomCarte("as",famille);
		img = new ImageIcon(new ImageIcon(chaineCarte).getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
		nouvelleCarte = new Carte(img,11,famille,chaineCarte);
		paquet.add(nouvelleCarte);
		//Roi
		chaineCarte=chaineNomCarte("roi",famille);
		img = new ImageIcon(new ImageIcon(chaineCarte).getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
		nouvelleCarte = new Carte(img,10,famille,chaineCarte);
		paquet.add(nouvelleCarte);
		//reine
		chaineCarte=chaineNomCarte("reine",famille);
		img = new ImageIcon(new ImageIcon(chaineCarte).getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
		nouvelleCarte = new Carte(img,10,famille,chaineCarte);
		paquet.add(nouvelleCarte);
		//valet
		chaineCarte=chaineNomCarte("valet",famille);
		img = new ImageIcon(new ImageIcon(chaineCarte).getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
		nouvelleCarte = new Carte(img,10,famille,chaineCarte);
		paquet.add(nouvelleCarte);
		// FIN CARTES CARREAU
		
		// insère toutes les images dans le paquet de la famille coeur
		famille = "coeur";
		for(int cpt=2;cpt<=10;cpt++) {
			chaineCarte=chaineNomCarte(Integer.toString(cpt),famille);
			img = new ImageIcon(new ImageIcon(chaineCarte).getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
			nouvelleCarte = new Carte(img,cpt,famille,chaineCarte);
			paquet.add(nouvelleCarte);
		}
		//insère toutes les images des têtes de la famille coeur
		//as
		chaineCarte=chaineNomCarte("as",famille);
		img = new ImageIcon(new ImageIcon(chaineCarte).getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
		nouvelleCarte = new Carte(img,11,famille,chaineCarte);
		paquet.add(nouvelleCarte);
		//Roi
		chaineCarte=chaineNomCarte("roi",famille);
		img = new ImageIcon(new ImageIcon(chaineCarte).getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
		nouvelleCarte = new Carte(img,10,famille,chaineCarte);
		paquet.add(nouvelleCarte);
		//reine
		chaineCarte=chaineNomCarte("reine",famille);
		img = new ImageIcon(new ImageIcon(chaineCarte).getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
		nouvelleCarte = new Carte(img,10,famille,chaineCarte);
		paquet.add(nouvelleCarte);
		//valet
		chaineCarte=chaineNomCarte("valet",famille);
		img = new ImageIcon(new ImageIcon(chaineCarte).getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
		nouvelleCarte = new Carte(img,10,famille,chaineCarte);
		paquet.add(nouvelleCarte);
		//FIN COEUR
		
		// insère toutes les images dans le paquet de la famille pique
		famille = "pique";
		for(int cpt=2;cpt<=10;cpt++) {
			chaineCarte=chaineNomCarte(Integer.toString(cpt),famille);
			img = new ImageIcon(new ImageIcon(chaineCarte).getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
			nouvelleCarte = new Carte(img,cpt,famille,chaineCarte);
			paquet.add(nouvelleCarte);
		}
		//insère toutes les images des têtes de la famille pique
		//as
		chaineCarte=chaineNomCarte("as",famille);
		img = new ImageIcon(new ImageIcon(chaineCarte).getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
		nouvelleCarte = new Carte(img,11,famille,chaineCarte);
		paquet.add(nouvelleCarte);
		//Roi
		chaineCarte=chaineNomCarte("roi",famille);
		img = new ImageIcon(new ImageIcon(chaineCarte).getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
		nouvelleCarte = new Carte(img,10,famille,chaineCarte);
		paquet.add(nouvelleCarte);
		//reine
		chaineCarte=chaineNomCarte("reine",famille);
		img = new ImageIcon(new ImageIcon(chaineCarte).getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
		nouvelleCarte = new Carte(img,10,famille,chaineCarte);
		paquet.add(nouvelleCarte);
		//valet
		chaineCarte=chaineNomCarte("valet",famille);
		img = new ImageIcon(new ImageIcon(chaineCarte).getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
		nouvelleCarte = new Carte(img,10,famille,chaineCarte);
		paquet.add(nouvelleCarte);
		//FIN PIQUE
			
		// insère toutes les images dans le paquet de la famille trèfle
		famille = "treffle";
		for(int cpt=2;cpt<=10;cpt++) {
			chaineCarte=chaineNomCarte(Integer.toString(cpt),famille);
			img = new ImageIcon(new ImageIcon(chaineCarte).getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
			nouvelleCarte = new Carte(img,cpt,famille,chaineCarte);
			paquet.add(nouvelleCarte);
		}
		
		//insère toutes les images des têtes de la famille pique
		//as
		chaineCarte=chaineNomCarte("as",famille);
		img = new ImageIcon(new ImageIcon(chaineCarte).getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
		nouvelleCarte = new Carte(img,11,famille,chaineCarte);
		paquet.add(nouvelleCarte);
		//Roi
		chaineCarte=chaineNomCarte("roi",famille);
		img = new ImageIcon(new ImageIcon(chaineCarte).getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
		nouvelleCarte = new Carte(img,10,famille,chaineCarte);
		paquet.add(nouvelleCarte);
		//reine
		chaineCarte=chaineNomCarte("reine",famille);
		img = new ImageIcon(new ImageIcon(chaineCarte).getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
		nouvelleCarte = new Carte(img,10,famille,chaineCarte);
		paquet.add(nouvelleCarte);
		//valet
		chaineCarte=chaineNomCarte("valet",famille);
		img = new ImageIcon(new ImageIcon(chaineCarte).getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
		nouvelleCarte = new Carte(img,10,famille,chaineCarte);
		paquet.add(nouvelleCarte);
		//FIN TREFLE		
	}
	
	private String chaineNomCarte(String valeur,String famille)
	{
		return valeur + "_" + famille +".png";
	}
	
}
