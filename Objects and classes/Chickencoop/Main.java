
public class Chickencoop {

   //declare methods
     double area = 120.23;
	 // double are for the closed part of the bird building in square meters
	 int floors = 2;
	 int subfloors = 5;
	 int capacity = 250;
	 // capacity of the chickencoop
	 int sections = 6;
	 String type = Scanner.nextLine();
	 int numberdifferentbreeds = Integer.parseInt(scanner.nextLine);
	 
  // Add List with breeds of chickens
	 List <Chicken> chicken = new ArrayList<>();
	 
   // add them with for cycle and separate the data with ":"
	 for (int i = 0; i < numberdifferentbreeds; i++) {
	    String[] data = scanner.nextLine().split(":");
		String breed = data[0];
		String quantity = data[1];
	 
	 Chicken chicken = new Chicken(breed, quantity);
	    chicken.setbreed(breed);
	    chicken.setquantity(quantity);
        chicken.add(chicken);
     }

     String breedList = scanner.nextLine();
        if(breedList.equals("all")){
           for(Chicken chicken : chickens){
             System.out.println(chicken.getbreed());
			}
        }else{
     	  for(Chicken chicken : chickens){
		   if(chicken.getTypeList().equals(typeList)){
          System.out.println(chicken.getbreed());
	        }
		  }
       }
     }
   }
