import db.DBHelper;
import models.Course;
import models.Lesson;
import models.Mentor;
import models.Student;

public class Runner {

    public static void main(String[] args) {

    Mentor mentor1 = new Mentor("Mr Mentor");
    DBHelper.save(mentor1);
    Lesson english = new Lesson("English day 1", 23);
    DBHelper.save(english);
    Course englishCourse = new Course("English HND", "HND");
    DBHelper.save(englishCourse);
    Student student1 = new Student("Stoo", 2,34);
    DBHelper.save(student1);




//        Ship pearl = new Ship("The Black Pearl");
//        DBHelper.save(pearl);
//
//        Ship dutchman = new Ship("The Flying Dutchman");
//        DBHelper.save(dutchman);
//
//        Pirate pirate1 = new Pirate("Hector", "Barbossa", 65, Weapon.PISTOL, pearl);
//        DBHelper.save(pirate1);
//        Pirate pirate2 = new Pirate("Will", "Turner", 23, Weapon.DAGGER, dutchman);
//        DBHelper.save(pirate2);
//        Pirate pirate3 = new Pirate("Elizabeth", "Swanson", 24, Weapon.PISTOL, dutchman);
//        DBHelper.save(pirate3);
//
//        Captain captain1 = new Captain("Jack", "Sparrow", 32, Weapon.CUTLASS, 100, pearl);
//        DBHelper.save(captain1);
//        Captain captain2 = new Captain("Davey", "Jones", 154, Weapon.CUTLASS, 39, dutchman);
//        DBHelper.save(captain2);
//
//        Raid raid1 = new Raid("Tortuga", 200);
//        DBHelper.save(raid1);
//
//        DBPirate.addPirateToRaid(pirate1, raid1);
//        DBPirate.addPirateToRaid(pirate2, raid1);
//
//        List<Pirate> pirates = DBRaid.getRaidPirates(raid1);
//        List<Raid> raids = DBPirate.getPirateRaids(pirate1);


        }
}
