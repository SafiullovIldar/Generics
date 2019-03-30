package converter;

public interface Converter<T, E> {

    T convert(E e);
}
