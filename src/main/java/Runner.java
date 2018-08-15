import db.DBHelper;
import models.Course;
import models.Lesson;
import models.Mentor;
import models.Student;

public class Runner {

    public static void main(String[] args) {
        Course mathCourse = new Course("Math Masters", "Master");
            DBHelper.save(mathCourse);
        Course englishCourse = new Course("English HND", "HND");
            DBHelper.save(englishCourse);
        Lesson english = new Lesson("English day 1", 23, englishCourse);
            DBHelper.save(english);
        Lesson english2 = new Lesson("English day 2", 23, englishCourse);
            DBHelper.save(english2);
        Student student1 = new Student("Stoo", 2,34, englishCourse);
            DBHelper.save(student1);
        Mentor mentor1 = new Mentor("Mr Mentor", student1);
            DBHelper.save(mentor1);


        //DBPirate.addPirateToRaid(pirate1, raid1);
        //DBPirate.addPirateToRaid(pirate2, raid1);




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
