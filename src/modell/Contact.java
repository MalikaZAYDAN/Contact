package modell;

public class Contact {
	String nom,prenom,num_tel,type_tel,categorie;
	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	int id_contact;
	

	public int getId_contact() {
		return id_contact;
	}

	public void setId_contact(int id_contact) {
		this.id_contact = id_contact;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNum_tel() {
		return num_tel;
	}

	public void setNum_tel(String num_tel) {
		this.num_tel = num_tel;
	}

	public String getType_tel() {
		return type_tel;
	}

	public void setType_tel(String type_tel) {
		this.type_tel = type_tel;
	}


}
