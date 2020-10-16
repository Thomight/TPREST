package domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = -6670442047917303224L;
    
    private Long id;
    private String nom;
    private List<Fiche> fiches;
    
    public Tag() {
        super();
    }
    
    public Tag(String nom) {
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
     * @return the fiches
     */
    @ManyToMany(mappedBy = "tags", cascade = CascadeType.PERSIST)
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
