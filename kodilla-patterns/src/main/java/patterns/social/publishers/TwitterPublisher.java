package patterns.social.publishers;

import patterns.social.SocialPublisher;

public class TwitterPublisher implements SocialPublisher {
    public String share() {
        return "Twitter";
    }
}
