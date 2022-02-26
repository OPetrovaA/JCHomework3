package JCHomework3;

public class SwapElementCl<T> {

    T intermediate;

    public T[] swapElements(T[] array, int indexA, int indexB) {
        intermediate = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = intermediate;
        return array;
    }

}
