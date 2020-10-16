package domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Section implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = -3403862384274127797L;
    
    private Long id;
    private String nom;
    private List<Carte> cartes;
    private Tableau tableau;

    /**
     * 
     */
    public Section() {
        super();
    }

    /**
     * @param nom
     */
    public Section(String nom) {
        this.nom = nom;
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
     * @return the cartes
     */
    @OneToMany(mappedBy = "section")
    public List<Carte> getCartes() {
        return cartes;
    }

    /**
     * @param cartes the cartes to set
     */
    public void setCartes(List<Carte> cartes) {
        this.cartes = cartes;
    }

    /**
     * @return the tableau
     */
    @ManyToOne
    public Tableau getTableau() {
        return tableau;
    }

    /**
     * @param tableau the tableau to set
     */
    public void setTableau(Tableau tableau) {
        this.tableau = tableau;
    }


}
