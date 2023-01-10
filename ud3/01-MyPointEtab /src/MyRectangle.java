public class MyRectangle{
    MyPoint topLeft, botRight;

    public MyRectangle(MyPoint p1, MyPoint p2){
        float left, right, top, bot;
        if(p1.x - p2.x <= 0){
            left = p1.x;
            right = p2.x;

            if(p1.y - p2.y <= 0){
                bot = p1.y;
                top = p2.y;
                this.botRight = new MyPoint(right, bot);
                this.topLeft = new MyPoint(left, top);
            }
            else{
                bot = p2.y;
                top = p1.y;
                this.botRight = new MyPoint(right, bot);
                this.topLeft = new MyPoint(left, top);
            }
        }
        else{
            left = p2.x;
            right = p2.x;

            if(p1.y - p2.y <= 0){
                bot = p1.y;
                top = p2.y;
                this.botRight = new MyPoint(right, bot);
                this.topLeft = new MyPoint(left, top);
            }
            else{
                bot = p2.y;
                top = p1.y;
                this.botRight = new MyPoint(right, bot);
                this.topLeft = new MyPoint(left, top);
            }
        }
    }


    public double getArea(){
        double length = this.botRight.x - this.topLeft.x;
        double height = this.topLeft.y - this.botRight.y;

        return length * height;
    }

    public double getPerimetre(){
        double length = this.botRight.x - this.topLeft.x;
        double height = this.topLeft.y - this.botRight.y;

        return (length * 2) + (height * 2);
    }

    public String toString(){
        return "(" + "[" + this.topLeft.x + ", " + this.topLeft.y + "], [" + this.botRight.x + ", " + this.botRight.y + "])";  
    }



    //Getters and setters

    public MyPoint getBotRight() {
        return botRight;
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setBotRight(MyPoint botRight) {
        this.botRight = botRight;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }
}
