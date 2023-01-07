package iterator.pseudocode.iterators;

import iterator.pseudocode.profile.Profile;

public interface ProfileIterator {
    Profile getNext();

    boolean hasMore();
}
