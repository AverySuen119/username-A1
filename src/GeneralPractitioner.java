public class GeneralPractitioner extends HealthProfessional {
    private String location;

    //Construct default function (empty parameter)
    public GeneralPractitioner() {

    }

    //Construct a function with all parameters
    public GeneralPractitioner(String doctorName,String gender,int age,int id, String professionalAge,String location){
        super(doctorName, gender, age, id, professionalAge);
        this.location=location;
    }


    @Override
    public void print(){
        super.print();
        System.out.println("location: "+location);
    }
}
