package hiben;
// Generated Dec 20, 2015 7:01:48 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Category generated by hbm2java
 */
public class Category  implements java.io.Serializable {


     private Integer idcat;
     private String catName;
     private Set<Products> productses = new HashSet<Products>(0);

    public Category() {
    }

    public Category(String catName, Set<Products> productses) {
       this.catName = catName;
       this.productses = productses;
    }
   
    public Integer getIdcat() {
        return this.idcat;
    }
    
    public void setIdcat(Integer idcat) {
        this.idcat = idcat;
    }
    public String getCatName() {
        return this.catName;
    }
    
    public void setCatName(String catName) {
        this.catName = catName;
    }
    public Set<Products> getProductses() {
        return this.productses;
    }
    
    public void setProductses(Set<Products> productses) {
        this.productses = productses;
    }




}


