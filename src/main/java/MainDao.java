import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class MainDao {
    public static void main(String[] args) {

        UserDao userDao = new UserDao();

        User user = userDao.read(7);
        user.setUserName("Damian");
        user.setMail("Aati@gmail.com");
        user.setPassword("haslo");
        userDao.update(user);

        //userDao.create(user);
        //userDao.delete(5);

        User user2 = new User();

        user2.setUserName("Adam");
        user2.setMail("Adam@gmail.com");
        user2.setPassword("haslo1");
        //userDao.create(user2);



        User users[] = userDao.findAll();
        for (User u : users) {
            System.out.println(u);
        }
        
    }
}
