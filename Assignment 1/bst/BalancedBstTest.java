package bst;

import static org.junit.Assert.*;

import org.junit.Test;

public class BalancedBstTest {

	@Test (timeout=1000)
	public void testOrderedInsert() {

		BalancedBst<String> bst = new BalancedBst<String>();
		
		// insert a,b,c,d should result in:
		//    b
		//  a   c
		//       d
		bst.insert("a");
		bst.insert("b");
		bst.insert("c");
		bst.insert("d");
		assertEquals("a", bst.root().getLeft().getElement());
		assertEquals("b", bst.root().getElement());
		assertEquals("c", bst.root().getRight().getElement());
		assertEquals("d", bst.root().getRight().getRight().getElement());
		assertEquals(4, bst.size());
		
		// insert e should result in:
		//    b
		//  a   d
		//     c e
		bst.insert("d");
		bst.insert("e");
		assertEquals("a", bst.root().getLeft().getElement());
		assertEquals("b", bst.root().getElement());
		assertEquals("c", bst.root().getRight().getLeft().getElement());
		assertEquals("d", bst.root().getRight().getElement());
		assertEquals("e", bst.root().getRight().getRight().getElement());
		assertEquals(5, bst.size());
		
		// insert f should result in:
		//    d
		//  b   e
		// a c   f
		bst.insert("f");
		assertEquals("a", bst.root().getLeft().getLeft().getElement());
		assertEquals("b", bst.root().getLeft().getElement());
		assertEquals("c", bst.root().getLeft().getRight().getElement());
		assertEquals("d", bst.root().getElement());
		assertEquals("e", bst.root().getRight().getElement());
		assertEquals("f", bst.root().getRight().getRight().getElement());
		assertEquals(6, bst.size());
		
		// insert g should then give us:
		//    d
		//  b   f
		// a c e g
		bst.insert("g");
		assertEquals("a", bst.root().getLeft().getLeft().getElement());
		assertEquals("b", bst.root().getLeft().getElement());
		assertEquals("c", bst.root().getLeft().getRight().getElement());
		assertEquals("d", bst.root().getElement());
		assertEquals("e", bst.root().getRight().getElement());
		assertEquals("f", bst.root().getRight().getRight().getElement());
		assertEquals(7, bst.size());
 	 		     
	}

}
