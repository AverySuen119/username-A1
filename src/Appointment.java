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

    //set patientName method
    public void setPatientName(String patientName){
        this.patientName=patientName;
    }
    //get patientName method
    public String getPatientName(){
        return patientName;
    }

    //set appointmentTime method
    public void setAppointmentTime(String appointmentTime){
        this.appointmentTime=appointmentTime;
    }
    //get appointmentTime method
    public String getAppointmentTime(){
        return appointmentTime;
    }

    //set patientPhoneNumber method
    public void setPatientPhoneNumber(String patientPhoneNumber){
        this.patientPhoneNumber=patientPhoneNumber;
    }
    //get patientPhoneNumber method
    public String getPatientPhoneNumber(){
        return patientPhoneNumber;
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
