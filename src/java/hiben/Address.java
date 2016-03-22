package hiben;
// Generated Dec 20, 2015 7:01:48 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Address generated by hbm2java
 */
public class Address  implements java.io.Serializable {


     private Integer idaddress;
     private String homeNo;
     private String addl1;
     private String addl2;
     private String city;
     private Integer postCode;
     private Set<PersonalDetails> personalDetailses = new HashSet<PersonalDetails>(0);

    public Address() {
    }

    public Address(String homeNo, String addl1, String addl2, String city, Integer postCode, Set<PersonalDetails> personalDetailses) {
       this.homeNo = homeNo;
       this.addl1 = addl1;
       this.addl2 = addl2;
       this.city = city;
       this.postCode = postCode;
       this.personalDetailses = personalDetailses;
    }
   
    public Integer getIdaddress() {
        return this.idaddress;
    }
    
    public void setIdaddress(Integer idaddress) {
        this.idaddress = idaddress;
    }
    public String getHomeNo() {
        return this.homeNo;
    }
    
    public void setHomeNo(String homeNo) {
        this.homeNo = homeNo;
    }
    public String getAddl1() {
        return this.addl1;
    }
    
    public void setAddl1(String addl1) {
        this.addl1 = addl1;
    }
    public String getAddl2() {
        return this.addl2;
    }
    
    public void setAddl2(String addl2) {
        this.addl2 = addl2;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public Integer getPostCode() {
        return this.postCode;
    }
    
    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }
    public Set<PersonalDetails> getPersonalDetailses() {
        return this.personalDetailses;
    }
    
    public void setPersonalDetailses(Set<PersonalDetails> personalDetailses) {
        this.personalDetailses = personalDetailses;
    }




}

