package patterns.social.publishers;

import patterns.social.SocialPublisher;

public class FacebookPublisher implements SocialPublisher {
    public String share() {
        return "Facebook";
    }
}
