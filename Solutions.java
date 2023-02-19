public class Solutions {
    //max3
    public static int max3(int a, int b, int c){
        int largest = 0;
        
        if(a>b){
            largest = a;
        }else{
            largest =b;
        }
        if(largest<c){
            largest = c;
        }
        return largest;
    }
    //This is for max3 overloaded
    // NB: "overloaded" means it has the same name
    public static double max3(double a, double b, double c){
        double largest = 0;
        if(a>b){
            largest = a;
        }else{
            largest =b;
        }
        if(largest<c){
            largest = c;
        }
        return largest;
    }

    public static boolean odd(Boolean a, Boolean b, Boolean c){
        boolean num=true;
        int tof = 0;
        if(a==num){
            tof += 1;
        }
        if(b==num){
            tof += 1;
        }
        if(c==num){
            tof += 1;
        }
        if((tof%2)==1){
            return true;
        }else{
            return false;
        }

    }
    //testing \/
    public static boolean majority(boolean a, boolean b, boolean c){
        int maj = 0;
        boolean num=true;
        if(a==num){
            maj += 1;
        }
        if(b==num){
            maj += 1;
        }
        if(c==num){
            maj += 1;
        }
        if(maj>=2){
            return true;
        }else{
            return false;
        }
    }

    public static double trigIdentity(double x){
        //sin^2(`x`) + cos^2(`x`)
        // BUG: this is not sin^2 (x), it's actually sin(sqrt(x))
        double sin1 = Math.sin( Math.sqrt(x)); 
        double cos1 = Math.cos(Math.sqrt(x));
        double ans = sin1 +cos1;
        return ans;
    }


    public static void main(String[] args) {
       System.out.println(max3(0,9,0));
       System.out.println(odd(true, true, true));
       System.out.println(majority(true, false, true));
       System.out.println(trigIdentity(2));
    }
}

// javac Solutions.java; java Solutions