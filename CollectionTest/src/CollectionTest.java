import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Collection>  s=new ArrayList<Collection>();
		s.add(new Collection(101, "saurav", "mathes"));
		s.add(new Collection(101, "saurav", "mathes"));
		s.add(new Collection(103, "pramod", "bio"));
		s.add(new Collection(104, "abhishek", "mathes"));
		s.add(new Collection(101, "saurav", "mathes"));
		
		 List<Collection> list= new ArrayList<Collection>();
		 
		  list.addAll(s);
		  
		  
		   Set<Integer> stuIds= new HashSet<Integer>();//flag that keeps employee ids
		  
		  for(Iterator<Collection> it=list.listIterator();it.hasNext();){
			  Collection stu=(Collection)it.next();
		  
		   
		   if(stuIds.add(stu.getRoll_no())==false){//if found duplicate remove from the list
		    it.remove();
		   }
		  }
		  
		  for(Collection stu:list){
		   System.out.println(stu.getRoll_no());
		   System.out.println(stu.getName());
		  }

	}

}

