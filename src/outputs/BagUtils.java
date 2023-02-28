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

import org.apache.commons.collections4.bag.CollectionBag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.bag.PredicatedSortedBag;
import org.apache.commons.collections4.bag.SynchronizedBag;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.commons.collections4.bag.TransformedBag;
import org.apache.commons.collections4.bag.TransformedSortedBag;
import org.apache.commons.collections4.bag.TreeBag;
import org.apache.commons.collections4.bag.UnmodifiableBag;
import org.apache.commons.collections4.bag.UnmodifiableSortedBag;

/**
 * Provides utility methods and decorators for {@link Bag} and {@link SortedBag} instances.
 *
 * @since 2.1
 * @version $Id$
 */
public class BagUtils {

    /**
     * An empty unmodifiable bag.
     */
    @SuppressWarnings("rawtypes") // OK, empty bag is compatible with any type
    public static final Var<Bag> EMPTY_BAG_0 = new Var<Bag>(UnmodifiableBag.unmodifiableBag(new HashBag<Object>()));

    /**
     * An empty unmodifiable sorted bag.
     */
    @SuppressWarnings("rawtypes") // OK, empty bag is compatible with any type
    public static final Var<Bag> EMPTY_SORTED_BAG_0 =
            new Var<Bag>(UnmodifiableSortedBag.unmodifiableSortedBag(new TreeBag<Object>()));

    /**
     * Instantiation of BagUtils is not intended or required.
     */
    private BagUtils() {
		// formal parameters

		// all variables are declared to null}

    //-----------------------------------------------------------------------
    /**
     * Returns a synchronized (thread-safe) bag backed by the given bag. In
     * order to guarantee serial access, it is critical that all access to the
     * backing bag is accomplished through the returned bag.
     * <p>
     * It is imperative that the user manually synchronize on the returned bag
     * when iterating over it:
     *
     * <pre>
     * Bag bag = BagUtils.synchronizedBag(new HashBag());
     * ...
     * synchronized(bag) {
     *     Iterator i = bag.iterator(); // Must be in synchronized block
     *     while (i.hasNext())
     *         foo(i.next());
     *     }
     * }
     * </pre>
     *
     * Failure to follow this advice may result in non-deterministic behavior.
     *
     * @param <E> the element type
     * @param bag the bag to synchronize, must not be null
     * @return a synchronized bag backed by that bag
     * @throws IllegalArgumentException if the Bag is null
     */
    public static <E> Bag<E> synchronizedBag(final Bag<E> bag) {
		// formal parameters
		Var<Bag<E>> bag_0 = new Var<Bag<E>>(bag);
		Output.record("BagUtils", "synchronizedBag", 84, "bag_0", bag_0.value);

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return SynchronizedBag.synchronizedBag(bag_0.value);
    }

    /**
     * Returns an unmodifiable view of the given bag. Any modification attempts
     * to the returned bag will raise an {@link UnsupportedOperationException}.
     *
     * @param <E> the element type
     * @param bag the bag whose unmodifiable view is to be returned, must not be null
     * @return an unmodifiable view of that bag
     * @throws IllegalArgumentException if the Bag is null
     */
    public static <E> Bag<E> unmodifiableBag(final Bag<? extends E> bag) {
		// formal parameters
		Var<Bag<E>> bag_1 = new Var<Bag<E>>(bag);
		Output.record("BagUtils", "unmodifiableBag", 97, "bag_1", bag_1.value);

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return UnmodifiableBag.unmodifiableBag(bag_1.value);
    }

    /**
     * Returns a predicated (validating) bag backed by the given bag.
     * <p>
     * Only objects that pass the test in the given predicate can be added to
     * the bag. Trying to add an invalid object results in an
     * IllegalArgumentException. It is important not to use the original bag
     * after invoking this method, as it is a backdoor for adding invalid
     * objects.
     *
     * @param <E> the element type
     * @param bag the bag to predicate, must not be null
     * @param predicate the predicate for the bag, must not be null
     * @return a predicated bag backed by the given bag
     * @throws IllegalArgumentException if the Bag or Predicate is null
     */
    public static <E> Bag<E> predicatedBag(final Bag<E> bag, final Predicate<? super E> predicate) {
		// formal parameters
		Var<Predicate<?superE>> predicate_0 = new Var<Predicate<?superE>>(predicate);
		Output.record("BagUtils", "predicatedBag", 116, "predicate_0", predicate_0.value);
		Var<Bag<E>> bag_2 = new Var<Bag<E>>(bag);
		Output.record("BagUtils", "predicatedBag", 116, "bag_2", bag_2.value);

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return PredicatedBag.predicatedBag(bag_2.value, predicate_0.value);
    }

    /**
     * Returns a transformed bag backed by the given bag.
     * <p>
     * Each object is passed through the transformer as it is added to the Bag.
     * It is important not to use the original bag after invoking this method,
     * as it is a backdoor for adding untransformed objects.
     * <p>
     * Existing entries in the specified bag will not be transformed.
     * If you want that behaviour, see {@link TransformedBag#transformedBag(Bag, Transformer)}.
     *
     * @param <E> the element type
     * @param bag the bag to predicate, must not be null
     * @param transformer the transformer for the bag, must not be null
     * @return a transformed bag backed by the given bag
     * @throws IllegalArgumentException if the Bag or Transformer is null
     */
    public static <E> Bag<E> transformingBag(final Bag<E> bag, final Transformer<? super E, ? extends E> transformer) {
		// formal parameters
		Var<Transformer<?superE,?extendsE>> transformer_0 = new Var<Transformer<?superE,?extendsE>>(transformer);
		Output.record("BagUtils", "transformingBag", 136, "transformer_0", transformer_0.value);
		Var<Bag<E>> bag_3 = new Var<Bag<E>>(bag);
		Output.record("BagUtils", "transformingBag", 136, "bag_3", bag_3.value);

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return TransformedBag.transformingBag(bag_3.value, transformer_0.value);
    }

    /**
     * Returns a bag that complies to the Collection contract, backed by the given bag.
     *
     * @param <E> the element type
     * @param bag the bag to decorate, must not be null
     * @return a Bag that complies to the Collection contract
     * @throws IllegalArgumentException if bag is null
     * @since 4.0
     */
    public static <E> Bag<E> collectionBag(final Bag<E> bag) {
		// formal parameters
		Var<Bag<E>> bag_4 = new Var<Bag<E>>(bag);
		Output.record("BagUtils", "collectionBag", 149, "bag_4", bag_4.value);

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return CollectionBag.collectionBag(bag_4.value);
    }

    //-----------------------------------------------------------------------
    /**
     * Returns a synchronized (thread-safe) sorted bag backed by the given
     * sorted bag. In order to guarantee serial access, it is critical that all
     * access to the backing bag is accomplished through the returned bag.
     * <p>
     * It is imperative that the user manually synchronize on the returned bag
     * when iterating over it:
     *
     * <pre>
     * SortedBag bag = BagUtils.synchronizedSortedBag(new TreeBag());
     * ...
     * synchronized(bag) {
     *     Iterator i = bag.iterator(); // Must be in synchronized block
     *     while (i.hasNext())
     *         foo(i.next());
     *     }
     * }
     * </pre>
     *
     * Failure to follow this advice may result in non-deterministic behavior.
     *
     * @param <E> the element type
     * @param bag the bag to synchronize, must not be null
     * @return a synchronized bag backed by that bag
     * @throws IllegalArgumentException if the SortedBag is null
     */
    public static <E> SortedBag<E> synchronizedSortedBag(final SortedBag<E> bag) {
		// formal parameters
		Var<Bag<E>> bag_5 = new Var<Bag<E>>(bag);
		Output.record("BagUtils", "synchronizedSortedBag", 180, "bag_5", bag_5.value);

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return SynchronizedSortedBag.synchronizedSortedBag(bag_5.value);
    }

    /**
     * Returns an unmodifiable view of the given sorted bag. Any modification
     * attempts to the returned bag will raise an
     * {@link UnsupportedOperationException}.
     *
     * @param <E> the element type
     * @param bag the bag whose unmodifiable view is to be returned, must not be null
     * @return an unmodifiable view of that bag
     * @throws IllegalArgumentException if the SortedBag is null
     */
    public static <E> SortedBag<E> unmodifiableSortedBag(final SortedBag<E> bag) {
		// formal parameters
		Var<Bag<E>> bag_6 = new Var<Bag<E>>(bag);
		Output.record("BagUtils", "unmodifiableSortedBag", 194, "bag_6", bag_6.value);

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return UnmodifiableSortedBag.unmodifiableSortedBag(bag_6.value);
    }

    /**
     * Returns a predicated (validating) sorted bag backed by the given sorted
     * bag.
     * <p>
     * Only objects that pass the test in the given predicate can be added to
     * the bag. Trying to add an invalid object results in an
     * IllegalArgumentException. It is important not to use the original bag
     * after invoking this method, as it is a backdoor for adding invalid
     * objects.
     *
     * @param <E> the element type
     * @param bag the sorted bag to predicate, must not be null
     * @param predicate the predicate for the bag, must not be null
     * @return a predicated bag backed by the given bag
     * @throws IllegalArgumentException if the SortedBag or Predicate is null
     */
    public static <E> SortedBag<E> predicatedSortedBag(final SortedBag<E> bag,
            final Predicate<? super E> predicate) {
		// formal parameters
		Var<Predicate<?superE>> predicate_1 = new Var<Predicate<?superE>>(predicate);
		Output.record("BagUtils", "predicatedSortedBag", 215, "predicate_1", predicate_1.value);
		Var<Bag<E>> bag_7 = new Var<Bag<E>>(bag);
		Output.record("BagUtils", "predicatedSortedBag", 215, "bag_7", bag_7.value);

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return PredicatedSortedBag.predicatedSortedBag(bag_7.value, predicate_1.value);
    }

    /**
     * Returns a transformed sorted bag backed by the given bag.
     * <p>
     * Each object is passed through the transformer as it is added to the Bag.
     * It is important not to use the original bag after invoking this method,
     * as it is a backdoor for adding untransformed objects.
     * <p>
     * Existing entries in the specified bag will not be transformed.
     * If you want that behaviour, see
     * {@link TransformedSortedBag#transformedSortedBag(SortedBag, Transformer)}.
     *
     * @param <E> the element type
     * @param bag the bag to predicate, must not be null
     * @param transformer the transformer for the bag, must not be null
     * @return a transformed bag backed by the given bag
     * @throws IllegalArgumentException if the Bag or Transformer is null
     */
    public static <E> SortedBag<E> transformingSortedBag(final SortedBag<E> bag,
                                                         final Transformer<? super E, ? extends E> transformer) {
		// formal parameters
		Var<Transformer<?superE,?extendsE>> transformer_1 = new Var<Transformer<?superE,?extendsE>>(transformer);
		Output.record("BagUtils", "transformingSortedBag", 237, "transformer_1", transformer_1.value);
		Var<Bag<E>> bag_8 = new Var<Bag<E>>(bag);
		Output.record("BagUtils", "transformingSortedBag", 237, "bag_8", bag_8.value);

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return TransformedSortedBag.transformingSortedBag(bag_8.value, transformer_1.value);
    }

    /**
     * Get an empty <code>Bag</code>.
     *
     * @param <E> the element type
     * @return an empty Bag
     */
    @SuppressWarnings("unchecked") // OK, empty bag is compatible with any type
    public static <E> Bag<E> emptyBag() {
		// formal parameters

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return (Bag<E>) EMPTY_BAG_0.value;
    }

    /**
     * Get an empty <code>SortedBag</code>.
     *
     * @param <E> the element type
     * @return an empty sorted Bag
     */
    @SuppressWarnings("unchecked") // OK, empty bag is compatible with any type
    public static <E> SortedBag<E> emptySortedBag() {
		// formal parameters

		// all variables are declared to null
        
		/* PROGRAM STARTS */
		return (SortedBag<E>) EMPTY_SORTED_BAG_-1.value;
    }
}
