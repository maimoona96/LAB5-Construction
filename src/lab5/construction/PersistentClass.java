/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.construction;

/**
 *
 * @author mkhalid.bese14seecs
 */
public class PersistentClass {
    int locId; 
    String country; 
    String region; 
    String city ;
    String postal_code; 
    String latitude ;
    String longitude; 
    String metroCode;
    String  areaCode;
 
   public PersistentClass() {}
   public PersistentClass(
int locId,String country,String region,String city,String postalCode,String latitude,String longitude,String metroCode,String areaCode
) {
    this.locId = locId;
    this.country= country; 
    this.region= region; 
    this.city = city;
    this.postal_code= postalCode; 
    this.latitude =latitude;
    this.longitude= longitude; 
    this.metroCode= metroCode;
    this.areaCode= areaCode;
   }
   public int getId() {
      return locId;
   }
   public void setId( int id ) {
      this.locId = id;
   }
   public String getCountry() {
      return country;
   }
   public void setCountry( String country ) {
      this.country= country; 
   }
   public String getRegion() {
      return region;
   }
   public void setRegion( String region ) {
       this.region= region; 
   }
   public String getCity() {
      return city;
   }
   public void setSalary( String city ) {
      this.city = city;
   }
    public String getPostalCode() {
      return postal_code;
   }
   public void setPostalCode( String postal_code ) {
      this.postal_code = postal_code;
   }
    public String getLatitude() {
      return latitude;
   }
   public void setLatitude( String latitude ) {
      this.latitude = latitude;
   }
    public String getLongitude() {
      return longitude;
   }
   public void setLongitude( String city ) {
      this.longitude = longitude;
   }
   public String getAreaCode() {
      return areaCode;
   }
   public void setAreaCode( String areaCode ) {
      this.areaCode = areaCode;
   }
   public String getMetroCode() {
      return metroCode;
   }
   public void setMetroCode( String city ) {
      this.metroCode = metroCode;
   }
}
    

