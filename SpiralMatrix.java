public class SpriralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
            int left, right, top, bottom;
            left = 0;
            right = matrix[0].length - 1;
            top = 0;
            bottom = matrix.length - 1;
            ArrayList<Integer> list = new ArrayList<>();
            while(top<=bottom && left<=right){
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i]);
                list.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right]);
                list.add(matrix[i][right]);
            }
            right--;
            
            if(top<=bottom)
            {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i]);
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
                if(left<=right)
                {
                    for (int i = bottom; i >= top; i--) {
                        System.out.print(matrix[i][left]);
                        list.add(matrix[i][left]);
                    }
                    left++;
                }

        }
                    return list;
    }
}

