package pl.kocan.visitor.pattern.homework.transport;

import pl.kocan.visitor.pattern.homework.visitor.TransportVisitor;

public class Animal implements Transportable {

    private String kind;
    private int weight;

    public Animal(String name, int weight) {
        this.kind = name;
        this.weight = weight;
    }

    @Override
    public void accept(TransportVisitor transportVisitor) {
        transportVisitor.visit(this);
    }

    public String getKind() {
        return kind;
    }

    public int getWeight() {
        return weight;
    }

}
