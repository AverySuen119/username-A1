import java.util.ArrayList;
public class AssignmentOne {

    public static void main(String[] args) {
        // 程序入口
        System.out.println("------------------------------------------------------------");
        System.out.println("The health professional details are:\n");

        // Part 3 – Using classes and objects

        GeneralPractitioner generalPractitioner1 = new GeneralPractitioner("Dr.Rachel", "Female", 37, 927, "5 years", "SongShan District");
        GeneralPractitioner generalPractitioner2 = new GeneralPractitioner("Dr.Monica", "Female", 35, 830, "4 years", "XinYi District");
        GeneralPractitioner generalPractitioner3 = new GeneralPractitioner("Dr.Chandler", "Male", 39, 729, "10 years", "NanGang District");

        Surgeon surgeon1 = new Surgeon("Dr.Avery", "Female", 31, 119, "3 years", "General Physician", "Sports Rehabilitation Department");
        Surgeon surgeon2 = new Surgeon("Dr.Wendy", "Female", 33, 221, "5 years", "Chief Physician", "Orthopedics");
        //Surgeon surgeon3= new Surgeon("Dr.Irene","Female",34,832,5, "General Physician","Thoracic Surgery");

        generalPractitioner1.print();
        System.out.println("------------------------------");
        generalPractitioner2.print();
        System.out.println("------------------------------");
        generalPractitioner3.print();
        System.out.println("------------------------------");

        surgeon1.print();
        System.out.println("------------------------------");
        surgeon2.print();
       // System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        ArrayList<Appointment> appointments = new ArrayList<>();

        appointments.add(new Appointment("Irene Bea", "8:00","773-221-198" , surgeon2));
        appointments.add(new Appointment("Joy Park", "15:00","890-561-287" , surgeon1));
        appointments.add(new Appointment("Jessica Jin", "10:00","930-112-339" , generalPractitioner1));
        appointments.add(new Appointment("Krystal Lin", "13:40", "409-291-571", generalPractitioner3));



        //打印预约
        System.out.println("------------------------------------------------------------");
        System.out.println("This is the appointment list:\n");
        printAppointments(appointments);



        //取消一个预约
        System.out.println(" ");
        System.out.println("When an appointment is canceled:");
        cancelAppointment(appointments, "890-561-287");
        System.out.println(" ");

        //打印更新后的预约
        System.out.println("This is the updated appointment list:\n");
        printAppointments(appointments);
    }



//打印预约
public static void printAppointments(ArrayList<Appointment> appointments){
        if(appointments.isEmpty()){
            System.out.println("No Existing Appointment.");
        }
        else{
            for (Appointment appointment : appointments){
                appointment.print();
                System.out.println("------------------------------");
            }
        }
    }

    //取消预约
    public static void cancelAppointment(ArrayList<Appointment> appointments, String patientPhoneNumber) {
        Appointment toRemove = null;
        for (Appointment appointment : appointments) {
            if (appointment.patientPhoneNumber.equals(patientPhoneNumber)) {
                toRemove = appointment;
                break;
            }
        }

        if (toRemove != null) {
            appointments.remove(toRemove);
            System.out.println("Appointment canceled for phone: " + patientPhoneNumber);
        } else {
            System.out.println("No appointment found for phone: " + patientPhoneNumber);
        }
    }

}
