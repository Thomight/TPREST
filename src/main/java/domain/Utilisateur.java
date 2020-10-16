package domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 2734706024493587925L;
    
    private Long id;
    private String nom;
    private String prenom;
    private List<Fiche> fiches;
    
    /**
     * 
     */
    public Utilisateur() {
        super();
    }
    
    /**
     * @param id
     * @param nom
     * @param prenom
     * @param fiches
     */
    public Utilisateur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    /**
     * @return the id
     */
    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the fiches
     */
    @OneToMany(mappedBy = "utilisateur")
    public List<Fiche> getFiches() {
        return fiches;
    }

    /**
     * @param fiches the fiches to set
     */
    public void setFiches(List<Fiche> fiches) {
        this.fiches = fiches;
    }


}
