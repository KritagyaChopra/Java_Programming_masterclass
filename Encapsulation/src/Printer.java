public class Printer {
    private int tonerLevel=-1;
    private  int pagesPrinted =0;
    private boolean duplex;

    public int addToner(int tonerAmount){
        if(tonerAmount<0 || tonerAmount>100 || tonerAmount+tonerLevel>100){
            return -1;
        }
        else {
            tonerLevel+=tonerAmount;
            return tonerLevel;
        }
    }

    public  int printPages(int pages){
        int pagesToPrint = pages;
        if(duplex){
            pagesToPrint = (pagesToPrint/2)+(pagesToPrint%2);

        }
        pagesPrinted+=pagesToPrint;
        return pagesToPrint;
    }

    public  int getPagesPrinted(){
        return pagesPrinted;
    }

    public Printer(int tonerLevel, boolean duplex) {
       if(tonerLevel>=0 && tonerLevel<=100) {
           this.tonerLevel = tonerLevel;
       }
        this.duplex = duplex;
    }
}
