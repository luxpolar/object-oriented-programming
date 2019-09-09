package user;

public class Person {
    //private String name;
    //protected Integer numberAccount;
    //public Integer age;

    //protected void setAge() {

    //}
    //private void setNumberAccount() {

    //}
    private String name;
    private String lastName;
    protected Integer numberAccount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(Integer numberAccount) {
        this.numberAccount = numberAccount;
    }

}
