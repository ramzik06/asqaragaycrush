import java.util.ArrayList;

public class Shape {
    ArrayList<Point> RamazanOrazaly = new ArrayList<>();


    //addPoint to array
    public void addPoint(Point pointThatIWantToAdd) {
        RamazanOrazaly.add(pointThatIWantToAdd);
    }

    public double calculatePerimeter(){
        double calc  =0;
        for(int i =1;i<RamazanOrazaly.size();i++) {
            calc += RamazanOrazaly.get(i).distance(RamazanOrazaly.get(i-1));
        }
        calc += RamazanOrazaly.get(RamazanOrazaly.size()-1).distance(RamazanOrazaly.get(0));

        return calc;
    }

    public double getAverageSide(){
        return calculatePerimeter()/RamazanOrazaly.size();
    }

    public double getLongestSide(){
        double mx = -9999;
        for(int i=1;i<RamazanOrazaly.size();i++) {
            double dist = RamazanOrazaly.get(i).distance(RamazanOrazaly.get(i-1));

            mx = Math.max(mx , dist);
        }

        mx = Math.max(mx , RamazanOrazaly.get(RamazanOrazaly.size()-1).distance(RamazanOrazaly.get(0)));
        return mx;
    }


}








// container of Points (e.g. ArrayList<Point>)

// addPoint(Point) - adds to the container

// calculatePerimeter()

// getAverageSide()

// getLongestSide()