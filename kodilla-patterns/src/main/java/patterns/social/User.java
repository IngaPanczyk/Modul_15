package patterns.social;

public class User {
    final private String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sharePost () {
        return socialPublisher.share();
    }

    public void setShareStrategy (SocialPublisher socialPublisher){
        this.socialPublisher = socialPublisher;
    }

}
