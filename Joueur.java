import java.util.ArrayList;

public class Joueur {
	String nom;
	private ArrayList<Carte> cartes = new ArrayList<Carte>();
	private int score;
	
	public void majScore()
	{
		score=0;
		for(int i=0;i<cartes.size();i++)
		{
			score=score+cartes.get(i).getValeur();
		}
	}
	
	public void jeterCartes() {
		cartes = new ArrayList<Carte>();
	}
	
	public int getScore() {
		return score;
	}

	public Boolean aCarte() {
		return cartes.size()!=0;
	}
	
	public int nbCartes() {
		return cartes.size();
	}
	
	public Carte getCarte(int i) {
		return cartes.get(i);
	}
	public void setCarte(Carte carte) {
		cartes.add(carte);
	}
	
	public String getNom() {
		return nom;
	}

	public Joueur() {
		super();
	}

	public Joueur(String nom) {
		super();
		this.nom = nom;
	}
}
