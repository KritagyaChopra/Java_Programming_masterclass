public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytess){
        if(kiloBytess<0){
            System.out.println("Invalid Value");
        }
        else{
            int megaBytes = kiloBytess/1024;
            int remainingKiloBytes = kiloBytess - 1024*megaBytes ;
            System.out.println(kiloBytess+" KB = "+megaBytes+" MB and "+remainingKiloBytes+" KB");
        }
    }
}
