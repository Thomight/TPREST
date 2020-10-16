package domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Carte implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -2425782901098543972L;
    
    private Long id;
    private Section section;
    private Fiche fiche;

    /**
     * 
     */
    public Carte() {
        super();
    }

    /**
     * @param section
     * @param fiche
     */
    public Carte(Section section, Fiche fiche) {
        this.section = section;
        this.fiche = fiche;
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
     * @return the section
     */
    @ManyToOne
    public Section getSection() {
        return section;
    }

    /**
     * @param section the section to set
     */
    public void setSection(Section section) {
        this.section = section;
    }

    /**
     * @return the fiche
     */
    @OneToOne
    public Fiche getFiche() {
        return fiche;
    }

    /**
     * @param fiche the fiche to set
     */
    public void setFiche(Fiche fiche) {
        this.fiche = fiche;
    }
}
