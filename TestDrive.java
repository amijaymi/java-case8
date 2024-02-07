//import week10.labsorulari.MyException;
public class TestDrive {
    public static void main(String[] args) {
        try{
            
            DrivingSchool vart=new DrivingSchool("hayal",670);
            System.out.println(vart.getName());
            vart.register(17);
            
            
        }
        catch(MyException e){
            System.out.printf("exception %s",e.getMessage());

        }
        
    }
}
