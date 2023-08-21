Collections:
------------
-> A collection allows a group of objects to be treated as a SINGLE UNIT.
-> Java Collection Framework provides various Standard utility classes.
-> java.util package.
-> It contains main three parts:
    1. The core Interfaces.
    2. A set of implementations i.e concrete classes
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

-> A class which implements Iterable can be used in for each loop as that class is implemented Iterator internally.

Collection Interface:
---------------------
-> boolean containsAll(Collection<?> c)
-> boolean addAll(Collection<? extends E> c)
-> boolean removeAll(Collection<?> c)
-> boolean retainAll(Collection<?> c)
-> void clear()

Lists:
--------
-> List are collections that maintain thier elements in order and can contain duplicates.
-> The elements in list are ordered.
-> Each element are position based starting from index 0.

List Methods:
--------------
-> E get(int index)
-> E set(int index,E element)
-> void add(int index,E element)
-> boolean addAll(int index,Collection<? extends E>c)
-> E remove(int index)

Implementation Classes of List:
------------------------------
1. ArrayList  2.Vector  3.

ArrayList Class: (Mostly ArrayList is prefered)
-----------
-> Used when we dont know the size of the array you gonna used.
-> It is a dynamic array.
-> Internally ,it uses a normal array with a particular size ,when the capacity exceeds , it creates a new array of bigger size(50% of its current size) and copies all the elements from the old array to new array. Dont worry about its complexity ,according to Amortised Time complexity id is O(1).
-> Old array is collected by Garbage collector.

Vector Class:
--------------

-> It is a legacy class.
-> Both the ArrayList and Vectors are implemented dynamically.
-> resizable arrays,providing fast random access.
-> list traversal.
-> Unlike ArrayList ,Vectors are THREAD-SAFE i.e concurrent calls of vectors does not compromise their integrity.
-> Performance of Vectors are compartively slow because of its Syrchonisation.

LinkedList Class:
------------------

-> Implemented using DoubleLinkedList.
-> Insertions and Deletions are very efficient in LinkedList.


