/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "ligne_commande")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LigneCommande.findAll", query = "SELECT l FROM LigneCommande l"),
    @NamedQuery(name = "LigneCommande.findByIdLigne", query = "SELECT l FROM LigneCommande l WHERE l.idLigne = :idLigne"),
    @NamedQuery(name = "LigneCommande.findByQte", query = "SELECT l FROM LigneCommande l WHERE l.qte = :qte")})
public class LigneCommande implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ligne")
    private Integer idLigne;
    @Basic(optional = false)
    @Column(name = "qte")
    private int qte;
    @JoinColumn(name = "id_commade", referencedColumnName = "id_commade")
    @ManyToOne(optional = false)
    private Commande idCommade;
    @JoinColumn(name = "id_produit", referencedColumnName = "id_produit")
    @ManyToOne(optional = false)
    private Produit idProduit;

    public LigneCommande() {
    }

    public LigneCommande(Integer idLigne) {
        this.idLigne = idLigne;
    }

    public LigneCommande(Integer idLigne, int qte) {
        this.idLigne = idLigne;
        this.qte = qte;
    }

    public Integer getIdLigne() {
        return idLigne;
    }

    public void setIdLigne(Integer idLigne) {
        this.idLigne = idLigne;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public Commande getIdCommade() {
        return idCommade;
    }

    public void setIdCommade(Commande idCommade) {
        this.idCommade = idCommade;
    }

    public Produit getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Produit idProduit) {
        this.idProduit = idProduit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLigne != null ? idLigne.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LigneCommande)) {
            return false;
        }
        LigneCommande other = (LigneCommande) object;
        if ((this.idLigne == null && other.idLigne != null) || (this.idLigne != null && !this.idLigne.equals(other.idLigne))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.LigneCommande[ idLigne=" + idLigne + " ]";
    }
    
}
