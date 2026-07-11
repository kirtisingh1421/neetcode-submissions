class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int fr = 0; int lr = m-1;
        int fc = 0; int lc = n-1;
        while(fr <= lr && fc <= lc){
            //right.
            for(int j=fc;j<=lc;j++){
                ans.add(matrix[fr][j]);
            }
            fr++;
            if(fr > lr || fc > lc) break;
            //down.
            for(int i=fr;i<=lr;i++){
                ans.add(matrix[i][lc]);
            }
            lc--;
            if(fr > lr || fc > lc) break;
            //left.
            for(int j=lc;j>=fc;j--){
                ans.add(matrix[lr][j]);
            }
            lr--;
            if(fr > lr || fc > lc) break;
            //up.
            for(int i=lr;i>=fr;i--){
                ans.add(matrix[i][fc]);
            }
            fc++;
        }
        return ans;
    }
}
