public class LabRab_Klasses_Objects_IvanovDV {
    public void move(String[] args){
        Person PersonX = new Person();
        PersonX.displayInfo();
        Person PersonY = new Person();
        PersonY.fullName = "Anton";
        PersonY.age = 40;
        PersonY.displayInfo();
    }
}
class Person {
    public void move(String[] args){
        System.out.println("Takoi to person govorit");
    }
    public void talk(String[] args){
        System.out.println("Takoi to person govorit");
    }
        String fullName;
        int age;
        public void displayInfo(){
            System.out.printf("Takoi to person govorit", fullName, age);
        }
    }

