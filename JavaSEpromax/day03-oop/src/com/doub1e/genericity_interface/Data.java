package com.doub1e.genericity_interface;
//泛型接口
public interface Data<T> {
    void add(T t);
    void delete(T t);
    void update(T t);
    T getById(int id);
}
