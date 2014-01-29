/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "carte")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carte.findAll", query = "SELECT c FROM Carte c"),
    @NamedQuery(name = "Carte.findByNumCarte", query = "SELECT c FROM Carte c WHERE c.numCarte = :numCarte"),
    @NamedQuery(name = "Carte.findByTypeCarte", query = "SELECT c FROM Carte c WHERE c.typeCarte = :typeCarte"),
    @NamedQuery(name = "Carte.findByDateExp", query = "SELECT c FROM Carte c WHERE c.dateExp = :dateExp"),
    @NamedQuery(name = "Carte.findByNomCarte", query = "SELECT c FROM Carte c WHERE c.nomCarte = :nomCarte"),
    @NamedQuery(name = "Carte.findByCvv", query = "SELECT c FROM Carte c WHERE c.cvv = :cvv")})
public class Carte implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "num_carte")
    private Long numCarte;
    @Basic(optional = false)
    @Column(name = "type_carte")
    private String typeCarte;
    @Basic(optional = false)
    @Column(name = "date_exp")
    @Temporal(TemporalType.DATE)
    private Date dateExp;
    @Basic(optional = false)
    @Column(name = "nom_carte")
    private String nomCarte;
    @Basic(optional = false)
    @Column(name = "cvv")
    private int cvv;
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    @OneToOne(optional = false)
    private User idUser;

    public Carte() {
    }

    public Carte(Long numCarte) {
        this.numCarte = numCarte;
    }

    public Carte(Long numCarte, String typeCarte, Date dateExp, String nomCarte, int cvv) {
        this.numCarte = numCarte;
        this.typeCarte = typeCarte;
        this.dateExp = dateExp;
        this.nomCarte = nomCarte;
        this.cvv = cvv;
    }

    public Long getNumCarte() {
        return numCarte;
    }

    public void setNumCarte(Long numCarte) {
        this.numCarte = numCarte;
    }

    public String getTypeCarte() {
        return typeCarte;
    }

    public void setTypeCarte(String typeCarte) {
        this.typeCarte = typeCarte;
    }

    public Date getDateExp() {
        return dateExp;
    }

    public void setDateExp(Date dateExp) {
        this.dateExp = dateExp;
    }

    public String getNomCarte() {
        return nomCarte;
    }

    public void setNomCarte(String nomCarte) {
        this.nomCarte = nomCarte;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numCarte != null ? numCarte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carte)) {
            return false;
        }
        Carte other = (Carte) object;
        if ((this.numCarte == null && other.numCarte != null) || (this.numCarte != null && !this.numCarte.equals(other.numCarte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Carte[ numCarte=" + numCarte + " ]";
    }
    
}
