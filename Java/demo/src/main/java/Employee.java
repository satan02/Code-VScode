public class Employee {
  private String fname;
  private String lname;

  public String getFname() {
    return fname;
  }

  public String getLname() {
    return lname;
  }

  public void setFname(String fname) {
    this.fname = fname;
  }

  public void setLname(String lname) {
    this.lname = lname;
  }

  public Employee() {
  }

  @Override
  public String toString() {
    return "Employee [fname=" + fname + ", lname=" + lname + "]";
  }

}
