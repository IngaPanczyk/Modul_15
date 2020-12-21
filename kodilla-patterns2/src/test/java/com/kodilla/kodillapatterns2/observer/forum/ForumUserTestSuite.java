package com.kodilla.kodillapatterns2.observer.forum;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ForumUserTestSuite {
    @Test
    public void testUpdate(){
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic("Java Help Forum Topic");
        ForumTopic javaToolsForum = new JavaToolsForumTopic("Java Tools Forum Topic");
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessinePinkman = new ForumUser("Jessine Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(johnSmith);
        javaHelpForum.registerObserver(ivoneEscobar);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaHelpForum.registerObserver(jessinePinkman);
        //When
        javaHelpForum.addPost("Post 1");
        javaHelpForum.addPost("Post 2");
        javaHelpForum.addPost("Post 3");
        javaToolsForum.addPost("Post 4");
        //Then
        System.out.println(javaHelpForum.getName());
        Assert.assertEquals(4,johnSmith.getUpdateCount());
        Assert.assertEquals(4,ivoneEscobar.getUpdateCount());
        Assert.assertEquals(3,jessinePinkman.getUpdateCount());
    }
}
