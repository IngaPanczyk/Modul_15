package social;

import org.junit.Assert;
import org.junit.Test;
import patterns.social.Millenials;
import patterns.social.User;
import patterns.social.YGeneration;
import patterns.social.ZGeneration;
import patterns.social.publishers.SnapchatPublisher;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("User 1");
        User user2 = new YGeneration("User 2");
        User user3 = new ZGeneration("User 3");
        //When
        String milenials = user1.sharePost();
        System.out.println(user1.getName() + " use: " + milenials);
        String yGeneration = user2.sharePost();
        System.out.println(user2.getName() + " use: " + yGeneration);
        String zGeneration = user3.sharePost();
        System.out.println(user3.getName() + " use: " + zGeneration);
        //Then
        Assert.assertEquals("Facebook", milenials);
        Assert.assertEquals("Snapchat", yGeneration);
        Assert.assertEquals("Twitter", zGeneration);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user1 = new Millenials("User 1");
        //When
        String milenials = user1.sharePost();
        System.out.println(user1.getName() + " use: " + milenials);
        user1.setShareStrategy(new SnapchatPublisher());
        String milenialsAfterChange = user1.sharePost();
        System.out.println(user1.getName() + " use: " + milenialsAfterChange);
        //Then
        Assert.assertEquals("Snapchat", milenialsAfterChange);
    }
}
