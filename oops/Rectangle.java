package Java;
        class Rectangle{
            public double length, breadth;
            public double area(){
                return length*breadth;
            }
        }
        class Cuboid extends Rectangle{
            public int height;
            public double volume(){
                return area()*height;
            }
        }
        public class Main{
            public static void main(String[] args){
                Cuboid cuboid = new Cuboid();
                cuboid.length=10;
                cuboid.breadth=20;
                cuboid.height=30;
            }