package io.dgj7.jod.testonly.model.binarytree.notset;

import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinaryTree<T extends Comparable<T>> {
    private final Comparator<T> forward = Comparable::compareTo;
    private final Comparator<T> reversed = forward.reversed();

    protected final BinaryNode<T> root;
    private final Comparator<T> comparator;

    public BinaryTree() {
        this(Comparable::compareTo);
    }

    public BinaryTree(final Comparator<T> pComparator) {
        this.comparator = Objects.requireNonNull(pComparator, "Comparator<T> is null");
        root = new BinaryNode<>(comparator);
    }

    public int size() {
        return root.size();
    }

    public boolean isEmpty() {
        return root.isEmpty();
    }

    public boolean contains(final Object object) {
        return root.contains(object);
    }

    public boolean add(final T t) {
        return root.add(t);
    }

    public boolean addAll(final Collection<? extends T> collection) {
        AtomicBoolean success = new AtomicBoolean(true);
        collection.forEach(elem -> {
            final boolean next = this.add(elem);
            success.set(success.get() && next);
        });
        return success.get();
    }

    public void clear() {
        root.clear();
    }

    public Comparator<? super T> comparator() {
        return comparator;
    }

    public T first() {
        BinaryNode<T> leftMost = root;
        while (leftMost.getLeft() != null) {
            leftMost = leftMost.getLeft();
        }
        return leftMost.getValue();
    }

    public T last() {
        BinaryNode<T> rightMost = root;
        while (rightMost.getRight() != null) {
            rightMost = rightMost.getRight();
        }
        return rightMost.getValue();
    }
}
