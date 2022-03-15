package pl.kocan.visitor.pattern.homework.visitor;

import pl.kocan.visitor.pattern.homework.transport.Animal;
import pl.kocan.visitor.pattern.homework.transport.Person;
import pl.kocan.visitor.pattern.homework.transport.Shipment;

public interface TransportVisitor {

    void visit(Animal animal);

    void visit(Person person);

    void visit(Shipment aShipment);

}
