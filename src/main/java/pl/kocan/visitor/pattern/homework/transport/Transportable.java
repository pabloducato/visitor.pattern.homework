package pl.kocan.visitor.pattern.homework.transport;

import pl.kocan.visitor.pattern.homework.visitor.TransportVisitor;

public interface Transportable {

    void accept(TransportVisitor transportVisitor);

}
