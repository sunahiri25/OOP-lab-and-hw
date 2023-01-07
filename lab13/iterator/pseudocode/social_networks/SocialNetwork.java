package iterator.pseudocode.social_networks;

import iterator.pseudocode.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileId);

    ProfileIterator createCoworkersIterator(String profileId);

}
