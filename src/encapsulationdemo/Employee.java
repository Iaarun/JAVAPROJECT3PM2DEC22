package encapsulationdemo;
// POJO
public class Employee {
 private   String name;
 private   String dept;
    private   String uid;
    private int age;
    private String orgName ="Google";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >18 && age<62){
            this.age = age;
        }else{
            this.age=-1;
        }

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getOrgName() {
        return orgName;
    }

//    public void setOrgName(String orgName) {
//        this.orgName = orgName;
//    }




}
