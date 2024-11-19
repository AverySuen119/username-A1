public class Appointment {
    private String patientName;
    private String appointmentTime;
    String patientPhoneNumber;
    private HealthProfessional doctor;

    //构造默认无参函数
    public Appointment() {

    }

    //构造有全部参数的函数
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
