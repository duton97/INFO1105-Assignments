package bst;
/**
 * This section is for INFO1905 students only.
 * 
 * @author put your unikey here
 * @author and your partner's unikey, if working in a pair
 * 
 * This class, BalanacedBst, should be your solution to part
 * 3 of the INFO1905 assignment.
 * 
 * It should remain in the "bst" package.
 */

public class BalancedBst<E extends Comparable<E>> extends SimpleBst<E>
{

	//constructor
	public BalancedBst() {
		super(); //call the constructor of SimpleTree with no arguments
	}

	/**
	 * PART 3 (INFO1905)
	 * 
	 * If you are enrolled in INFO1905, implement the following methods, which
	 * allow balanced insertion and deletion to a binary search tree. You may
	 * assume that the tree is a balanced binary search tree before either of
	 * these methods are called.
	 * 
	 */

	public boolean add(E value) {
		// if value is already in the balanced BST, do nothing and return false
		// otherwise, add value to the balanced binary search tree (BST) and return true
		// use the algorithm shown in the week 6 lecture - the BST must remain balanced
		return false;
	}

	public boolean remove(E value) {
		// if value is in the balanced BST, remove it and return true
		// otherwise, do nothing and return false
		// use the algorithm shown in the week 6 lecture - the BST must remain balanced
		return false;
	}

}
	

	