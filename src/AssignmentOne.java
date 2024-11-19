public class AssignmentOne {

    public static void main(String[] args) {
        // 程序入口
        System.out.println("The health professional details are:\n");

        // Part 3 – Using classes and objects
        //String name,String gender,int age,int id, int professionalAge,String location)
        GeneralPractitioner generalPractitioner1= new GeneralPractitioner("Rachel","Female",34,0927,5, "SongShan District");
        GeneralPractitioner generalPractitioner2= new GeneralPractitioner("Monica","Female",35,0830,4, "XinYi District");
        GeneralPractitioner generalPractitioner3= new GeneralPractitioner("Rachel","Female",39,0729,10, "NanGang District");

        Surgeon surgeon1= new Surgeon("Rachel","Female",34,0920,5, "XinYI District");
        Surgeon surgeon2= new Surgeon("Rachel","Female",34,0920,5, "ZhongShan District");
        Surgeon surgeon3= new Surgeon("Rachel","Female",34,0920,5, "ZhongShan District");
    }
}
