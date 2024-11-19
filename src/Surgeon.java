public class Surgeon extends HealthProfessional {
    private String jobTitle;
    private String detailDepartment;

    //创建空参方法
    public Surgeon() {}

    //创建有所有参数的方法
    public Surgeon(String name,String gender,int age,int id, int professionalAge,String jobTitle,String detailDepartment){
        super(name, gender, age, id, professionalAge);
        this.jobTitle=jobTitle;
        this.detailDepartment=detailDepartment;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("jobTitle"+jobTitle);
        System.out.println("detailDepartment"+detailDepartment);
    }
}
