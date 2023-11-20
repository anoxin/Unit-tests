import org.junit.jupiter.api.Test;
import seminars.third.hw.MainHW;
import seminars.third.tdd.User;
import seminars.third.tdd.UserRepository;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestUserRepository {
    @Test
    public void fullAdmin() {
        User user1 = new User("User1", "12345", false);
        User user2 = new User("User2", "12345", true);
        User user3 = new User("User3", "12345", false);
        UserRepository data = new UserRepository();
        data.addUser(user1);
        data.addUser(user2);
        data.addUser(user3);

        data.fullAdmin();

        for (User user: data.getUsers()) {

                assertTrue(user.getAdmin());
        }

    }
}
