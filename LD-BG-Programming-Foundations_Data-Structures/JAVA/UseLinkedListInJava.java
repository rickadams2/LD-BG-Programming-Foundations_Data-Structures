    import java.util.LinkedList; 

    public class MyClass {
        public static void main(String args[]) {
            LinkedList travelBucketList = new LinkedList();
            
            // Add items 
            travelBucketList.add("Santorini, Greece"); 
            travelBucketList.addFirst("Barcelona, Spain"); 
            travelBucketList.addLast("Lima, Peru"); 
            travelBucketList.add(2,"Paris, France");

            System.out.println(travelBucketList); 

            /// Access
            System.out.println(travelBucketList.get(2)); 
            System.out.println(travelBucketList.getFirst()); 
            
            System.out.println(travelBucketList.contains("Lima, Peru")); 

            // remove items 
            travelBucketList.removeFirst(); 
            travelBucketList.removeLast(); 
            travelBucketList.remove(0); 
            System.out.println(travelBucketList);

            travelBucketList.remove("Santorini, Greece"); 
            travelBucketList.remove(0); 
            System.out.println(travelBucketList); 
        }
    }