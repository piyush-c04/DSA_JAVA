public class GainAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int ng = gain.length;
        int[] points = new int[ng+1];
        int np = points.length;
        points[0] = 0;
        for (int i = 1; i <= ng; i++) {
            points[i] =points[i-1]+gain[i-1];
        }
        for (int i = 0; i < np; i++) {
            System.out.println(points[i]);
        }
        int max = 0;
        for(int nums : points)
        {
            if(nums>max)
            {
                max = nums;
            }
        }
        System.out.println("Max is : "+max);

    }
}
