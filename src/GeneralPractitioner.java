public class GeneralPractitioner extends HealthProfessional {
    private String location;

    //创建空参方法
    public GeneralPractitioner() {}

    //创建有所有参数的方法
    public GeneralPractitioner(String name,String gender,int age,int id, int professionalAge,String location){
        super(name, gender, age, id, professionalAge);
        this.location=location;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("location"+location);
    }
}
