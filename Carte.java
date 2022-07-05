import javax.swing.ImageIcon;

public class Carte {
	private ImageIcon img;
	private int valeur;
	private String famille;
	private String chaineCarte;
	
	//Constructeur 1
	public Carte(ImageIcon img, int valeur) {
		super();
		this.img = img;
		this.valeur = valeur;
	}
	
	public Carte(ImageIcon img, int valeur, String famille, String chaineCarte) {
		super();
		this.img = img;
		this.valeur = valeur;
		this.famille = famille;
		this.chaineCarte = chaineCarte;
	}
	
	//Constructeur 2
	public Carte() {
	}
	
	public String getChaineCarte() {
		return chaineCarte;
	}

	public String getFamille() {
		return famille;
	}

	public void setFamille(String famille) {
		this.famille = famille;
	}

	public ImageIcon getImg() {
		return img;
	}

	public void setImg(ImageIcon img) {
		this.img = img;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public int getValeur() {
		return valeur;
	}
	
	public String toString() {
		return valeur + " " + famille;
	}
	

}
