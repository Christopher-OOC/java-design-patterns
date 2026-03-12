package org.example.behavioural.visitor;

public interface Shape {

    void accept(ShapeVisitor visitor);

}
