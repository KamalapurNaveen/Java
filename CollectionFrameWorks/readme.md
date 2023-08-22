Collections:
------------
1. A collection allows a group of objects to be treated as a SINGLE UNIT.  
2. Java Collection Framework provides various Standard utility classes.
3. java.util package.
4. It contains main three parts:
    1. The core Interfaces.
    2. A set of implementations i.e concrete classes.
    3.static utility methods found in the Collections and Arrays classes such as sorting and searching.

1.Core Interfaces:
-------------------
                      java.lang.Iterable<E>
                     -----------------------
                               /_\
                                |
                                |
                          Collection<E>
            --------------------------------------------
            |                   |                      |
            |                   |                      |
        List<E>              Queue<E>                Set<E>                      Map<K,V>
                            -----------             ----------                  ----------
                                |                        |                          |
                                |                        |                          |
                            Deque<E>                 SortedSet<E>               SortedMap<K,V>
                                                         |                          |
                                                         |                          |
                                                     NavigableSet<E>            NavigableMap<K,V>

. A class which implements Iterable can be used in for each loop as that class is implemented Iterator internally.

Collection Interface:
---------------------
1.boolean containsAll(Collection<?> c)
2. boolean addAll(Collection<? extends E> c)
3. boolean removeAll(Collection<?> c)
4. boolean retainAll(Collection<?> c)
5. void clear()

Lists:
--------
1. List are collections that maintain thier elements in order and can contain duplicates.
2. The elements in list are ordered.
3. Each element are position based starting from index 0.

List Methods:
--------------
1. E get(int index)
2. E set(int index,E element)
3. void add(int index,E element)
4. boolean addAll(int index,Collection<? extends E>c)
5. E remove(int index)

Implementation Classes of List:
------------------------------
1. ArrayList  2.Vector  3.LinkedList

ArrayList Class: (Mostly ArrayList is prefered)
-----------
1. Used when we dont know the size of the array you gonna used.
2. It is a dynamic array.
3. Internally ,it uses a normal array with a particular size ,when the capacity exceeds , it creates a new array of bigger size(50% of its current size) and copies all the elements from the old array to new array. Dont worry about its complexity ,according to Amortised Time complexity id is O(1).
4. Old array is collected by Garbage collector.

Vector Class:
--------------

1. It is a legacy class.
2. Both the ArrayList and Vectors are implemented dynamically.
3. resizable arrays,providing fast random access.
4. list traversal.
5. Unlike ArrayList ,Vectors are THREAD-SAFE i.e concurrent calls of vectors does not compromise their integrity.
6. Performance of Vectors are compartively slow because of its Syrchonisation.

LinkedList Class:
------------------

1. Implemented using DoubleLinkedList.
2. Insertions and Deletions are very efficient in LinkedList.


