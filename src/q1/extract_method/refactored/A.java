package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      findItem(nodes, p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      findItem(edgeList, p);
      return null;
   }

   // TODO: Your answer
   // ? extractedMethod(?) {
   //
   // }
   
   private <T> void findItem(List<T> list, String p)
   {
	   for (T item : list)
	   {
		   if (((Node) item).contains(p))
			   System.out.println(item);
	   }
   }
}

class Node {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge {
   String name;

   public boolean contains(String p) {
       return name.contains(p);
   }
}