package projectprogrammer;

import java.time.LocalDateTime;
import javax.swing.JComboBox;

public class InfoAccountUser extends InfoUser implements ShowInformation {

    private float amount;
    private String typeAmount;
    private LocalDateTime datelastTransfar;
    private LocalDateTime dateLastDeposit;
    private LocalDateTime dateLastWithdrew;

    public InfoAccountUser() {
        this(20160010, "shareef", "tareq", "ragab", "gaza", "0597762940", 0, "single");
        datelastTransfar=LocalDateTime.now();
        dateLastDeposit=LocalDateTime.now();
        dateLastWithdrew=LocalDateTime.now();
    }

    public InfoAccountUser(int id, String firstName, String fatherName, String lastName) {
        super(id, firstName, fatherName, lastName);
        amount=0.0f;
        typeAmount="الدولار";
        datelastTransfar=LocalDateTime.now();
        dateLastDeposit=LocalDateTime.now();
        dateLastWithdrew=LocalDateTime.now();
    }

    public InfoAccountUser(int id, String firstName, String fatherName, String lastName, String adderess, String phone) {
        super(id, firstName, fatherName, lastName, adderess, phone);
        amount = 0.0f;
        typeAmount = "الدولار";
        datelastTransfar=LocalDateTime.now();
        dateLastDeposit=LocalDateTime.now();
        dateLastWithdrew=LocalDateTime.now();
    }

    public InfoAccountUser(int id, String firstName, String fatherName, String lastName, String adderess, String phone, int numboy,String stateCommnuity) {
        super(id, firstName, fatherName, lastName, adderess, phone, numboy, stateCommnuity);
        amount = 0.0f;
       typeAmount ="الدولار";
        datelastTransfar=LocalDateTime.now();
        dateLastDeposit=LocalDateTime.now();
        dateLastWithdrew=LocalDateTime.now();
    }

    /**
     * @return the amount
     */
    public float getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }

    /**
     * @return the typeAmount
     */
    public String getTypeAmount() {
        return typeAmount;
    }

    /**
     * @param typeAmount the typeAmount to set
     */
    public void setTypeAmount(String typeAmount) {
        this.typeAmount = typeAmount;
    }

    /**
     * @return the datelastTransfar
     */
    public LocalDateTime getDatelastTransfar() {
        return datelastTransfar;
    }

    /**
     * @param datelastTransfar the datelastTransfar to set
     */
    public void setDatelastTransfar(LocalDateTime datelastTransfar) {
        this.datelastTransfar = datelastTransfar;
    }

    /**
     * @return the dateLastDeposit
     */
    public LocalDateTime getDateLastDeposit() {
        return dateLastDeposit;
    }

    /**
     * @param dateLastDeposit the dateLastDeposit to set
     */
    public void setDateLastDeposit(LocalDateTime dateLastDeposit) {
        this.dateLastDeposit = dateLastDeposit;
    }

    /**
     * @return the dateLastWithdrew
     */
    public LocalDateTime getDateLastWithdrew() {
        return dateLastWithdrew;
    }

    /**
     * @param dateLastWithdrew the dateLastWithdrew to set
     */
    public void setDateLastWithdrew(LocalDateTime dateLastWithdrew) {
        this.dateLastWithdrew = dateLastWithdrew;
    }

    /**
     *
     * @param value
     * @param combo
     * @return
     * @throws projectprogrammer.AccountException
     */
    public float deposit(float value,JComboBox combo) throws AccountException {
        transmtion(this,combo);
        setAmount(getAmount() + value);
        return getAmount();
    }

    /**
     *
     * @param value
     * @param combo
     * @return
     * @throws AccountException
     */
    public float withdrew(float value,JComboBox combo) throws AccountException {
        transmtion(this,combo);
        if (getAmount() >= value && getAmount() > 0) {
            setAmount(getAmount() - value);
            return getAmount();
        } else {
            throw new AccountException("الراتب أصغر من صفر ");
        }

    }

    /**
     *
     * @param to
     * @param value
     * @return
     * @throws AccountException
     */
    public boolean Transfer(InfoAccountUser to,float value) throws AccountException {
        transmtion(to);
        if (getAmount() >= value && getAmount() > 0) {
            to.setAmount(to.getAmount() + value);
            setAmount(getAmount() - value);
            return true;
        } else {
            throw new AccountException(" not transfar becouse the value mix on amount user or min <0");
        }
    }

    /**
     * 
     * @return 
     */
    @Override
    public String showData() {
        return super.showData() + " , the ammount : " + getAmount() + " , th type Amount : " + getTypeAmount() + " , \n"
                + " , th date last transfar : " + getDatelastTransfar() + " , th date last Withdrew : " + getDateLastWithdrew() + " , th date last deposit : " + getDateLastDeposit();
    }

    /**
     * 
     * @param acc
     * @param combo
     * @throws AccountException 
     */
    public void transmtion(InfoAccountUser acc,JComboBox combo) throws AccountException {
        switch (acc.getTypeAmount()) {
            case "الدولار":
                //
                switch (combo.getItemAt(combo.getSelectedIndex()).toString()) {
                    case "الدولار":
                        break;
                    case "دينار":
                        acc.setAmount(acc.getAmount());
                        acc.setTypeAmount("الدولار");
                        acc.setDatelastTransfar(LocalDateTime.now());
                        break;
                    case "شيكل":
                        acc.setAmount(acc.getAmount());
                        acc.setTypeAmount("الدولار");
                         acc.setDatelastTransfar(LocalDateTime.now());
                        break;
                    default:
                        throw new AccountException("the type not found");
                }
                break;
            case "دينار":
                switch (combo.getItemAt(combo.getSelectedIndex()).toString()) {
                    case "الدولار":
                        acc.setAmount(acc.getAmount());
                        acc.setTypeAmount("دينار");
                         acc.setDatelastTransfar(LocalDateTime.now());
                        break;
                    case "دينار":
                        break;
                    case "شيكل":
                        acc.setAmount(acc.getAmount());
                        acc.setTypeAmount("دينار");
                         acc.setDatelastTransfar(LocalDateTime.now());
                        break;
                    default:
                        throw new AccountException("the type not found");
                }
                break;
            case "شيكل":
                switch (combo.getItemAt(combo.getSelectedIndex()).toString()) {
                    case "الدولار":
                        acc.setAmount(acc.getAmount());
                        acc.setTypeAmount("شيكل");
                         acc.setDatelastTransfar(LocalDateTime.now());
                        break;
                    case "دينار":
                        acc.setAmount(acc.getAmount());
                        acc.setTypeAmount("شيكل");
                         acc.setDatelastTransfar(LocalDateTime.now());
                        break;
                    case "شيكل":
                        break;
                    default:
                        throw new AccountException("the type not found");
                }
                break;
            default:
                throw new AccountException("the type not found");
        }
    }
    
    /**
     * 
     * @param to
     * @throws AccountException 
     */
    public void transmtion(InfoAccountUser to) throws AccountException {
        switch (to.getTypeAmount()) {
            case "الدولار":
                switch (getTypeAmount()) {
                    case "الدولار":
                        break;
                    case "دينار":
                        to.setAmount(to.getAmount());
                        to.setTypeAmount("الدولار");
                        to.setDatelastTransfar(LocalDateTime.now());
                        break;
                    case "شيكل":
                        to.setAmount(to.getAmount());
                        to.setTypeAmount("الدولار");
                         to.setDatelastTransfar(LocalDateTime.now());
                        break;
                    default:
                        throw new AccountException("the type not found");
                }
                break;
            case "دينار":
                switch (getTypeAmount()) {
                    case "الدولار":
                        to.setAmount(to.getAmount());
                        to.setTypeAmount("دينار");
                         to.setDatelastTransfar(LocalDateTime.now());
                        break;
                    case "دينار":
                        break;
                    case "شيكل":
                        to.setAmount(to.getAmount());
                        to.setTypeAmount("دينار");
                        to.setDatelastTransfar(LocalDateTime.now());
                        break;
                    default:
                        throw new AccountException("the type not found");
                }
                break;
            case "شيكل":
                switch (getTypeAmount()) {
                    case "الدولار":
                        to.setAmount(to.getAmount());
                        to.setTypeAmount("شيكل");
                        to.setDatelastTransfar(LocalDateTime.now());
                        break;
                    case "دينار":
                        to.setAmount(to.getAmount());
                        to.setTypeAmount("شيكل");
                        to.setDatelastTransfar(LocalDateTime.now());
                        break;
                    case "شيكل":
                        break;
                    default:
                        throw new AccountException("the type not found");
                }
                break;
            default:
                throw new AccountException("the type not found");
        }
    }

    /**
     * 
     * @param obj
     * @return 
     */
    @Override
    public boolean equle(Object obj) {
        return obj instanceof InfoAccountUser;
    }

}
