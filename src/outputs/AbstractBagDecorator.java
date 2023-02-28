/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package outputs.apache.commons.collections4.bag;

import java.util.Set;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.collection.AbstractCollectionDecorator;

/**
 * Decorates another <code>Bag</code> to provide additional behaviour.
 * <p>
 * Methods are forwarded directly to the decorated bag.
 *
 * @since 3.0
 * @version $Id$
 */
public abstract class AbstractBagDecorator<E>
        extends AbstractCollectionDecorator<E> implements Bag<E> {

    /** Serialization version */
    private static final Var<Long> serialVersionUID_0 = new Var<Long>(-3768146017343785417L);

    /**
     * Constructor only used in deserialization, do not use otherwise.
     * @since 3.1
     */
    protected AbstractBagDecorator() {
		// formal parameters

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		super();
    }

    /**
     * Constructor that wraps (not copies).
     *
     * @param bag  the bag to decorate, must not be null
     * @throws IllegalArgumentException if list is null
     */
    protected AbstractBagDecorator(final Bag<E> bag) {
        super(bag);
    }

    /**
     * Gets the bag being decorated.
     *
     * @return the decorated bag
     */
    @Override
    protected Bag<E> decorated() {
		// formal parameters

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return (Bag<E>) super.decorated();
    }

    @Override
    public boolean equals(final Object object) {
		// formal parameters
		Var<Object> object_0 = new Var<Object>(object);
		Output.record("AbstractBagDecorator", "equals", 67, "object_0", object_0.value);

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return object_0.value == this || decorated().equals(object_0.value);
    }

    @Override
    public int hashCode() {
		// formal parameters

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return decorated().hashCode();
    }

    //-----------------------------------------------------------------------

    public int getCount(final Object object) {
		// formal parameters
		Var<Object> object_1 = new Var<Object>(object);
		Output.record("AbstractBagDecorator", "getCount", 78, "object_1", object_1.value);

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return decorated().getCount(object_1.value);
    }

    public boolean add(final E object, final int count) {
		// formal parameters
		Var<Integer> count_0 = new Var<Integer>(count);
		Output.record("AbstractBagDecorator", "add", 82, "count_0", count_0.value);
		Var<Object> object_2 = new Var<Object>(object);
		Output.record("AbstractBagDecorator", "add", 82, "object_2", object_2.value);

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return decorated().add(object_2.value, count_0.value);
    }

    public boolean remove(final Object object, final int count) {
		// formal parameters
		Var<Integer> count_1 = new Var<Integer>(count);
		Output.record("AbstractBagDecorator", "remove", 86, "count_1", count_1.value);
		Var<Object> object_3 = new Var<Object>(object);
		Output.record("AbstractBagDecorator", "remove", 86, "object_3", object_3.value);

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return decorated().remove(object_3.value, count_1.value);
    }

    public Set<E> uniqueSet() {
		// formal parameters

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return decorated().uniqueSet();
    }

}
