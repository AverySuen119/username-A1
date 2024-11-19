public class Surgeon extends HealthProfessional {
    private String jobTitle;
    private String detailDepartment;

    //Construct default function (empty parameter)
    public Surgeon() {

    }

    //Construct a function with all parameters
    public Surgeon(String doctorName,String gender,int age,int id,String professionalAge,String jobTitle,String detailDepartment){
        super(doctorName, gender, age, id, professionalAge);
        this.jobTitle=jobTitle;
        this.detailDepartment=detailDepartment;
    }



    @Override
    public void print(){
        super.print();
        System.out.println("jobTitle: "+jobTitle);
        System.out.println("detailDepartment: "+detailDepartment);
    }
}
