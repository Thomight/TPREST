package domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Fiche implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = -5576778950172685782L;
    
    private Long id;
    private Carte carte;
    private String libelle;
    private String dateFinal;
    private Utilisateur utilisateur;
    private int temps;
    private List<Tag> tags;
    private String lieu;
    private String url;
    private String descrition;

    /**
     * 
     */
    public Fiche() {
        super();
    }

    /**
     * @param id
     * @param carte
     * @param libelle
     * @param dateFinal
     * @param utilisateur
     * @param temps
     * @param tags
     * @param lieu
     * @param url
     * @param descrition
     */
    public Fiche(Long id, Carte carte, String libelle, String dateFinal, Utilisateur utilisateur, int temps, List<Tag> tags, String lieu,
            String url, String descrition) {
        this.id = id;
        this.carte = carte;
        this.libelle = libelle;
        this.dateFinal = dateFinal;
        this.utilisateur = utilisateur;
        this.temps = temps;
        this.tags = tags;
        this.lieu = lieu;
        this.url = url;
        this.descrition = descrition;
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
     * @return the libelle
     */
    @OneToOne(mappedBy = "fiche")
    public Carte getCarte() {
        return carte;
    }

    /**
     * @param libelle the libelle to set
     */
    public void setCarte(Carte carte) {
        this.carte = carte;
    }

    /**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @param libelle the libelle to set
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    /**
     * @return the dateFinal
     */
    public String getDateFinal() {
        return dateFinal;
    }

    /**
     * @param dateFinal the dateFinal to set
     */
    public void setDateFinal(String dateFinal) {
        this.dateFinal = dateFinal;
    }

    /**
     * @return the utilisateur
     */
    @ManyToOne
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    /**
     * @param utilisateur the utilisateur to set
     */
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    /**
     * @return the temps
     */
    public int getTemps() {
        return temps;
    }

    /**
     * @param temps the temps to set
     */
    public void setTemps(int temps) {
        this.temps = temps;
    }

    /**
     * @return the tags
     */
    @ManyToMany
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * @param tags the tags to set
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    /**
     * @return the lieu
     */
    public String getLieu() {
        return lieu;
    }

    /**
     * @param lieu the lieu to set
     */
    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the descrition
     */
    public String getDescrition() {
        return descrition;
    }

    /**
     * @param descrition the descrition to set
     */
    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }    

}
