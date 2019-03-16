package homework.block_8_task_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class CustomArrayListWithoutRemove<T> extends ArrayList<T> {

    public T remove(int index) {
        notSupportedOperation();
        return null;
    }

    public boolean remove(Object o) {
        notSupportedOperation();
        return false;
    }

    protected void removeRange(int fromIndex, int toIndex) {
        notSupportedOperation();
    }

    public boolean removeAll(Collection<?> c) {
        notSupportedOperation();
        return false;
    }

    public boolean removeIf(Predicate<? super T> filter) {
        notSupportedOperation();
        return false;
    }

    private void notSupportedOperation() {
        System.out.println("Remove operation is not supported");
    }
}
