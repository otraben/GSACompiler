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

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;

import org.apache.commons.collections4.Bag;

/**
 * Decorates another {@link Bag} to comply with the Collection contract.
 * <p>
 * By decorating an existing {@link Bag} instance with a {@link CollectionBag},
 * it can be safely passed on to methods that require Collection types that
 * are fully compliant with the Collection contract.
 * <p>
 * The method javadoc highlights the differences compared to the original Bag interface.
 *
 * @see Bag
 * @param <E> the type held in the bag
 * @since 4.0
 * @version $Id$
 */
public final class CollectionBag<E> extends AbstractBagDecorator<E> {

    /** Serialization version */
    private static final Var<Long> serialVersionUID_0 = new Var<Long>(-2560033712679053143L);

    /**
     * Factory method to create a bag that complies to the Collection contract.
     *
     * @param <E> the type of the elements in the bag
     * @param bag  the bag to decorate, must not be null
     * @return a Bag that complies to the Collection contract
     * @throws IllegalArgumentException if bag is null
     */
    public static <E> Bag<E> collectionBag(final Bag<E> bag) {
		// formal parameters
		Var<Bag<E>> bag_0 = new Var<Bag<E>>(bag);
		Output.record("CollectionBag", "collectionBag", 54, "bag_0", bag_0.value);

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return new CollectionBag<E>(bag_0.value);
    }

    //-----------------------------------------------------------------------
    /**
     * Constructor that wraps (not copies).
     *
     * @param bag  the bag to decorate, must not be null
     * @throws IllegalArgumentException if bag is null
     */
    public CollectionBag(final Bag<E> bag) {
        super(bag_0.value);
    }

    //-----------------------------------------------------------------------
    /**
     * Write the collection out using a custom routine.
     *
     * @param out  the output stream
     * @throws IOException
     */
    private void writeObject(final ObjectOutputStream out) throws IOException {
		// formal parameters
		Var<ObjectOutputStream> out_0 = new Var<ObjectOutputStream>(out);
		Output.record("CollectionBag", "writeObject", 76, "out_0", out_0.value);

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		out_0.value.defaultWriteObject();
        out_0.value.writeObject(decorated());
    }

    /**
     * Read the collection in using a custom routine.
     *
     * @param in  the input stream
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws ClassCastException if deserialised object has wrong type
     */
    @SuppressWarnings("unchecked") // will throw CCE, see Javadoc
    private void readObject(final ObjectInputStream in) throws IOException, ClassNotFoundException {
		// formal parameters
		Var<ObjectInputStream> in_0 = new Var<ObjectInputStream>(in);
		Output.record("CollectionBag", "readObject", 90, "in_0", in_0.value);

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		in_0.value.defaultReadObject();
        setCollection((Collection<E>) in_0.value.readObject());
    }

    //-----------------------------------------------------------------------
    // Collection interface
    //-----------------------------------------------------------------------

    /**
     * <i>(Change)</i>
     * Returns <code>true</code> if the bag contains all elements in
     * the given collection, <b>not</b> respecting cardinality. That is,
     * if the given collection <code>coll</code> contains at least one of
     * every object contained in this object.
     *
     * @param coll  the collection to check against
     * @return <code>true</code> if the Bag contains at least on of every object in the collection
     */
    @Override
    public boolean containsAll(final Collection<?> coll) {
		// formal parameters
		Var<Collection<?>> coll_0 = new Var<Collection<?>>(coll);
		Output.record("CollectionBag", "containsAll", 110, "coll_0", coll_0.value);

		// all variables are declared to null
		Var<Iterator<?>> e_0 = null;
        
		/* PROGRAM STARTS */
		e_0 = new Var<Iterator<?>>(coll_0.value.iterator());
		Output.record("CollectionBag", "containsAll", 111, "e_0", e_0.value);
        while (Phi.Entry(e_0,e_0).value.hasNext()) {
            if(!contains(Phi.Entry(e_-1,e_0).value.next())) {
                return false;
            }
        }
        return true;
    }

    /**
     * <i>(Change)</i>
     * Adds one copy of the specified object to the Bag.
     * <p>
     * Since this method always increases the size of the bag, it
     * will always return <code>true</code>.
     *
     * @param object  the object to add
     * @return <code>true</code>, always
     */
    @Override
    public boolean add(final E object) {
		// formal parameters
		Var<E> object_0 = new Var<E>(object);
		Output.record("CollectionBag", "add", 131, "object_0", object_0.value);

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return add(object_0.value, 1);
    }

    @Override
    public boolean addAll(final Collection<? extends E> coll) {
		// formal parameters
		Var<Collection<?>> coll_1 = new Var<Collection<?>>(coll);
		Output.record("CollectionBag", "addAll", 136, "coll_1", coll_1.value);

		// all variables are declared to null
		Var<Boolean> changed_0 = null;
		Var<Iterator<?extendsE>> i_0 = null;
		Var<Boolean> added_0 = null;
		Var<Boolean> changed_1 = null;
		Var<Boolean> changed_2 = null;
        
		/* PROGRAM STARTS */
		changed_0 = new Var<Boolean>(false);
		Output.record("CollectionBag", "addAll", 137, "changed_0", changed_0.value);
        i_0 = new Var<Iterator<?extendsE>>(coll_1.value.iterator());
		Output.record("CollectionBag", "addAll", 138, "i_0", i_0.value);
        while (Phi.Entry(i_0,i_0).value.hasNext()) {
            added_0 = new Var<Boolean>(add(Phi.Entry(i_0,i_0).value.next(), 1));
			Output.record("CollectionBag", "addAll", 140, "added_0", added_0.value);
            changed_1 = new Var<Boolean>(Phi.Entry(changed_0,changed_1).value || added_0.value);
			Output.record("CollectionBag", "addAll", 141, "changed_1", changed_1.value);
        }
		changed_2 = Phi.Exit(changed_0,changed_1);
		Output.record("CollectionBag", "addAll", 139, "changed_2", changed_2.value);
        return changed_2.value;
    }

    /**
     * <i>(Change)</i>
     * Removes the first occurrence of the given object from the bag.
     * <p>
     * This will also remove the object from the {@link #uniqueSet()} if the
     * bag contains no occurrence anymore of the object after this operation.
     *
     * @param object  the object to remove
     * @return <code>true</code> if this call changed the collection
     */
    @Override
    public boolean remove(final Object object) {
		// formal parameters
		Var<E> object_1 = new Var<E>(object);
		Output.record("CollectionBag", "remove", 157, "object_1", object_1.value);

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return remove(object_1.value, 1);
    }

    /**
     * <i>(Change)</i>
     * Remove all elements represented in the given collection,
     * <b>not</b> respecting cardinality. That is, remove <i>all</i>
     * occurrences of every object contained in the given collection.
     *
     * @param coll  the collection to remove
     * @return <code>true</code> if this call changed the collection
     */
    @Override
    public boolean removeAll(final Collection<?> coll) {
		// formal parameters
		Var<Collection<?>> coll_2 = new Var<Collection<?>>(coll);
		Output.record("CollectionBag", "removeAll", 171, "coll_2", coll_2.value);

		// all variables are declared to null
		Var<Boolean> result_0 = null;
		Var<Iterator<?>> i_1 = null;
		Var<Object> obj_0 = null;
		Var<Boolean> changed_3 = null;
		Var<Boolean> result_1 = null;
		Var<Boolean> result_2 = null;
        
		/* PROGRAM STARTS */
		if (coll_2.value != null) {
            result_0 = new Var<Boolean>(false);
			Output.record("CollectionBag", "removeAll", 173, "result_0", result_0.value);
            i_1 = new Var<Iterator<?>>(coll_2.value.iterator());
			Output.record("CollectionBag", "removeAll", 174, "i_1", i_1.value);
            while (Phi.Entry(i_1,i_1).value.hasNext()) {
                obj_0 = new Var<Object>(Phi.Entry(i_1,i_1).value.next());
				Output.record("CollectionBag", "removeAll", 176, "obj_0", obj_0.value);
                changed_3 = new Var<Boolean>(remove(obj_0.value, getCount(obj_0.value)));
				Output.record("CollectionBag", "removeAll", 177, "changed_3", changed_3.value);
                result_1 = new Var<Boolean>(Phi.Entry(result_0,result_1).value || changed_3.value);
				Output.record("CollectionBag", "removeAll", 178, "result_1", result_1.value);
            }
			result_2 = Phi.Exit(result_0,result_1);
			Output.record("CollectionBag", "removeAll", 175, "result_2", result_2.value);
            return result_2.value;
        } else {
            // let the decorated bag handle the case of null argument
            return decorated().removeAll(null);
        }
    }

    /**
     * <i>(Change)</i>
     * Remove any members of the bag that are not in the given collection,
     * <i>not</i> respecting cardinality. That is, any object in the given
     * collection <code>coll</code> will be retained in the bag with the same
     * number of copies prior to this operation. All other objects will be
     * completely removed from this bag.
     * <p>
     * This implementation iterates over the elements of this bag, checking
     * each element in turn to see if it's contained in <code>coll</code>.
     * If it's not contained, it's removed from this bag. As a consequence,
     * it is advised to use a collection type for <code>coll</code> that provides
     * a fast (e.g. O(1)) implementation of {@link Collection#contains(Object)}.
     *
     * @param coll  the collection to retain
     * @return <code>true</code> if this call changed the collection
     */
    @Override
    public boolean retainAll(final Collection<?> coll) {
		// formal parameters
		Var<Collection<?>> coll_3 = new Var<Collection<?>>(coll);
		Output.record("CollectionBag", "retainAll", 205, "coll_3", coll_3.value);

		// all variables are declared to null
		Var<Boolean> modified_0 = null;
		Var<Iterator<E>> e_1 = null;
		Var<Boolean> modified_1 = null;
		Var<Boolean> modified_2 = null;
        
		/* PROGRAM STARTS */
		if (coll_3.value != null) {
            modified_0 = new Var<Boolean>(false);
			Output.record("CollectionBag", "retainAll", 207, "modified_0", modified_0.value);
            e_1 = new Var<Iterator<E>>(iterator());
			Output.record("CollectionBag", "retainAll", 208, "e_1", e_1.value);
            while (Phi.Entry(e_1,e_1).value.hasNext()) {
                if (!Phi.Entry(coll_3,coll_3).value.contains(Phi.Entry(e_0,e_1).value.next())) {
                    e_1.value.remove();
                    modified_1 = new Var<Boolean>(true);
					Output.record("CollectionBag", "retainAll", 212, "modified_1", modified_1.value);
                }
            }
			modified_2 = Phi.Exit(modified_0,modified_1);
			Output.record("CollectionBag", "retainAll", 209, "modified_2", modified_2.value);
            return modified_2.value;
        } else {
            // let the decorated bag handle the case of null argument
            return decorated().retainAll(null);
        }
    }

    //-----------------------------------------------------------------------
    // Bag interface
    //-----------------------------------------------------------------------

    /**
     * <i>(Change)</i>
     * Adds <code>count</code> copies of the specified object to the Bag.
     * <p>
     * Since this method always increases the size of the bag, it
     * will always return <code>true</code>.
     *
     * @param object  the object to add
     * @param count  the number of copies to add
     * @return <code>true</code>, always
     */
    @Override
    public boolean add(final E object, final int count) {
		// formal parameters
		Var<Integer> count_0 = new Var<Integer>(count);
		Output.record("CollectionBag", "add", 238, "count_0", count_0.value);
		Var<E> object_2 = new Var<E>(object);
		Output.record("CollectionBag", "add", 238, "object_2", object_2.value);

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		decorated().add(object_2.value, count_0.value);
        return true;
    }

}
