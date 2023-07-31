package com.efimchick.ifmo.collections;

import java.util.*;

class MedianQueue extends LinkedList<Integer> {

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public Integer poll() {
        List<Integer> list = new ArrayList<>(this);
        Collections.sort(list);
        int index = this.size() / 2;
        if (this.size() % 2 == 0) {
            index--;
        }
        this.remove(list.get(index));
        return list.get(index);
    }

    public Integer peek() {
        List<Integer> list = new ArrayList<>(this);
        Collections.sort(list);
        int index = this.size() / 2;
        if (this.size() % 2 == 0) {
            index--;
        }
        return list.get(index);
    }

    @Override
    public boolean offer(Integer integer) {
        return super.offer(integer);
    }

    @Override
    public Iterator<Integer> iterator() {
        return super.iterator();
    }
}
