public class Surgeon extends HealthProfessional {
    private String jobTitle;
    private String detailDepartment;

    //创建空参方法
    public Surgeon() {}

    //创建有所有参数的方法
    public Surgeon(String doctorName,String gender,int age,int id,String professionalAge,String jobTitle,String detailDepartment){
        super(doctorName, gender, age, id, professionalAge);
        this.jobTitle=jobTitle;
        this.detailDepartment=detailDepartment;
    }

    //set jobTitle
    public void setJobTitle(String jobTitle){
        this.jobTitle=jobTitle;
    }
    //get jobTitle
    public String getJobTitle(){
        return jobTitle;
    }

    //set detailDepartment
    public void setDetailDepartment(String detailDepartment){
        this.detailDepartment=detailDepartment;
    }
    //get detailDepartment
    public String getDetailDepartment(){
        return detailDepartment;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("jobTitle: "+jobTitle);
        System.out.println("detailDepartment: "+detailDepartment);
    }
}
