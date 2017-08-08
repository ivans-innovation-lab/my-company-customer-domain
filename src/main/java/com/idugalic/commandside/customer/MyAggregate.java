package com.idugalic.commandside.customer;

import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An aggregate root.
 */
@Aggregate
public class MyAggregate {

    private static final Logger LOG = LoggerFactory.getLogger(MyAggregate.class);

    /**
	 * Aggregates that are managed by Axon must have a unique identifier.
	 * Strategies similar to GUID are often used. The annotation
	 * 'AggregateIdentifier' identifies the id field as such.
	 */
    @AggregateIdentifier
    private String id;

    /**
	 * This default constructor is used by the Repository to construct a
	 * prototype Aggregate. Events are then used to set properties such as the
	 * Aggregate's Id in order to make the Aggregate reflect it's true logical
	 * state.
	 */
    public MyAggregate() {
    }

    public static Logger getLog() {
        return LOG;
    }

    public String getId() {
        return id;
    }
}
