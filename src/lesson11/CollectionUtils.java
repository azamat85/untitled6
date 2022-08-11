package lesson11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CollectionUtils implements ICollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> ret = new ArrayList<>();
        ret.addAll(a);
        ret.addAll(b);
        return ret;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> ret1 = new ArrayList<>();
        ArrayList<Integer> ret2 = new ArrayList<>();
        ArrayList<Integer> ret3 = new ArrayList<>();
        a.retainAll(b);
        ret1.addAll(a);
        ret2.addAll(a);
        ret3.addAll(ret1);
        ret3.addAll(ret2);
        return ret3;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> ret = new HashSet<>();
        ret.addAll(a);
        ret.addAll(b);
        return ret;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> ret = new HashSet<>();
        a.retainAll(b);
        ret.addAll(a);
        return ret;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> ret1 = new ArrayList<>();
        ArrayList<Integer> ret2 = new ArrayList<>();
        ArrayList<Integer> ret3 = new ArrayList<>();
        ret1.addAll(a);
        ret1.addAll(b);
        ret1.removeAll(a);
        ret2.addAll(a);
        ret2.addAll(b);
        ret2.removeAll(b);
        ret3.addAll(ret1);
        ret3.addAll(ret2);
        return ret3;
    }

}
