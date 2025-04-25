package com.trishan.ds_and_algos;

public class LinearProbing {
    int[] keys;
    int[] values;
    int capacity;

    LinearProbing(int capacity) {
        this.capacity = capacity;
        keys = new int[capacity];
        values = new int[capacity];

        for (int i = 0; i < capacity; i++) {
            keys[i] = -1;
            values[i] = -1;
        }
    }

    void insert(int k, int v) {
        int i = hashFunction(k);
        if (keys[i] == -1) {
            keys[i] = k;
            values[i] = v;
        } else {
            int temp = i;
            do {
                i = (i + 1) % capacity;
                if (keys[i] == -1) {
                    keys[i] = k;
                    values[i] = v;
                }
            } while (i != temp);
        }
    }

    int get(int k) {
        int i = hashFunction(k);
        if (keys[i] == k) {
            return values[i];
        } else {
            int temp = i;
            do {
                i = (i + 1) % capacity;
                if (keys[i] == k) {
                    return values[i];
                }
            } while (i != temp);
        }
        return -1;
    }

    int hashFunction(int k) {
        return (2 * k + 1) % capacity;
    }
}
