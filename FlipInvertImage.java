package Arrays;

public class FlipInvertImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] flip = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            int k=0;
            for (int j = image[0].length-1; j >= 0; j--) {
                if(image[i][j] == 1)
                {
                    flip[i][k++]= 0 ;
                }
                else{
                    flip[i][k++] =1;
                }
            }
        }
        for (int i = 0; i < flip.length; i++) {
            for (int j = 0; j < flip[0].length; j++) {
                System.out.print(flip[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
