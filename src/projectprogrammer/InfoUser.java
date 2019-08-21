package projectprogrammer;

import java.util.Date;

public abstract class InfoUser implements ShowInformation{

    private String firstName;
    private String lastName;
    private String fatherName;
    private String adderess;
    private String phone;
    private Date datePirth;
    private int numboy;
    private String stateCommnuity;
    private int id;
    
    public InfoUser(){
        this(20160010,"shareef","tareq","ragab","gaza","0597762940",0,"single");
        datePirth=new Date(1998,4,19);
                
    }
    
    public InfoUser(int id,String firstName,String fatherName,String lastName){
        this.id=id;
        this.firstName=firstName;
        this.fatherName=fatherName;
        this.lastName=lastName;
        datePirth=new Date(1998,4,19);
    }
    
    public InfoUser(int id ,String firstName,String fatherName,String lastName,String adderess,String phone){
        this(id,firstName,fatherName,lastName);
        this.adderess=adderess;
        this.phone=phone;
        datePirth=new Date(1998,4,19);
    }
    
    public InfoUser(int id ,String firstName,String fatherName,String lastName,String adderess,String phone,int numboy,String stateCommnuity){
        this(id,firstName,fatherName,lastName,adderess,phone);
        this.numboy=numboy;
        this.stateCommnuity=stateCommnuity;
        datePirth=new Date(1998,4,19);
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the fatherName
     */
    public String getFatherName() {
        return fatherName;
    }

    /**
     * @param fatherName the fatherName to set
     */
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    /**
     * @return the adderess
     */
    public String getAdderess() {
        return adderess;
    }

    /**
     * @param adderess the adderess to set
     */
    public void setAdderess(String adderess) {
        this.adderess = adderess;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the datePirth
     */
    public Date getDatePirth() {
        return datePirth;
    }

    /**
     * @param datePirth the datePirth to set
     */
    public void setDatePirth(Date datePirth) {
        this.datePirth = datePirth;
    }

    /**
     * @return the numboy
     */
    public int getNumboy() {
        return numboy;
    }

    /**
     * @param numboy the numboy to set
     */
    public void setNumboy(int numboy) {
        this.numboy = numboy;
    }

    /**
     * @return the stateCommnuity
     */
    public String getStateCommnuity() {
        return stateCommnuity;
    }

    /**
     * @param stateCommnuity the stateCommnuity to set
     */
    public void setStateCommnuity(String stateCommnuity) {
        this.stateCommnuity = stateCommnuity;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String showData(){
        return " the information Account user - id user : "+getId()+" , first name : "+getFirstName()+" , father name : "+getFatherName()+" , last name : "+getLastName()+" , \n"
                + " , address : "+getAdderess()+" , phone number :"+getPhone()+" , DataBirth : "+getDatePirth()+" , number boy : "+getNumboy()+" , state coummnuty : "+getStateCommnuity();
    }
    
    public abstract boolean equle(Object obj);

}
