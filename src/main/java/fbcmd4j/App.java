package fbcmd4j;

import facebook4j.Account;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Reading;
import facebook4j.ResponseList;
import facebook4j.User;
import facebook4j.auth.AccessToken;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        Facebook facebook = new FacebookFactory().getInstance();

        User me = null;
        try {
            me = facebook.getMe();
        } catch (FacebookException e) {
            e.printStackTrace();
        }

        logger.error(me.getId());
        logger.error(me.getName());
        logger.error(me.getEmail());
        logger.error(me.getRelationshipStatus());

  }


/*
        Account yourPageAccount = accounts.get(0);  // if index 0 is your page account.

        System.out.println(yourPageAccount.getName());
*/
/*
        facebook.setOAuthAppId("617023078702206", "006a3cfd7e9b07d0ae377897af736661");
        facebook.setOAuthPermissions(
                "public_profile,email,user_age_range,user_birthday,user_friends,user_gender,user_hometown,user_likes,user_link,user_location,user_photos,user_posts,user_status,user_tagged_places,user_videos,publish_pages,publish_to_groups");
        facebook.setOAuthAccessToken(new AccessToken(
                "EAAIxLeFsnH4BAJZCOmsT07TGdJwMg1ZC2murYW1ZB1ofQQXa8hhLyyBXYOtdXVsoGbQSm7iZAwXdvMftedOLOYIRR8r9hLZBU1b1iG9xELcAITPUnZBRWHASekvJ4AucZCpFnagTr9YckeDXze7htM6rrKW3etYai9YcSMZCcSgyTwZDZD",
                null));
*/

}

