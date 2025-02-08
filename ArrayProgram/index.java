public add(E e): Adds an element to the end of the list.

java
Copy
boolean add(E e);
Example:

java
Copy
list.add("Hello");
add(int index, E element): Inserts an element at the specified position.

java
Copy
void add(int index, E element);
Example:

java
Copy
list.add(1, "World");
addAll(Collection<? extends E> c): Adds all elements from a collection to the end of the list.

java
Copy
boolean addAll(Collection<? extends E> c);
Example:

java
Copy
list.addAll(anotherList);
addAll(int index, Collection<? extends E> c): Adds all elements from a collection at the specified position.

java
Copy
boolean addAll(int index, Collection<? extends E> c);
Example:

java
Copy
list.addAll(2, anotherList);
2. Removing Elements
remove(Object o): Removes the first occurrence of the specified element.

java
Copy
boolean remove(Object o);
Example:

java
Copy
list.remove("Hello");
remove(int index): Removes the element at the specified position.

java
Copy
E remove(int index);
Example:

java
Copy
list.remove(0);
removeAll(Collection<?> c): Removes all elements in the list that are also in the specified collection.

java
Copy
boolean removeAll(Collection<?> c);
Example:

java
Copy
list.removeAll(anotherList);
clear(): Removes all elements from the list.

java
Copy
void clear();
Example:

java
Copy
list.clear();
3. Accessing Elements
get(int index): Returns the element at the specified position.

java
Copy
E get(int index);
Example:

java
Copy
String element = list.get(0);
set(int index, E element): Replaces the element at the specified position with the given element.

java
Copy
E set(int index, E element);
Example:

java
Copy
list.set(1, "Java");
4. Checking Elements
contains(Object o): Checks if the list contains the specified element.

java
Copy
boolean contains(Object o);
Example:

java
Copy
boolean hasElement = list.contains("Hello");
containsAll(Collection<?> c): Checks if the list contains all elements of the specified collection.

java
Copy
boolean containsAll(Collection<?> c);
Example:

java
Copy
boolean hasAll = list.containsAll(anotherList);
isEmpty(): Checks if the list is empty.

java
Copy
boolean isEmpty();
Example:

java
Copy
boolean empty = list.isEmpty();
5. Size and Capacity
size(): Returns the number of elements in the list.

java
Copy
int size();
Example:

java
Copy
int size = list.size();
ensureCapacity(int minCapacity): Increases the capacity of the list to ensure it can hold at least the specified number of elements.

java
Copy
void ensureCapacity(int minCapacity);
Example:

java
Copy
list.ensureCapacity(100);
trimToSize(): Trims the capacity of the list to its current size.

java
Copy
void trimToSize();
Example:

java
Copy
list.trimToSize();
6. Iterating Over Elements
iterator(): Returns an iterator over the elements in the list.

java
Copy
Iterator<E> iterator();
Example:

java
Copy
Iterator<String> it = list.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
listIterator(): Returns a list iterator over the elements in the list.

java
Copy
ListIterator<E> listIterator();
Example:

java
Copy
ListIterator<String> listIt = list.listIterator();
while (listIt.hasNext()) {
    System.out.println(listIt.next());
}
listIterator(int index): Returns a list iterator starting at the specified position.

java
Copy
ListIterator<E> listIterator(int index);
Example:

java
Copy
ListIterator<String> listIt = list.listIterator(2);
7. Searching Elements
indexOf(Object o): Returns the index of the first occurrence of the specified element, or -1 if not found.

java
Copy
int indexOf(Object o);
Example:

java
Copy
int index = list.indexOf("Hello");
lastIndexOf(Object o): Returns the index of the last occurrence of the specified element, or -1 if not found.

java
Copy
int lastIndexOf(Object o);
Example:

java
Copy
int lastIndex = list.lastIndexOf("Hello");
8. Sublist
subList(int fromIndex, int toIndex): Returns a view of the portion of the list between the specified fromIndex (inclusive) and toIndex (exclusive).

java
Copy
List<E> subList(int fromIndex, int toIndex);
Example:

java
Copy
List<String> subList = list.subList(1, 3);
9. Conversion
toArray(): Returns an array containing all elements in the list.

java
Copy
Object[] toArray();
Example:

java
Copy
Object[] array = list.toArray();
toArray(T[] a): Returns an array containing all elements in the list, with the runtime type of the specified array.

java
Copy
<T> T[] toArray(T[] a);
Example:

java
Copy
String[] array = list.toArray(new String[0]);
10. Sorting
sort(Comparator<? super E> c): Sorts the list according to the specified comparator.

java
Copy
void sort(Comparator<? super E> c);
Example:

java
Copy
list.sort(Comparator.naturalOrder());
11. Other Methods
retainAll(Collection<?> c): Retains only the elements in the list that are also in the specified collection.

java
Copy
boolean retainAll(Collection<?> c);
Example:

java
Copy
list.retainAll(anotherList);
replaceAll(UnaryOperator<E> operator): Replaces each element in the list with the result of applying the operator.

java
Copy
void replaceAll(UnaryOperator<E> operator);
Example:

java
Copy
list.replaceAll(String::toUpperCase);
forEach(Consumer<? super E> action): Performs the given action for each element in the list.

java
Copy
void forEach(Consumer<? super E> action);
Example:

java
Copy
list.forEach(System.out::println); {
    
}
