package org.iffat.lambda_expression;

@FunctionalInterface
public interface Operation<T> {
    T operate(T value1, T value2);
}
