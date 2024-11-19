public class Appointment {
    private String patientName;
    private String appointmentTime;
    String patientPhoneNumber;
    private HealthProfessional doctor;

    //Construct default function (empty parameter)
    public Appointment() {

    }

    //Construct a function with all parameters
    public Appointment(String patientName,String appointmentTime,String patientPhoneNumber,HealthProfessional doctor){
        this.patientName=patientName;
        this.appointmentTime=appointmentTime;
        this.patientPhoneNumber=patientPhoneNumber;
        this.doctor=doctor;
    }



    public void print(){
        System.out.println("Patient Name: "+patientName);
        System.out.println("Appointment Time: "+appointmentTime);
        System.out.println("Patient PhoneNumber: "+patientPhoneNumber);
        if(doctor != null){
            doctor.print();
            }
        else {
            System.out.println(("No doctor assigned."));
        }
    }
}
