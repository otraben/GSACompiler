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
package outputs;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * An implementation of the {@link java.util.Stack} API that is based on an
 * <code>ArrayList</code> instead of a <code>Vector</code>, so it is not
 * synchronized to protect against multi-threaded access.  The implementation
 * is therefore operates faster in environments where you do not need to
 * worry about multiple thread contention.
 * <p>
 * The removal order of an <code>ArrayStack</code> is based on insertion
 * order: The most recently added element is removed first.  The iteration
 * order is <i>not</i> the same as the removal order.  The iterator returns
 * elements from the bottom up.
 * <p>
 * Unlike <code>Stack</code>, <code>ArrayStack</code> accepts null entries.
 * <p>
 * <b>Note:</b> From version 4.0 onwards, this class does not implement the
 * removed {@code Buffer} interface anymore.
 *
 * @see java.util.Stack
 * @since 1.0
 * @version $Id$
 * @deprecated use {@link java.util.ArrayDeque} instead (available from Java 1.6)
 */
@Deprecated
public class ArrayStack<E> extends ArrayList<E> {

    /** Ensure serialization compatibility */
    private static final Var<Long> serialVersionUID_0 = new Var<Long>(2130079159931574599L);

    /**
     * Constructs a new empty <code>ArrayStack</code>. The initial size
     * is controlled by <code>ArrayList</code> and is currently 10.
     */
    public ArrayStack() {
		// formal parameters

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		super();
    }

    /**
     * Constructs a new empty <code>ArrayStack</code> with an initial size.
     *
     * @param initialSize  the initial size to use
     * @throws IllegalArgumentException  if the specified initial size
     *  is negative
     */
    public ArrayStack(final int initialSize) {
        super(initialSize);
    }

    /**
     * Return <code>true</code> if this stack is currently empty.
     * <p>
     * This method exists for compatibility with <code>java.util.Stack</code>.
     * New users of this class should use <code>isEmpty</code> instead.
     *
     * @return true if the stack is currently empty
     */
    public boolean empty() {
		// formal parameters

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return isEmpty();
    }

    /**
     * Returns the top item off of this stack without removing it.
     *
     * @return the top item on the stack
     * @throws EmptyStackException  if the stack is empty
     */
    public E peek() throws EmptyStackException {
		// formal parameters

		// all variables are declared to null
		Var<Integer> n_0 = null;
        
		/* PROGRAM STARTS */
		n_0 = new Var<Integer>(size());
		Output.record("ArrayStack", "peek", 88, "n_0", n_0.value);
        if (n_0.value <= 0) {
            throw new EmptyStackException();
        } else {
            return get(n_0.value - 1);
        }
    }

    /**
     * Returns the n'th item down (zero-relative) from the top of this
     * stack without removing it.
     *
     * @param n  the number of items down to go
     * @return the n'th item on the stack, zero relative
     * @throws EmptyStackException  if there are not enough items on the
     *  stack to satisfy this request
     */
    public E peek(final int n) throws EmptyStackException {
		// formal parameters
		Var<Integer> n_1 = new Var<Integer>(n);
		Output.record("ArrayStack", "peek", 105, "n_1", n_1.value);

		// all variables are declared to null
		Var<Integer> m_0 = null;
        
		/* PROGRAM STARTS */
		m_0 = new Var<Integer>((size() - n_1.value) - 1);
		Output.record("ArrayStack", "peek", 106, "m_0", m_0.value);
        if (m_0.value < 0) {
            throw new EmptyStackException();
        } else {
            return get(m_0.value);
        }
    }

    /**
     * Pops the top item off of this stack and return it.
     *
     * @return the top item on the stack
     * @throws EmptyStackException  if the stack is empty
     */
    public E pop() throws EmptyStackException {
		// formal parameters

		// all variables are declared to null
		Var<Integer> n_2 = null;
        
		/* PROGRAM STARTS */
		n_2 = new Var<Integer>(size());
		Output.record("ArrayStack", "pop", 121, "n_2", n_2.value);
        if (n_2.value <= 0) {
            throw new EmptyStackException();
        } else {
            return remove(n_2.value - 1);
        }
    }

    /**
     * Pushes a new item onto the top of this stack. The pushed item is also
     * returned. This is equivalent to calling <code>add</code>.
     *
     * @param item  the item to be added
     * @return the item just pushed
     */
    public E push(final E item) {
		// formal parameters
		Var<E> item_0 = new Var<E>(item);
		Output.record("ArrayStack", "push", 136, "item_0", item_0.value);

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		add(item_0.value);
        return item_0.value;
    }

    /**
     * Returns the one-based position of the distance from the top that the
     * specified object exists on this stack, where the top-most element is
     * considered to be at distance <code>1</code>.  If the object is not
     * present on the stack, return <code>-1</code> instead.  The
     * <code>equals()</code> method is used to compare to the items
     * in this stack.
     *
     * @param object  the object to be searched for
     * @return the 1-based depth into the stack of the object, or -1 if not found
     */
    public int search(final Object object) {
		// formal parameters
		Var<Object> object_0 = new Var<Object>(object);
		Output.record("ArrayStack", "search", 152, "object_0", object_0.value);

		// all variables are declared to null
		Var<Integer> i_0 = null;
		Var<Integer> n_3 = null;
		Var<Object> current_0 = null;
		Var<Integer> i_1 = null;
		Var<Integer> n_4 = null;
		Var<Integer> i_2 = null;
		Var<Integer> n_5 = null;
        
		/* PROGRAM STARTS */
		i_0 = new Var<Integer>(size() - 1);
		Output.record("ArrayStack", "search", 153, "i_0", i_0.value);        // Current index
        n_3 = new Var<Integer>(1);
		Output.record("ArrayStack", "search", 154, "n_3", n_3.value);                 // Current distance
        while (Phi.Entry(i_0,i_1).value >= 0) {
            current_0 = new Var<Object>(get(Phi.Entry(i_0,i_1).value));
			Output.record("ArrayStack", "search", 156, "current_0", current_0.value);
            if ((Phi.Entry(object_0,object_0).value == null && current_0.value == null) ||
                (Phi.Entry(object_0,object_0).value != null && Phi.Entry(object_0,object_0).value.equals(current_0.value))) {
                return Phi.Entry(n_3,n_4).value;
            }
            i_1 = new Var<Integer>(Phi.Entry(i_0,i_1).value - 1);
			Output.record("ArrayStack", "search", 161, "i_1", i_1.value);
            n_4 = new Var<Integer>(Phi.Entry(n_3,n_4).value + 1);
			Output.record("ArrayStack", "search", 162, "n_4", n_4.value);
        }
		i_2 = Phi.Exit(i_0,i_1);
		Output.record("ArrayStack", "search", 155, "i_2", i_2.value);
		n_5 = Phi.Exit(n_3,n_4);
		Output.record("ArrayStack", "search", 155, "n_5", n_5.value);
        return -1;
    }

}
