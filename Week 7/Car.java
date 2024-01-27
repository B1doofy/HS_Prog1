public class Car {

    int currentSpeed;
    int topSpeed;
    String direction;

    public Car(int topSpeed){
        this.currentSpeed = 50;
        this.direction = "Nord";

        if(topSpeed <50){
            this.topSpeed = 50;
        }
        else{
            this.topSpeed = topSpeed;
        }
    }

    public void speedup(){
        this.currentSpeed += 10;
        if(this.currentSpeed > this.topSpeed){
            this.currentSpeed = this.topSpeed;
        }
    }

    public void turnLeft(){
        switch (direction) {
            case "Nord":
                direction = "West";
                break;
            case "West":
                direction = "Süd";
                break;
            case "Süd":
                direction = "Osten";
                break;
            case "Osten":
                direction = "Nord";
                break;
        }
    }

    public void turnRight(){
        switch (direction) {
            case "Nord":
                direction = "Osten";
                break;
            case "West":
                direction = "Nord";
                break;
            case "Süd":
                direction = "Westen";
                break;
            case "Osten":
                direction = "Süd";
                break;
        }
    }
    public String toString() {
        return String.format("Auto fährt mit Geschwindigkeit "+this.currentSpeed+" in Richtung "+this.direction);
      }

    
}
