///*
//
//Design a lift system.
//
//2 lifts
//
//10 floors in the building
//
//*/
//
///*
//    
//    
//     G Floor
//L1 {
// level = G
//}
//
//
//L2 {
// level = G
// }
//
//S1 -> 
//P1 -> L1 -> L5
//L2 -> G
//
//s2 ->
//P2 -> 4F, 10F
//L1 -> 5, L2 -> G
//
//*/
//
//
//class Lift {
//    
//    private int level;
//    
//    public Lift() {
//        level = 0;
//    }
//    
//    public Lift(int level) {
//        this.level = level;
//    }
//    
//    public int getLevel() {
//        return level;
//    }
//    
//    public void setLevel(int level) {
//        this.level = level;
//    }
//}
//
//class Building {
//    private List<Lift> lifts;
//    
//    public Building() {
//        lifts = new ArrayList<>();
//    }
//    
//    public void addLift(Lift lift) {
//        lifts.add(lift);
//    }
//    
//    public String liftRequest(String direction, int requestedLevel) {
//        Lift lift = findServingLift(direction, requestedLevel);
//        
//        System.out.println("I am at level: " + lift.getLevel());
//        
//        if(requestedLevel > lift.getLevel()) {
//            System.out.println("Going Up...");    
//        } else {
//            System.out.println("Going Down...");    
//        }    
//        lift.setLevel(requestedLevel);
//        
//        return direction;
//        
//        // lifts.stream().filter(l -> {
//        //     int diffL1 = l.getLevel() - level;
//        //     int diffL1 = l.getLevel() - level;
//        // })
//    }
//    
//    public Lift findServingLift(String direction, int requestedLevel) {
//        Map<Lift, Interger> tempMap = new HashMap<>();
//        for(int i = 0; i < lifts.size(); i++) {
//            Lift lift = lifts.get(i); 
//            int diff = requestedLevel - lift.getLevel();
//            if(diff < 0) {
//                diff *= -1;
//            }
//            tempMap.put(lift, diff);
//        }
//        
//        // sorting the map based on its value
//        // l1 -> 1
//        // l2 -> 1
//        // l3 -> 3
//        // l4 -> 4
//        
//        // return firstElement of the map after sorting
//        
//        // l1->2, l2->6
//        // req -> 3 floor
//        // tempMap -> l1, 1 & l2, 3
//    }
//    
//    public void selectLevelToGo(String direction, int levelToGo) {
//        if("U".equals(direction)) {
//            System.out.println("I am going UP to level: " + levelToGo);
//        } else {
//            System.out.println("I am going DOWN to level: " + levelToGo);
//        }
//    }
//}
//
//public class LiftSystem {
//    
//    public static void main(String...args) {
//        Building b1 = new Building();
//        // at G floor
//        Lift l1 = new Lift();    
//        // at G floor
//        Lift l2 = new Lift();
//        
//        b1.addLift(l1);
//       
//        String direction = b1.liftRequest("U", 5);
//        b1.selectLevelToGo(direction, 8);
//        
//        // Req
//        // 1. it should go wherever
//        
//        
//        
//    }
//}