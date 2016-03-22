package hiben;
// Generated Dec 20, 2015 7:01:48 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * ProdProperty generated by hbm2java
 */
public class ProdProperty  implements java.io.Serializable {


     private Integer idprodProperty;
     private PropertyGroup propertyGroup;
     private String propertyName;
     private Set<ProdHasProp> prodHasProps = new HashSet<ProdHasProp>(0);

    public ProdProperty() {
    }

	
    public ProdProperty(PropertyGroup propertyGroup) {
        this.propertyGroup = propertyGroup;
    }
    public ProdProperty(PropertyGroup propertyGroup, String propertyName, Set<ProdHasProp> prodHasProps) {
       this.propertyGroup = propertyGroup;
       this.propertyName = propertyName;
       this.prodHasProps = prodHasProps;
    }
   
    public Integer getIdprodProperty() {
        return this.idprodProperty;
    }
    
    public void setIdprodProperty(Integer idprodProperty) {
        this.idprodProperty = idprodProperty;
    }
    public PropertyGroup getPropertyGroup() {
        return this.propertyGroup;
    }
    
    public void setPropertyGroup(PropertyGroup propertyGroup) {
        this.propertyGroup = propertyGroup;
    }
    public String getPropertyName() {
        return this.propertyName;
    }
    
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }
    public Set<ProdHasProp> getProdHasProps() {
        return this.prodHasProps;
    }
    
    public void setProdHasProps(Set<ProdHasProp> prodHasProps) {
        this.prodHasProps = prodHasProps;
    }




}

