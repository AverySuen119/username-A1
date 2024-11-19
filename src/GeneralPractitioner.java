public class GeneralPractitioner extends HealthProfessional {
    private String location;

    //创建空参方法
    public GeneralPractitioner() {}

    //创建有所有参数的方法
    public GeneralPractitioner(String doctorName,String gender,int age,int id, String professionalAge,String location){
        super(doctorName, gender, age, id, professionalAge);
        this.location=location;
    }

    //set location
    public void setLocation(String location){
        this.location=location;
    }
    //get location
    public String getLocation(){
        return location;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("location: "+location);
    }
}
