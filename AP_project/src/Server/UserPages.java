package Server;

<<<<<<< HEAD
import DataBase.UserInfoTable;
=======
import Common.Tweet;
>>>>>>> fa5af0753254ec148910ebcb95c1d645961e36ac
import User.SocketModel;
import Common.Tweet;
import java.sql.SQLException;

public interface UserPages {

    public <T> SocketModel signInPage(String userName, String password) throws SQLException;//sign in and sign up should be shown, if the sign up is successful, then the home page is the same.

    SocketModel signUpPage(String username, String firstName, String lastName, String email, String phoneNumber, String password, String birthDate) throws SQLException;
    public void setProfileAvatar(String pathAvatar);
    public void setProfileHeader(String pathHeader);
    public void setProfileBio(String bio);
    SocketModel addTweet(Tweet tweet);
    public SocketModel tweetShowPage();
    public void homePage();

    SocketModel addTweet(Tweet tweet);

    public void searchInUsers();//for follow or block or unfollow
    public void userInfoPage();
    public void showTimeLine();
    public SocketModel tweetShowPage();
}