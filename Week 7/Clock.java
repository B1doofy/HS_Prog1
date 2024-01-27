public class Clock {
    int hour;
    boolean modeAMPM;
    boolean summerTime;

    public Clock(){
        this.hour = 1;
        this.modeAMPM = false;
        this.summerTime = false;
    }
    
    public void tick(){
        this.hour++;
        if(this.hour == 24){
            this. hour = 0;
        }
    }

    public void switchMode(){
        if(this.modeAMPM == true){
            this.modeAMPM = false;
        }
        else{
            this.modeAMPM = true;
        }
    }

    public void switchToSummertime(){
        this.summerTime = true;
    }

    public void switchToWintertime(){
        this.summerTime = false;
    }

    public void print(){
        int zeit = this.hour;

        if(this.summerTime == false){
            zeit--;
            if(zeit == -1){
                zeit = 23;
            }
        }

        if(modeAMPM == true){
            if(zeit >= 12){
                if(zeit>12){
                    zeit = zeit - 12;
                }
                System.out.println("Es ist " + zeit + " pm.");
            }
            else{
                if(zeit == 0){
                    System.out.println("Es ist 12 am.");
                }
                System.out.println("Es ist "+ zeit+ " am.");
            }
        }
        else{
            System.out.println("Es ist " + zeit + " Uhr.");
        }
    }
}
