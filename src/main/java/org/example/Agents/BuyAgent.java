package org.example.Agents;

import jade.core.Agent;
import lombok.extern.slf4j.Slf4j;
import org.example.Behaviours.BuyBehs.OrderBeh;
import org.example.Behaviours.BuyBehs.ParallelProcessingBeh;

@Slf4j
public class BuyAgent extends Agent {
    @Override
    protected void setup() {
        log.info(this.getLocalName() + " родился!");
        this.addBehaviour(new OrderBeh());
        this.addBehaviour(new ParallelProcessingBeh());
    }
}
